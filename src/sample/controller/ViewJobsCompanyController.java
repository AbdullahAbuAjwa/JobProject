package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import sample.model.Navigation;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewJobsCompanyController implements Initializable {
    @FXML
    public ComboBox comb_categ;
    @FXML
    public TextField tf_search;
    @FXML
    public Button bt_profile;
    @FXML
    public ListView listview;
    @FXML
    public Label name;
    Navigation navigation = new Navigation();
    @FXML
    public AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void addJob(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_add_job);
    }

    public void search(ActionEvent actionEvent) {
    }

    public void showProfile(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_profile_company);
    }

    public void showCateg(ActionEvent actionEvent) {
    }
}
