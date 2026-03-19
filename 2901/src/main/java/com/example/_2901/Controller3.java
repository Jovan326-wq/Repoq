package com.example._2901;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller3 {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnReturn;

    @FXML
    private TextField etEmail;

    @FXML
    private PasswordField etPassword;

    @FXML
    public void initialize() {
        btnLogin.setOnAction(event -> {
            Login(event);
        });
        btnCancel.setOnAction(event -> {
            etEmail.setText("");
            etPassword.setText("");
        });
        btnReturn.setOnAction(event -> {
            try {
                switchtopage2(event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        btnLogout.setOnAction(event -> {
            Logout(event);
        });
    }

    @FXML
    private void switchtopage2(ActionEvent event) throws IOException {
        loadFXML("2.fxml", event);
    }


    private void loadFXML(String fxmlFile, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void Login(ActionEvent event) {
        if (etEmail.getText().isBlank()) {
            etEmail.setStyle("-fx-prompt-text-fill: red;");
        } else if (etPassword.getText().isBlank()) {
            etPassword.setStyle("-fx-prompt-text-fill: red;");
        } else {
            if (HelloApplication.Global.dataLOG == false) {
                HelloApplication.Global.dataEmail = etEmail.getText();
                HelloApplication.Global.dataPassword = etPassword.getText();
                etEmail.setText("");
                etPassword.setText("");
                HelloApplication.Global.dataLOG = true;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Информация: ");
                alert.setHeaderText("LOG IN...");
                alert.setContentText("Вы успешно авторизовались!\nВаш email: "
                        + HelloApplication.Global.dataEmail + "\nВаш пароль: "
                        + HelloApplication.Global.dataPassword);
                alert.show();
                HelloApplication.Global.dataLOG = true;
            } else {
                etEmail.setStyle("");
                etPassword.setStyle("");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Информация: ");
                alert.setHeaderText("LOG IN...");
                alert.setContentText("Вы уже авторизованны!\nВаш email: "
                        + HelloApplication.Global.dataEmail + "\nВаш пароль: "
                        + HelloApplication.Global.dataPassword +
                        "\nЧтобы выйти из аккаунта нажмите кнопку Logout!");
                alert.show();
            }
        }
    }

    @FXML
    private void Logout(ActionEvent event) {
        if (HelloApplication.Global.dataLOG == false && HelloApplication.GlobalRegister.dataREG == false) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Информация: ");
            alert.setHeaderText("LOGOUT...");
            alert.setContentText("Вы не зарегистрировались или не авторизованны!");
            alert.show();
        } else {
            HelloApplication.Global.dataEmail = "";
            HelloApplication.Global.dataPassword = "";
            HelloApplication.GlobalRegister.dataEmail = "";
            HelloApplication.GlobalRegister.dataPassword = "";
            HelloApplication.GlobalRegister.dataName = "";
            HelloApplication.GlobalRegister.dataSurname = "";
            HelloApplication.GlobalRegister.dataGender = "";
            HelloApplication.GlobalRegister.dataURLPhoto = "";
            HelloApplication.GlobalRegister.dataBirthday = "";
            HelloApplication.GlobalRegister.dataCountry = "";
            HelloApplication.Global.dataLOG = false;
            HelloApplication.GlobalRegister.dataREG = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Информация: ");
            alert.setHeaderText("LOGOUT...");
            alert.setContentText("Logout...\nДля дальнейшего использования вам нужно \n" +
                    "снова авторизоваться или зарегистрироваться!");
            alert.show();
            try {
                switchtopage2(event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
