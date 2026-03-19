module com.example._2001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2001 to javafx.fxml;
    exports com.example._2001;
}