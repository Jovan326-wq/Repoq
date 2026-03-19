package com.example._2301_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.abs;
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
    private TextField sideB;

    @FXML
    private TextField sideC;

    @FXML
    private void initialize() {
        clearbtn.setOnAction(event -> {
            sideA.setText("");
            sideB.setText("");
            sideC.setText("");
            resLabel.setText("");
        });
        calcbtn.setOnAction(event -> {
            double a = Double.parseDouble(sideA.getText());
            double c = Double.parseDouble(sideC.getText());
            double b = Double.parseDouble(sideB.getText());
            double ac = abs(a - c);
            double bc = abs(b - c);
            double res = ac * bc;
            resLabel.setText("Результат: " + res);
        });
    }

}
