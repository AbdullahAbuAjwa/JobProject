package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import sample.model.Navigation;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileStudentController implements Initializable {

    Navigation navigation = new Navigation();
    @FXML
    public AnchorPane root;
    @FXML
    public Text tf_name, tf_username, tf_birthday, tf_email, tf_phone, tf_major, tf_category, tf_skill;
    @FXML
    public Button show_application, save;
    @FXML
    public TextField tf_desc, tf_name_project;
    @FXML
    public TableView table_project;
    @FXML
    public TableColumn name, desc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void insertProject(ActionEvent actionEvent) {
        tf_desc.setVisible(true);
        tf_name_project.setVisible(true);
        save.setVisible(true);
    }

    public void saveData(ActionEvent actionEvent) {
        tf_desc.setVisible(false);
        tf_name_project.setVisible(false);
        save.setVisible(false);
    }

    public void showApplications() {
        navigation.navTo(root, navigation.move_to_student_application);
    }

    public void Back() {
        navigation.navTo(root, navigation.move_to_view_jobs);
    }
}