package com.example._2901;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller2 {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnReturn;

    @FXML
    public void initialize() {
        btn1.setOnAction(event -> {
            if (HelloApplication.Global.dataLOG == false) {
                try {
                    switchtopage3(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Информация: ");
                alert.setHeaderText("LOG IN...");
                alert.setContentText("Вы уже авторизованны!\nВаш email: "
                        + HelloApplication.Global.dataEmail + "\nВаш пароль: "
                        + HelloApplication.Global.dataPassword +
                        "\nЧтобы выйти из аккаунта нажмите кнопку Logout!");
                alert.show();
            }
        });
        btn2.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Информация: ");
            alert.setHeaderText("Недоступно!!!");
            alert.setContentText("Работа выполнена на оценку 3!!!");
            alert.show();

        });
        btnReturn.setOnAction(event -> {
            try {
                switchtopage1(event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        btnLogout.setOnAction(event -> {
            Logout(event);
        });
        btnLogin.setOnAction(event -> {
            try {
                switchtopage2(event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @FXML
    private void switchtopage1(ActionEvent event) throws IOException {
        loadFXML("1.fxml", event);
    }

    @FXML
    private void switchtopage2(ActionEvent event) throws IOException {
        loadFXML("2.fxml", event);
    }

    @FXML
    private void switchtopage3(ActionEvent event) throws IOException {
        loadFXML("3.fxml", event);
    }

    private void loadFXML(String fxmlFile, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
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
