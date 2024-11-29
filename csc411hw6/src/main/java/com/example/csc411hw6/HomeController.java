package com.example.csc411hw6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    // Fix the method signature by adding ActionEvent event
    @FXML
    private void LogInbutton(ActionEvent event) {  // <- Add ActionEvent here
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
            Parent newPane = loader.load();

            // Get the current stage from the button
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(newPane));
            stage.setTitle("Log In - CSC411 Fall 2024");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void SignUpbutton(ActionEvent event) {
        HelloApplication.switchScene("SignUp.fxml");
    }
}
