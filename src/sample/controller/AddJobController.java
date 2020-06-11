package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.model.Navigation;

import java.net.URL;
import java.util.ResourceBundle;

public class AddJobController implements Initializable {

    Navigation navigation = new Navigation();
    @FXML
    public AnchorPane root;
    @FXML
    public TextField tf_desc, tf_count, tf_name;
    @FXML
    public ComboBox comb_category;
    @FXML
    public Button bt_show_profile;
    @FXML
    public Label name_company;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void Add(ActionEvent actionEvent) {
    }

    public void Back(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_view_jobs_company);

    }

    public void showProfile(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_profile_company);

    }
}
