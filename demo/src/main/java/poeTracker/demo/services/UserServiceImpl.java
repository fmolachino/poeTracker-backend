package poeTracker.demo.services;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String saveUser(String userName, String userEmail, String userPassword) {
        // Implement the logic to save the user
        return "User: " + userName + " saved successfully";
    }
}

