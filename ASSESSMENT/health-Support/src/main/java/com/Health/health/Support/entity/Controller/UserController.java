package com.Health.health.Support.entity.Controller;

import javax.naming.AuthenticationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Health.health.Support.entity.User;
import com.Health.health.Support.entity.Service.UserService;
@Controller
@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<String> registerUser(@Valid @RequestBody User user) {
	    try {
	        User registeredUser = userService.saveUser(user);
	        return ResponseEntity.ok("User created with ID: " + registeredUser.getId());
	    } catch (IllegalArgumentException e) {
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
	    }
	}

	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody User user) throws AuthenticationException {
	    try {
	        // Validate the user's credentials and perform authentication logic
	        // ...

	        // Return a response indicating successful login
	        return ResponseEntity.ok("Login successful");
	    } catch (Exception e) {
	        // Return a response for any other error
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
	    }
	}

}
