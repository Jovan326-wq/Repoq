package com.example._2901;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Практика (2901), на оценку 3");
        stage.setScene(scene);
        stage.show();
    }

    public static class Global {
        public static String dataEmail = "";
        public static String dataPassword = "";
        public static Boolean dataLOG = false;
    }

    public static class GlobalRegister {
        public static String dataEmail = "";
        public static String dataPassword = "";
        public static String dataName = "";
        public static String dataSurname = "";
        public static String dataGender = "";
        public static String dataURLPhoto = "";
        public static String dataBirthday = "";
        public static String dataCountry = "";
        public static Boolean dataREG = false;
    }

    public static class Payment {
        public static int Pay = 0;
    }
}

