package Standard_Quick_Calculator.Java_Cts;

import com.jfoenix.controls.JFXTextArea;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import static java.lang.System.exit;
import static javafx.scene.paint.Color.LIME;
import static javafx.scene.paint.Color.WHITE;

/**
 * @author Rahul Baradol
 * @since 14/9/2017
 */

public class Standard_Quick_Calculator implements Initializable {

    @FXML
    protected Label answer;

    @FXML
    private StackPane main;

    private double value1, value2;
    private String fn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FadeTransition ft = new FadeTransition(Duration.seconds(2), main);

        main.setOpacity(0);

        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();
    }

    public void Add() {
        try {
            value1 = Double.parseDouble(answer.getText());
            fn = "+";
            answer.setText("");
        } catch (Exception e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Standard Calculator");
            error.setContentText("Type a valid number");
            error.showAndWait();
        }
    }

    public void Subtract() {
        try {
            value1 = Double.parseDouble(answer.getText());
            fn = "-";
            answer.setText("");
        } catch (Exception e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Standard Calculator");
            error.setContentText("Type a valid number");
            error.showAndWait();
        }
    }

    public void Multiply() {
        try {
            value1 = Double.parseDouble(answer.getText());
            fn = "*";
            answer.setText("");
        } catch (Exception e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Standard Calculator");
            error.setContentText("Type a valid number");
            error.showAndWait();
        }
    }

    public void Divide() {
        try {
            value1 = Double.parseDouble(answer.getText());
            fn = "/";
            answer.setText("");
        } catch (Exception e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Standard Calculator");
            error.setContentText("Type a valid number");
            error.showAndWait();
        }
    }

    public void Modulas() {
        try {
            value1 = Double.parseDouble(answer.getText());
            fn = "%";
            answer.setText("");
        } catch (Exception e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Standard Calculator");
            error.setContentText("Type a valid number");
            error.showAndWait();
        }
    }

    public void Equals() {
        try {
            switch (fn) {
                case "+":
                    value2 = value1 + Double.parseDouble(answer.getText());
                    answer.setText(Double.toString(value2));
                    break;

                case "-":
                    value2 = value1 - Double.parseDouble(answer.getText());
                    answer.setText(Double.toString(value2));
                    break;

                case "*":
                    value2 = value1 * Double.parseDouble(answer.getText());
                    answer.setText(Double.toString(value2));
                    break;

                case "/":
                    value2 = value1 / Double.parseDouble(answer.getText());
                    answer.setText(Double.toString(value2));
                    break;

                case "%":
                    value2 = value1 % Double.parseDouble(answer.getText());
                    answer.setText(Double.toString(value2));
                    break;
            }
        } catch (Exception e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Standard Calculator");
            error.setHeaderText(null);
            error.setContentText("Type a valid number");
            error.showAndWait();
        }
    }

    public void keyBoardFunctioning(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case DIGIT0:
                answer.setText(answer.getText() + "0");
                break;

            case DIGIT1:
                answer.setText(answer.getText() + "1");
                break;

            case DIGIT2:
                answer.setText(answer.getText() + "2");
                break;

            case DIGIT3:
                answer.setText(answer.getText() + "3");
                break;

            case DIGIT4:
                answer.setText(answer.getText() + "4");
                break;

            case DIGIT5:
                answer.setText(answer.getText() + "5");
                break;

            case DIGIT6:
                answer.setText(answer.getText() + "6");
                break;

            case DIGIT7:
                answer.setText(answer.getText() + "7");
                break;

            case DIGIT8:
                answer.setText(answer.getText() + "8");
                break;

            case DIGIT9:
                answer.setText(answer.getText() + "9");
                break;

            case PERIOD:
                Dot();
                break;

            case I:
                answer.setText(answer.getText() + "3.14");
                break;

            case P:
                Add();
                break;

            case S:
                Subtract();
                break;

            case M:
                Multiply();
                break;

            case D:
                Divide();
                break;

            case N:
                Modulas();
                break;

            case E:
                Equals();
                break;

            case C:
                Clear();
                break;

            case H:
                Help();
                break;

            case ESCAPE:
                Alert exit = new Alert(Alert.AlertType.CONFIRMATION);
                exit.setTitle("Standard Quick Calculator");
                exit.setHeaderText(null);
                exit.setContentText("Are you sure, you want to exit?");

                ButtonType yes = new ButtonType("Yes");
                ButtonType no = new ButtonType("No");
                exit.getButtonTypes().setAll(yes, no);

                Optional<ButtonType> confirmation = exit.showAndWait();

                if (confirmation.get() == yes) {
                    exit(0);
                } else {
                    // Nothing happens here
                }
        }
    }

    public void Dot() {
        answer.setText(answer.getText() + ".");
    }

    public void PI() {
        answer.setText(answer.getText() + "3.14");
    }

    public void num0() {
        answer.setText(answer.getText() + "0");
    }

    public void num1() {
        answer.setText(answer.getText() + "1");
    }

    public void num2() {
        answer.setText(answer.getText() + "2");
    }

    public void num3() {
        answer.setText(answer.getText() + "3");
    }

    public void num4() {
        answer.setText(answer.getText() + "4");
    }

    public void num5() {
        answer.setText(answer.getText() + "5");
    }

    public void num6() {
        answer.setText(answer.getText() + "6");
    }

    public void num7() {
        answer.setText(answer.getText() + "7");
    }

    public void num8() {
        answer.setText(answer.getText() + "8");
    }

    public void num9() {
        answer.setText(answer.getText() + "9");
    }

    public void Clear() {
        answer.setText("");
        fn  = "";

        value1 = 0;
        value2 = 0;
    }

    public void Help() {
        try {
            Stage stage = new Stage();

            stage.setTitle("Standard Calculator - About");
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/Standard_Quick_Calculator/FXML_Files/About.fxml"))));
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Standard Calculator");
            error.setHeaderText("Error");
            error.setContentText("Could not find the file. \n");

            FileNotFoundException fnfe = new FileNotFoundException("Could not find the file");
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            fnfe.printStackTrace(pw);

            JFXTextArea ta = new JFXTextArea(sw.toString());
            ta.setFocusColor(LIME);
            ta.setUnFocusColor(WHITE);
            error.getDialogPane().setExpandableContent(ta);
            error.showAndWait();
        }
    }

}