/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofx.menus;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author danml
 */
public class LoginController implements Initializable {

    @FXML
    private ImageView viewLoader;
    @FXML
    private JFXButton btnLogin;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        viewLoader.setVisible(false);
        // TODO
    }

    @FXML
    private void loginAction(ActionEvent event) {
        viewLoader.setVisible(true);
        try {
            Stage oldWindow = (Stage) btnLogin.getScene().getWindow();
            Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);

            PauseTransition pauseTransition = new PauseTransition();
            pauseTransition.setDuration(Duration.seconds(3));
            pauseTransition.setOnFinished(ev -> {
                viewLoader.setVisible(false);
                System.out.println("Complte one");
                oldWindow.hide();
                stage.show();
            });
            pauseTransition.play();

        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
