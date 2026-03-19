module com.example._2301 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2301 to javafx.fxml;
    exports com.example._2301;
}