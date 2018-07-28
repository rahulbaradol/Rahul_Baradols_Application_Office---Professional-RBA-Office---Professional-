package App_RBA_Office.Java_Ct;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import static java.lang.System.exit;

public class Rahul_Baradols_Application_Office_Ct implements Initializable {

    @FXML
    private StackPane main;

    @FXML
    private MenuItem full_Screen_Mode, ia_Mode, about, close;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        main.setOpacity(0);

        FadeTransition ft = new FadeTransition(Duration.seconds(2), main);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();
    }

    public void fullScreenMode() {

    }

    public void IA_Mode() {

    }

    public void about() {
        FadeTransition ft = new FadeTransition(Duration.seconds(2), main);
        ft.setFromValue(1);
        ft.setToValue(0);

        ft.setOnFinished(event -> {
            try {
                Stage stage = (Stage) main.getScene().getWindow();
                Scene sc = new Scene(FXMLLoader.load(getClass().getResource("/App_RBA_Office/FXML_Files/About.fxml")));

                stage.setTitle("RBA Office - About");
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

    public void close() {
        Alert exit = new Alert(Alert.AlertType.CONFIRMATION);

        exit.setTitle("RBA Office");
        exit.setHeaderText(null);
        exit.setContentText("Are you sure, you want to exit?");

        ButtonType yes = new ButtonType("Yes");
        ButtonType no = new ButtonType("No");

        exit.getButtonTypes().setAll(yes, no);

        Optional<ButtonType> op = exit.showAndWait();

        if (op.get() == yes) {
            Alert bye = new Alert(Alert.AlertType.INFORMATION);
            bye.setTitle("RBA Office - Professional");
            bye.setHeaderText(null);
            bye.setContentText("THANKS for using Rahul Baradol's Application Office - Professional!! Good bye. See you soon.");
            bye.showAndWait();

            exit(0);
        }
    }

}