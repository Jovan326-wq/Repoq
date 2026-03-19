package com.example._2401;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Math.abs;

public class Controller2 {

    @FXML
    private Button calcbtn;

    @FXML
    private Button clearbtn;

    @FXML
    private Button ex1btn;

    @FXML
    private Button ex2btn;

    @FXML
    private Button ex3btn;

    @FXML
    private Label resLabel;

    @FXML
    private TextField sideA;

    @FXML
    private TextField sideB;

    @FXML
    private TextField sideC;

    @FXML
    private void initialize() {
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
        ex1btn.setOnAction(event -> {
            try {
                switchToTask1(event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        ex2btn.setOnAction(event -> {
            try {
                switchToTask2(event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        ex3btn.setOnAction(event -> {
            try {
                switchToTask3(event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    @FXML
    private void switchToTask1(ActionEvent event) throws IOException {
        loadFXML("1.fxml", event);
    }

    @FXML
    private void switchToTask2(ActionEvent event) throws IOException {
        loadFXML("2.fxml", event);
    }

    @FXML
    private void switchToTask3(ActionEvent event) throws IOException {
        loadFXML("3.fxml", event);
    }

    private void loadFXML(String fxmlFile, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,640,480));
    }


}
