package poeTracker.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poeTracker.demo.dto.UserDTO;
import poeTracker.demo.services.UserService;

@RestController
@RequestMapping("/api")
public class FormController {

    private final UserService userService;

    public FormController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Service is up and running");
    }

    @PostMapping("/saveuser")
    public ResponseEntity<String> saveUser(@RequestBody UserDTO userDTO) {
        String responseMessage = userService.saveUser(userDTO.getUserName(), userDTO.getUserEmail(), userDTO.getUserPassword());
        return ResponseEntity.ok().body(responseMessage);
    }
}


//package poeTracker.demo.controller;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import poeTracker.demo.services.UserService;
//
//
//@RestController
//@RequestMapping("/api")
//public class FormController {
//
//    private final UserService userService;
//
//
//    public FormController(UserService userService){
//        this.userService = userService;
//    }
//
//
//    @GetMapping("/health")
//    public ResponseEntity<String> healthCheck() {
//        return ResponseEntity.ok("Service is up and running");
//    }
//
//    @PostMapping("/saveuser")
//    public ResponseEntity<String> saveUser(@RequestBody String userName, String userEmail, String userPassword) {
//        return ResponseEntity.ok().body(userService.saveUser(userName, userEmail, userPassword));
//    }
//
//
//}