module com.mycompany.myapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.myapp to javafx.fxml;
    exports com.mycompany.myapp;
}
