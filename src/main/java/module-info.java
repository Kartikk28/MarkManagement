module com.example.MarkManagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.MarkManagement to javafx.fxml;
    exports com.example.MarkManagement;
}