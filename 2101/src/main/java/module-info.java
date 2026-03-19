module com.example._2101 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2101 to javafx.fxml;
    exports com.example._2101;
}