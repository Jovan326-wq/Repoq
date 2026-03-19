package com.example._2101;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Math.*;


public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1, scene2, scene3;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Практ. раб. 3");
        primaryStage.show();
    }

    private Scene createScene1() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите 2-хзначное число");
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
        Button ex3btn = new Button("3");
        ex3btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene3);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            double aa = (int) (a / 10) + (int) (a % 10);
            if (aa % 2 == 0) {
                resLabel.setText("Да");
            } else {
                resLabel.setText("Нет");
            }
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, sideA, calcbtn, resLabel, clearbtn, root1);
        return new Scene(main, 400, 400);
    }

    private Scene createScene2() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите первое число");
        TextField sideB = new TextField();
        sideB.setPromptText("Введите второе число");
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
        Button ex3btn = new Button("3");
        ex3btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene3);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            sideB.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Integer.parseInt(sideA.getText());
            double b = Integer.parseInt(sideB.getText());
            if (a < b) {
                resLabel.setText("Порядковый номер: 1");
            } else {
                resLabel.setText("Порядковый номер: 2");
            }
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, sideA, sideB, calcbtn, resLabel, clearbtn, root1);
        return new Scene(main, 400, 400);
    }

    private Scene createScene3() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        TextField sideB = new TextField();
        sideB.setPromptText("Введите число");
        TextField sideC = new TextField();
        sideC.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 3");

        Button ex1btn = new Button("1");
        ex1btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene1);
        });
        Button ex2btn = new Button("2");
        ex2btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene2);
        });
        Button ex3btn = new Button("3");
        ex3btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene3);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            sideB.setText("");
            sideC.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            double b = Double.parseDouble(sideB.getText());
            double c = Double.parseDouble(sideC.getText());
            if (a < b && b < c) {
                resLabel.setText("Результат: " + b);
            } else if (b < a && a < c) {
                resLabel.setText("Результат: " + a);
            } else {
                resLabel.setText("Результат: " + c);
            }
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, sideA, sideB, sideC, calcbtn, resLabel, clearbtn, root1);

        return new Scene(main, 400, 400);
    }
}
