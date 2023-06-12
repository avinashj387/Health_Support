package com.Health.health.Support.entity.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.Health.health.Support.entity.User;
import com.Health.health.Support.entity.Service.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> login(@RequestBody User loginUser) {
        // Implement login logic here
        // Check if the user credentials are valid
        // Authenticate the user
        // Generate and return a token or session ID

        // Example implementation:
    	System.out.println("in login controlller");
        User user = userService.authenticateUser(loginUser.getName(), loginUser.getPassword());
        if (user != null) {
        	System.out.println("inside controlller");
            // User authenticated successfully
            String token = generateToken(user.getId());
            // Redirect to the dashboard page
            RedirectView redirectView = new RedirectView("/dashboard.html");
            redirectView.setExposeModelAttributes(false);
            return ResponseEntity.status(HttpStatus.SEE_OTHER).header("Location", "/dashboard.html").body(token);
        } else {
        	System.out.println("in eroor login controlller");
            // Invalid credentials
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }

    private String generateToken(Long userId) {
        // Implement token generation logic here
        // Generate a unique token for the user session

        // Example implementation:
        String token = "your_token_generation_logic_here";
        return token;
    }
}
