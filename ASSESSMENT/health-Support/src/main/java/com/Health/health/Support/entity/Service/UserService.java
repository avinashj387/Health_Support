package com.Health.health.Support.entity.Service;

import com.Health.health.Support.entity.User;

public interface UserService {

    User registerUser(User user);


	User authenticateUser(String name, String password);


	User findUserByEmailId(String emailId);


	void addToken(long id, String token);


	User saveUser(User user);



}
