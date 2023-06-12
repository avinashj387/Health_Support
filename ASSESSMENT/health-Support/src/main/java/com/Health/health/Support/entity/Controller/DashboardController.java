package com.Health.health.Support.entity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard() {
        // Import the variable data from the outer scope
        String data = getDashboardData();

        // Render the dashboard page
        return "dashboard";
    }

    private String getDashboardData() {
        // Retrieve data for the dashboard
        return "This is some data";
    }
}



