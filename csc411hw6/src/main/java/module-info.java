module com.example.csc411hw6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.csc411hw6 to javafx.fxml;
    exports com.example.csc411hw6;
}