package App_RBA_Office.Java_Ct;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;

import static java.lang.System.exit;

public class Rahul_Baradols_Application_Office_Professional_Ct implements Initializable {

    @FXML
    private StackPane main;

    @FXML
    private MenuItem about;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        main.setOpacity(0);

        FadeTransition ft = new FadeTransition(Duration.seconds(2), main);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();
    }

    public void File_Reader() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/File_Reader/File_Reader.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("File Reader");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Standard_Text_Editor() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Standard_Text_Editor/Standard_Text_Editor.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Standard Text Editor");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Standard_Digital_Clock() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Standard_Digital_Clock/Standard_Digital_Clock.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Standard Digital Clock");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Standard_Calculator_1() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Standard_Calculator/V_1/Calculator.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Standard Calculator");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Standard_Calculator_1_1() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Standard_Calculator/V_1_1/Welcome.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Standard Calculator");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Standard_Folder_File_Maker_1() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Standard_Folder_File_Maker/V_1/Folder_File_Maker.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Standard Folder File Maker");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Standard_Folder_File_Maker_2() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Standard_Folder_File_Maker/V_2/Folder_File_Maker.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Standard Folder File Maker");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Table_Detector_1() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Table_Detector/V_1/FXML_Files/Welcome.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Table Detector");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Table_Detector_2() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Table_Detector/V_2/FXML_Files/Welcome.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Table Detector");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Age_Calculator() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Age_Calculator/FXML_Files/Welcome.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Age Calculator");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Standard_Calculator_Professional() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Standard_Calculator_Professional/FXML_Files/Welcome.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Standard Calculator - Professional");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void Standard_Quick_Calculator() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Standard_Quick_Calculator/FXML_Files/Standard_Quick_Calculator.fxml"));
        Scene sc = new Scene(loader.load());

        stage.setTitle("Standard Quick Calculator");
        stage.setScene(sc);
        stage.setResizable(false);
        stage.show();
    }

    public void mid_Screen_Mode() {
        Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION);
        confirmation.setTitle("RBA Office - Professional");
        confirmation.setHeaderText(null);
        confirmation.setContentText("Are you sure, you want to switch to Mid Screen mode?\n(Note - You must have at least 1000 x 670 size screen to use the Mid Screen mode properly)");

        ButtonType yes = new ButtonType("Yes");
        ButtonType no = new ButtonType("No");
        confirmation.getButtonTypes().setAll(yes, no);

        Optional<ButtonType> confirmationOptional = confirmation.showAndWait();

        if (confirmationOptional.get() == yes) {
            main.setDisable(true);

            FadeTransition ft = new FadeTransition(Duration.seconds(2), main);
            ft.setFromValue(1);
            ft.setToValue(0);

            ft.setOnFinished(event -> {
                try {
                    Stage stage = (Stage) main.getScene().getWindow();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/App_RBA_Office/FXML_Files/Rahul_Baradols_Application_Office_Professional_Mid_Screen.fxml"));
                    Scene sc = new Scene(loader.load());

                    stage.setTitle("Rahul Baradol's Application Office - Professional");
                    stage.setScene(sc);
                    stage.setResizable(false);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            ft.play();
        }
    }

    public void IA_Mode() {
        Random random = new Random();
        String[] letters = {"A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o",
                "P", "p", "Q", "r", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"};

        String random_letters = letters[random.nextInt(52)] + letters[random.nextInt(52)] + letters[random.nextInt(52)] +
                letters[random.nextInt(52)] + letters[random.nextInt(52)] + letters[random.nextInt(52)];

        TextInputDialog tid = new TextInputDialog();
        tid.setTitle("RBA Office - IA Mode - Confirmation");
        tid.setContentText("Enter this code to login to IA(Information Accessing) Mode: " + random_letters);

        Optional<String> op_string = tid.showAndWait();

        try {
            if (op_string.get().equals(random_letters)) {
                try {
                    Stage stage = new Stage();
                    Scene sc = new Scene(FXMLLoader.load(getClass().getResource("/App_RBA_Office/IA_Mode/IA_Mode.fxml")));

                    stage.setTitle("RBA Office - IA Mode");
                    stage.setScene(sc);
                    stage.setResizable(false);
                    stage.show();
                } catch (Exception ep) {
                    Alert error = new Alert(Alert.AlertType.ERROR);
                    error.setTitle("RBA Office");
                    error.setContentText("Error loading the file. \nCould not find the file.");
                    error.showAndWait();
                }
            } else {
                Alert error = new Alert(Alert.AlertType.ERROR);

                error.setTitle("RBA Office - Professional - IA Mode - Confirmation");
                error.setHeaderText(null);
                error.setContentText("Wrong code");
                error.showAndWait();
            }
        } catch (RuntimeException re) {
            // Nothing happens here
        }
    }

    public void IA_Mode_KeyBoard(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case I:
                Random random = new Random();
                String[] letters = {"A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o",
                        "P", "p", "Q", "r", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"};

                String random_letters = letters[random.nextInt(52)] + letters[random.nextInt(52)] + letters[random.nextInt(52)] +
                        letters[random.nextInt(52)] + letters[random.nextInt(52)] + letters[random.nextInt(52)];

                TextInputDialog tid = new TextInputDialog();
                tid.setTitle("RBA Office - IA Mode - Confirmation");
                tid.setContentText("Enter this code to login to IA(Information Accessing) Mode: " + random_letters);

                Optional<String> op_string = tid.showAndWait();

                try {
                    if (op_string.get().equals(random_letters)) {
                        try {
                            Stage stage = new Stage();
                            Scene sc = new Scene(FXMLLoader.load(getClass().getResource("/App_RBA_Office/IA_Mode/IA_Mode.fxml")));

                            stage.setTitle("RBA Office - IA Mode");
                            stage.setScene(sc);
                            stage.setResizable(false);
                            stage.show();
                        } catch (Exception ep) {
                            Alert error = new Alert(Alert.AlertType.ERROR);
                            error.setTitle("RBA Office");
                            error.setContentText("Error loading the file. \nCould not find the file.");
                            error.showAndWait();
                        }
                    } else {
                        Alert error = new Alert(Alert.AlertType.ERROR);

                        error.setTitle("RBA Office - Professional - IA Mode - Confirmation");
                        error.setHeaderText(null);
                        error.setContentText("Wrong code");
                        error.showAndWait();
                    }
                } catch (RuntimeException re) {
                    // Nothing happens here
                }
                break;
        }
    }

    public void about() {
        about.setDisable(true);

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