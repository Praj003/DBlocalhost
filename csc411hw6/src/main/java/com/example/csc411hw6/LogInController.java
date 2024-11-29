package com.example.csc411hw6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LogInController {

    @FXML
    private void goToHome(ActionEvent event) {
        HelloApplication.switchScene("Home.fxml");  // Switch to Home.fxml
    }

    @FXML
    private void logIn(ActionEvent event) {
        HelloApplication.switchScene("MainMenu.fxml");
    }
}
