module com.example._2201 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2201 to javafx.fxml;
    exports com.example._2201;
}