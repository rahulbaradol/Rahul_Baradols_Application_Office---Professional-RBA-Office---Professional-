package App_RBA_Office;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Rahul_Baradols_Application_Office_Professional_MC extends Application {

    @Override
    public void start(Stage ps) {
        try {
            Scene sc = new Scene(FXMLLoader.load(getClass().getResource("/App_RBA_Office/FXML_Files/Welcome.fxml")));
            sc.getStylesheets().setAll("/App_RBA_Office/Design/Design.css");

            ps.setTitle("Welcome to RBA Office - Professional");
            ps.setScene(sc);
            ps.setResizable(false);
            ps.show();
        } catch (Exception ep) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("RBA Office");
            error.setContentText("Error loading the file. \nCould not find the file");
            error.showAndWait();
        }
    }

    @Override
    public void stop() {
        Alert bye = new Alert(Alert.AlertType.INFORMATION);
        bye.setTitle("RBA Office - Professional");
        bye.setHeaderText(null);
        bye.setContentText("THANKS for using Rahul Baradol's Application Office - Professional!! Good bye. See you soon.");
        bye.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

}