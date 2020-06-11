package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import sample.model.Navigation;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileCompanyController implements Initializable {
    Navigation navigation = new Navigation();
    @FXML
    public AnchorPane root;
    @FXML
    public Text tf_name, tf_username, tf_phone, tf_email, ID, tf_category;
    @FXML
    public Button show_application;
    @FXML
    public ImageView img_view;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void Back(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_view_jobs_company);

    }

    public void showJobs(ActionEvent actionEvent) {
        navigation.navTo(root, navigation.move_to_view_jobs_company);
    }
}
