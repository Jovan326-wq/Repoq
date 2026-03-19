package com.example._2001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Stage primaryStage;
    private Scene scene1, scene2;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Практ. раб. 2");
        primaryStage.show();
    }

    private Scene createScene1() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите A > B");
        TextField sideB = new TextField();
        sideB.setPromptText("Введите B");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 1");

        Button ex1btn = new Button("1");
        ex1btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene1);
        });
        Button ex2btn = new Button("2");
        ex2btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene2);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            sideB.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            double b = Double.parseDouble(sideB.getText());
            double res = a % b;
            resLabel.setText("Результат: " + res);
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn);
        VBox main = new VBox(10, exLabel, sideA, sideB, calcbtn, resLabel, clearbtn, root1);
        return new Scene(main, 400, 400);

    }

    private Scene createScene2() {
        TextField sideN = new TextField();
        sideN.setPromptText("Введите N");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 2");

        Button ex1btn = new Button("1");
        ex1btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene1);
        });
        Button ex2btn = new Button("2");
        ex2btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene2);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideN.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double n = Double.parseDouble(sideN.getText());
            double res = n % 60;
            resLabel.setText("Результат: " + res);
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn);
        VBox main = new VBox(10, exLabel, sideN, calcbtn, resLabel, clearbtn, root1);
        return new Scene(main, 400, 400);
    }
}
