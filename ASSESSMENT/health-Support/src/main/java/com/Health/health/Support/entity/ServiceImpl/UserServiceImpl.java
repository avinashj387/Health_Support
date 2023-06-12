package com.Health.health.Support.entity.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.health.Support.entity.User;
import com.Health.health.Support.entity.Repository.UserRepository;
import com.Health.health.Support.entity.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        // Perform validation checks
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }

        if (user.getAge() <= 60) {
            throw new IllegalArgumentException("Age must be sixty above");
        }

        // Additional validation checks can be added as needed

        // Save the user
        return userRepository.save(user);
    }

    @Override
    public User authenticateUser(String name, String password) {
        User user = userRepository.findByName(name);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public User findUserByEmailId(String emailId) {
        User user = userRepository.findByEmailId(emailId);
        return user;
    }

    @Override
    public void addToken(long id, String token) {
        Optional<User> user = userRepository.findById(id);
        User u = user.get();
        u.setToken(token);
        userRepository.save(u);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
