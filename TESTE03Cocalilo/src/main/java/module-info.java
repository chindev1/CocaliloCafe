module com.example.teste03cocalilo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires com.jfoenix;


    opens com.example.teste03cocalilo to javafx.fxml;
    exports com.example.teste03cocalilo;
}