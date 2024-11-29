package com.example.csc411hw6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    private void logOut(ActionEvent event) {
        HelloApplication.switchScene("Home.fxml");
    }
}
