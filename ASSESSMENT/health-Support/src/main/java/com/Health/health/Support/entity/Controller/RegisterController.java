package com.Health.health.Support.entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Health.health.Support.entity.User;
import com.Health.health.Support.entity.Service.UserService;

@RestController
@RequestMapping("/register")
public class RegisterController {

	private final UserService userService;

	@Autowired
	public RegisterController(UserService userService) {
	    this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<String> registerUser(@RequestBody User user) {
	    try {
	        User registeredUser = userService.registerUser(user);
	        return ResponseEntity.ok("User created with ID: " + registeredUser.getId());
	    } catch (IllegalArgumentException e) {
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
	    }
	}

}
