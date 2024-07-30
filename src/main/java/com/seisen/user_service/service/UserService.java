package com.seisen.user_service.service;


import com.seisen.user_service.model.User;
import com.seisen.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public User register(User user) throws Exception {
        if (userRepository.findByLogin(user.getLogin()) != null) {
            throw new Exception("User already exists");
        }
        return userRepository.save(user);
    }

    public User getUserById(Long id) throws Exception {
        return userRepository.findById(id).orElseThrow(() -> new Exception("User not found"));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
