package com.example._2201;

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
    private Scene scene1, scene2, scene3;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        primaryStage.setScene(scene1);
        primaryStage.setTitle("2201");
        primaryStage.show();
    }

    private Scene createScene1() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число от 1 до 7");
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
            int a = Integer.parseInt(sideA.getText());
            switch (a) {
                case 1 -> resLabel.setText("Понедельник");
                case 2 -> resLabel.setText("Вторник");
                case 3 -> resLabel.setText("Среда");
                case 4 -> resLabel.setText("Четверг");
                case 5 -> resLabel.setText("Пятница");
                case 6 -> resLabel.setText("Суббота");
                case 7 -> resLabel.setText("Воскресенье");
            }
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, sideA, calcbtn, resLabel, clearbtn, root1);
        return new Scene(main, 400, 400);
    }

    private Scene createScene2() {
        TextField sideM = new TextField();
        sideM.setPromptText("Введите масть");
        TextField sideN = new TextField();
        sideN.setPromptText("Введите достоинство");
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
            sideN.setText("");
            sideM.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            int n = Integer.parseInt(sideN.getText());
            int m = Integer.parseInt(sideM.getText());
            String card = "";
            switch (n) {
                case 6 -> card += "шестёрка";
                case 7 -> card += "семёрка";
                case 8 -> card += "восьмёрка";
                case 9 -> card += "девятка";
                case 10 -> card += "десятка";
                case 11 -> card += "валет";
                case 12 -> card += "дама";
                case 13 -> card += "король";
                case 14 -> card += "туз";
            }
            card += " ";
            switch (m) {
                case 1 -> card += "пик";
                case 2 -> card += "треф";
                case 3 -> card += "бубен";
                case 4 -> card += "червей";
            }
            resLabel.setText(card);
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, sideN, sideM, calcbtn, resLabel, clearbtn, root1);
        return new Scene(main, 400, 400);
    }

    private Scene createScene3() {
        TextField sideN = new TextField();
        sideN.setPromptText("Введите число от 1 до 4");
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 3");
        Label task = new Label("1 — радиус R,\n2 — диаметр D = 2 ∙ R,\n3 — длина L = 2 ∙ π ∙ R,\n4 — площадь круга S = π ∙ R^2");

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
            sideN.setText("");
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            final double PI = 3.14;
            double val = Double.parseDouble(sideA.getText());
            int elNum = Integer.parseInt(sideN.getText());
            double R = 0;
            double D = 0;
            double L = 0;
            double S = 0;

            switch (elNum) {
                case 1:
                    R = val;
                    break;

                case 2:
                    D = val;
                    R = D / 2.0;
                    break;

                case 3:
                    L = val;
                    R = L / (2.0 * PI);
                    break;

                case 4:
                    S = val;
                    R = Math.sqrt(S / PI);
                    break;
            }
            D = 2.0 * R;
            L = 2.0 * PI * R;
            S = PI * R * R;
            resLabel.setText("1. Радиус R = " + R + "\n" +
                    "2. Диаметр D = " + D + "\n" +
                    "3. Длина окружности L = " + L + "\n" +
                    "4. Площадь круга S = " + S);
        });

        HBox root1 = new HBox(10, ex1btn, ex2btn, ex3btn);
        VBox main = new VBox(10, exLabel, task, sideN, sideA, calcbtn, resLabel, clearbtn, root1);

        return new Scene(main, 400, 400);
    }
}
