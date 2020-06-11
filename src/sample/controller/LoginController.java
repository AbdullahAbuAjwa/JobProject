package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.model.Navigation;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    Navigation navigation = new Navigation();

    @FXML
    public AnchorPane root;
    @FXML
    public TextField username;
    @FXML
    public TextField password;
    @FXML
    public Button bt_login;
    @FXML
    public Button bt_new_account;
    @FXML
    public RadioButton rb_std, rb_comp;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void create_new_account(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_create_account);
    }

    public void login(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_profile_student);
        //    navigation.navTo(root, navigation.move_to_profile_company);
    }

}
