package com.example._1901;

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
        primaryStage.setTitle("1901");
        primaryStage.show();
    }

    private Scene createScene1() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите A");
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
            double v = pow(a, 3);
            double s = 6 * pow(a, 2);
            resLabel.setText("V = " + v + "\nS = " + s);
        });
        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, sideA, calcbtn, resLabel, clearbtn, root1);
        return new Scene(main, 400, 400);
    }

    private Scene createScene2() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите A");

        TextField sideB = new TextField();
        sideB.setPromptText("Введите C");

        TextField sideC = new TextField();
        sideC.setPromptText("Введите B");

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
            sideC.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            double c = Double.parseDouble(sideC.getText());
            double b = Double.parseDouble(sideB.getText());
            double ac = abs(a - c);
            double bc = abs(b - c);
            double res = ac * bc;
            resLabel.setText("Результат: " + res);
        });
        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, sideA, sideC, sideB, calcbtn, resLabel, clearbtn, root1);

        return new Scene(main, 400, 400);
    }

    private Scene createScene3() {
        TextField sideV = new TextField();
        sideV.setPromptText("Введите V");
        TextField sideU = new TextField();
        sideU.setPromptText("Введите U < V");
        TextField sideT1 = new TextField();
        sideT1.setPromptText("Введите T1");
        TextField sideT2 = new TextField();
        sideT2.setPromptText("Введите T2");
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
            sideV.setText("");
            sideU.setText("");
            sideT1.setText("");
            sideT2.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double v = Double.parseDouble(sideV.getText());
            double u = Double.parseDouble(sideU.getText());
            double t1 = Double.parseDouble(sideT1.getText());
            double t2 = Double.parseDouble(sideT2.getText());
            double s = t1 * v + t2 * (v - u);
            resLabel.setText("S = " + s);
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, sideV, sideU, sideT1, sideT2, calcbtn, resLabel, clearbtn, root1);

        return new Scene(main, 400, 400);
    }
}