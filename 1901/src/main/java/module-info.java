module com.example._1901 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._1901 to javafx.fxml;
    exports com.example._1901;
}