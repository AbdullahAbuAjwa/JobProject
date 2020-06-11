package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import sample.model.Navigation;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewJobsController implements Initializable {
    Navigation navigation = new Navigation();
    @FXML
    public AnchorPane root;

    @FXML
    public ListView listview;
    @FXML
    public ComboBox comb_categ;
    @FXML
    public Button bt_profile, bt_notif;
    @FXML
    public TextField ft_search;
    @FXML
    public Label name;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void show_categories(ActionEvent actionEvent) {
    }

    public void showProfile(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_profile_student);
    }


    public void showNotification(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_std_notification);
    }

    public void search(ActionEvent actionEvent) {
    }
}
