package App_RBA_Office.Java_Ct;

import com.jfoenix.controls.JFXButton;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class About_Mid_Screen implements Initializable {

    @FXML
    private StackPane about;

    @FXML
    private JFXButton back;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        about.setOpacity(0);

        FadeTransition ft = new FadeTransition(Duration.seconds(2), about);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();
    }

    public void Back() {
        back.setDisable(true);

        FadeTransition ft = new FadeTransition(Duration.seconds(2), about);
        ft.setFromValue(1);
        ft.setToValue(0);

        ft.setOnFinished(event -> {
            try {
                Stage stage = (Stage) about.getScene().getWindow();
                Scene sc = new Scene(FXMLLoader.load(getClass().getResource("/App_RBA_Office/FXML_Files/Rahul_Baradols_Application_Office_Professional_Mid_Screen.fxml")));

                stage.setTitle("RBA Office");
                stage.setScene(sc);
                stage.setResizable(false);
                stage.show();
            } catch (Exception ep) {
                Alert error = new Alert(Alert.AlertType.ERROR);

                error.setTitle("RBA Office");
                error.setContentText("Error loading the file. \nCould not find the file");
                error.showAndWait();
            }
        });

        ft.play();
    }

}