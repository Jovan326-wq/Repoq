module com.example._2401 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;


    opens com.example._2401 to javafx.fxml;
    exports com.example._2401;
}