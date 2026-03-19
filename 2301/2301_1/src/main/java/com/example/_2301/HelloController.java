package com.example._2301;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class HelloController {

    @FXML
    private Button calcbtn;

    @FXML
    private Button clearbtn;

    @FXML
    private Label resLabel;

    @FXML
    private TextField sideA;

    @FXML
    private void initialize() {
        clearbtn.setOnAction(event -> {
            sideA.setText("");
            resLabel.setText("");
        });
        calcbtn.setOnAction(event -> {
            double a = Double.parseDouble(sideA.getText());
            double v = pow(a, 3);
            double s = 6 * pow(a, 2);
            resLabel.setText("V = " + v + "\nS = " + s);
        });
    }
}

