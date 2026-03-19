package com.example._2601;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Controller2 {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private Button ex1btn;

    @FXML
    private Button ex2btn;

    @FXML
    private Button ex3btn;

    @FXML
    private TextField numberTextField;

    @FXML
    private void initialize() {

        OkButton.setOnAction(event -> {
            List<Integer> data = dataListView.getItems();
            int sum = 0;
            for (int i : data) {
                if (i % 6 == 0 && i % 10 == 4) {
                    sum += i;
                }
            }
            if (sum != 0) {
                answerLabel.setText(String.valueOf(sum));
                data.clear();
                dataListView.getItems().clear();
            } else {
                answerLabel.setText("Нет");
                data.clear();
                dataListView.getItems().clear();
            }
        });

        addButton.setOnAction(event -> {
            if (numberTextField.getText().isEmpty()) {
                return;
            }
            try {
                int n = Integer.parseInt(numberTextField.getText());
                dataListView.getItems().add(n);
            } catch (NumberFormatException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("err");
                alert.showAndWait();
            } finally {
                numberTextField.setText("");
            }
        });

        cancelButton.setOnAction(event -> {
            Platform.exit();
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlFile)));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 640, 480));
    }

}
