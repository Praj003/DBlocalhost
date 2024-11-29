package com.example.csc411hw6;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;


    // Method to validate email
    private boolean validEmail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    // Method to validate  password
    private boolean strongPassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!_*\\-])(?=\\S+$).{8,}$");
    }

    // Method to show alert
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    //  Sign Up button
    @FXML
    private void signUp(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        // Validate email
        if (!validEmail(email)) {
            showAlert("Invalid Email", "Please enter a valid email address.");
            return;
        }

        // Validate password
        if (!strongPassword(password)) {
            showAlert("Invalid Password", "Password must be at least 8 characters long, \ncontain at least one uppercase letter, one lowercase letter, \none digit, and one special character -+_!@#$%^&*");
            return;
        }

        // Confirm password check
        if (!password.equals(confirmPassword)) {
            showAlert("Password Mismatch", "Password and Confirm Password do not match.");
            return;
        }

        // save user data to the database
        System.out.println("Sign-up successful!");

        HelloApplication.switchScene("MainMenu.fxml");
    }

    @FXML
    private void goToHome(ActionEvent event) {
        HelloApplication.switchScene("Home.fxml");  // Switch to Home.fxml
    }
}