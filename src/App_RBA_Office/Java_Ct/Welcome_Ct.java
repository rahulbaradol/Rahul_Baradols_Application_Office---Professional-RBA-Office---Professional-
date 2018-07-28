package App_RBA_Office.Java_Ct;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Welcome_Ct implements Initializable {

    @FXML
    private StackPane welcome;

    @FXML
    private Label heading, description;

    private boolean clicked = false;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        welcome.setOpacity(0);

        FadeTransition ft = new FadeTransition(Duration.seconds(2), welcome);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();

        zoomDescriptionOutside();
    }

    private void zoomDescriptionOutside() {
        RotateTransition rt_1 = new RotateTransition(Duration.seconds(1), description);
        ScaleTransition st_1 = new ScaleTransition(Duration.seconds(1), description);
        ParallelTransition pt_1 = new ParallelTransition(rt_1, st_1);

        rt_1.setToAngle(360);
        st_1.setToX(2);
        st_1.setToY(2);

        pt_1.setOnFinished(event -> zoomDescriptionInside());

        pt_1.play();
    }

    private void zoomDescriptionInside() {
        RotateTransition rt_1 = new RotateTransition(Duration.seconds(1), description);
        ScaleTransition st_1 = new ScaleTransition(Duration.seconds(1), description);
        ParallelTransition pt = new ParallelTransition(rt_1, st_1);

        rt_1.setToAngle(-20);
        st_1.setToX(1);
        st_1.setToY(1);

        pt.setOnFinished(event -> zoomDescriptionOutside());

        pt.play();
    }

    public void load_RBA_Office_Pro() {
        if (!clicked) {
            TranslateTransition tt_D = new TranslateTransition(Duration.seconds(1.5), description);
            TranslateTransition tt_H = new TranslateTransition(Duration.seconds(1.5), heading);

            ScaleTransition st_D = new ScaleTransition(Duration.seconds(1.5), description);
            ScaleTransition st_H = new ScaleTransition(Duration.seconds(1.5), heading);

            ParallelTransition pt = new ParallelTransition(tt_D, tt_H, st_D, st_H);

            tt_D.setToX(600);
            tt_H.setToX(-600);

            st_D.setToX(-0.1);
            st_D.setToY(-0.1);

            st_H.setToX(-0.1);
            st_H.setToY(-0.1);

            pt.play();

            pt.setOnFinished(event -> {
                FadeTransition ft = new FadeTransition(Duration.seconds(1), welcome);
                ft.setFromValue(1);
                ft.setToValue(0);

                ft.setOnFinished(event_FT -> {
                    try {
                        Stage stage = (Stage) welcome.getScene().getWindow();
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/App_RBA_Office/FXML_Files/Rahul_Baradols_Application_Professional_Office.fxml"));
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
            });

            clicked = true;
        }
    }

}