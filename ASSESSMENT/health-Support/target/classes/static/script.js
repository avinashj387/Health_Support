/* script.js */

// Example JavaScript code

// Function to handle login form submission
function handleLoginSubmission(event) {
  event.preventDefault();

  // Get login form values
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;

  // Make API request to authenticate user
  fetch('/api/login', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ username, password }),
  })
    .then(response => response.json())
    .then(data => {
      // Handle login success response
      console.log('Login successful:', data);

      // Redirect to dashboard page
      window.location.href = '/dashboard.html';
    })
    .catch(error => {
      // Handle login error response
      console.error('Login failed:', error);
    });
}

// Function to handle registration form submission
function handleRegistrationSubmission(event) {
  event.preventDefault();

  // Get registration form values
  const name = document.getElementById('name').value;
  const email = document.getElementById('email').value;
  const password = document.getElementById('password').value;

  // Make API request to register user
  fetch('/api/register', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ name, email, password }),
  })
    .then(response => response.json())
    .then(data => {
      // Handle registration success response
      console.log('Registration successful:', data);

      // Redirect to login page
      window.location.href = '/login.html';
    })
    .catch(error => {
      // Handle registration error response
      console.error('Registration failed:', error);
    });
}

// Add event listeners to login and registration forms
const loginForm = document.getElementById('login-form');
loginForm.addEventListener('submit', handleLoginSubmission);

const registrationForm = document.getElementById('registration-form');
registrationForm.addEventListener('submit', handleRegistrationSubmission);
