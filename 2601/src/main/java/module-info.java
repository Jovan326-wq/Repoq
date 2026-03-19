module com.example._2601 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;


    opens com.example._2601 to javafx.fxml;
    exports com.example._2601;
}