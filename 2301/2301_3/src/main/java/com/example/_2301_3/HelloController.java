package com.example._2301_3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.abs;

public class HelloController {

    @FXML
    private Button calcbtn;

    @FXML
    private Button clearbtn;

    @FXML
    private Label resLabel;

    @FXML
    private TextField sideT1;

    @FXML
    private TextField sideT2;

    @FXML
    private TextField sideU;

    @FXML
    private TextField sideV;

    @FXML
    private void initialize() {
        clearbtn.setOnAction(event -> {
            sideV.setText("");
            sideU.setText("");
            sideT1.setText("");
            sideT2.setText("");
            resLabel.setText("");
        });
        calcbtn.setOnAction(event -> {
            double v = Double.parseDouble(sideV.getText());
            double u = Double.parseDouble(sideU.getText());
            double t1 = Double.parseDouble(sideT1.getText());
            double t2 = Double.parseDouble(sideT2.getText());
            double s = t1 * v + t2 * (v - u);
            resLabel.setText("S = " + s);
        });
    }

}
