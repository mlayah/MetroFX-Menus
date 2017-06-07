/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofx.menus;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author danml
 */
public class MainController implements Initializable {

    @FXML
    private AnchorPane windows;
    @FXML
    private AnchorPane ubuntu;
    @FXML
    private AnchorPane mac;
    @FXML
    private AnchorPane dynamics;
    @FXML
    private AnchorPane excel;
    @FXML
    private AnchorPane lynch;
    @FXML
    private AnchorPane project;
    @FXML
    private AnchorPane edge;
    @FXML
    private AnchorPane outlook;
    @FXML
    private AnchorPane word;
    @FXML
    private AnchorPane visualstudio;
    @FXML
    private AnchorPane onenote;
    @FXML
    private AnchorPane facebook;
    @FXML
    private AnchorPane mail;
    @FXML
    private AnchorPane twitter;
    @FXML
    private AnchorPane linkedin;
    @FXML
    private AnchorPane flickr;
    @FXML
    private AnchorPane yahoo;
    @FXML
    private AnchorPane skype;
    @FXML
    private AnchorPane opera;
    @FXML
    private AnchorPane onedrive;
    @FXML
    private AnchorPane notifications;
    @FXML
    private AnchorPane camera;
    @FXML
    private AnchorPane kledy;
    @FXML
    private AnchorPane dropbox;
    @FXML
    private AnchorPane android;
    @FXML
    private AnchorPane weather;
    @FXML
    private AnchorPane news;
    @FXML
    private AnchorPane reader;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        switchStage();
    }

    @FXML
    public void switchStage() {
        AnchorPane[] panes = {android, camera, dropbox, dynamics, edge, excel, facebook, flickr,
            kledy, linkedin, lynch, mac, mail, news, notifications, onedrive, onenote,
            opera, outlook, project, skype, reader, twitter, ubuntu, visualstudio, weather, windows, word, yahoo
        };
        for (Node node : panes) {
            if (node.getId() == null) {
                return;
            }
            node.addEventHandler(MouseEvent.MOUSE_PRESSED, (MouseEvent event) -> {
                switch (node.getId()) {
                    case "android":
                        setStage("Android", android.getStyle(), "metrofx/icons/Android.png");
                        break;

                    case "camera":
                        setStage("Camera", camera.getStyle(), "metrofx/icons/Camera-02.png");
                        break;
                    case "dropbox":
                        setStage("Dropbox", dropbox.getStyle(), "metrofx/icons/Drop box.png");
                        break;
                    case "dynamics":
                        setStage("Dynamics", dynamics.getStyle(), "metrofx/icons/Dynamimcs CRM.png");
                        break;
                    case "edge":
                        setStage("Microsoft Edge", edge.getStyle(), "metrofx/icons/MicroSoft Edge.png");
                        break;
                    case "excel":
                        setStage("Excel", excel.getStyle(), "metrofx/icons/Excel Online.png");
                        break;
                    case "facebook":
                        setStage("Facebook", facebook.getStyle(), "metrofx/icons/Facebook.png");
                        break;
                    case "flickr":
                        setStage("Flickr", flickr.getStyle(), "metrofx/icons/Flickr.png");
                        break;
                    case "kledy":
                        setStage("Kledy", kledy.getStyle(), "metrofx/icons/Kledy.png");
                        break;
                    case "linkedin":
                        setStage("Linked In", linkedin.getStyle(), "metrofx/icons/LinkedIn.png");
                        break;
                    case "lynch":
                        setStage("Camera", lynch.getStyle(), "metrofx/icons/Microsoft Lync.png");
                        break;
                    case "mac":
                        setStage("Macintosh", mac.getStyle(), "metrofx/icons/mac.png");
                        break;
                    case "mail":
                        setStage("Mail", mail.getStyle(), "metrofx/icons/Mail.png");
                        break;
                    case "news":
                        setStage("News", news.getStyle(), "metrofx/icons/news.png");
                        break;
                    case "notifications":
                        setStage("Notifications", notifications.getStyle(), "metrofx/icons/Bell.png");
                        break;
                    case "onedrive":
                        setStage("One Drive", onedrive.getStyle(), "metrofx/icons/OneDrive.png");
                        break;
                    case "onenote":
                        setStage("Mail", onenote.getStyle(), "metrofx/icons/MS OneNote-2013.png");
                        break;
                    case "opera":
                        setStage("Opera Browser", opera.getStyle(), "metrofx/icons/Opera.png");
                        break;
                    case "outlook":
                        setStage("Outlook", outlook.getStyle(), "metrofx/icons/Microsoft-Outlook-New.png");
                        break;
                    case "project":
                        setStage("Microsoft Project", project.getStyle(), "metrofx/icons/Microsoft Project 2010.png");
                        break;
                    case "skype":
                        setStage("Skype", skype.getStyle(), "metrofx/icons/Skype-01.png");
                        break;
                    case "reader":
                        setStage("Reader", reader.getStyle(), "metrofx/icons/pdf.png");
                        break;
                    case "twitter":
                        setStage("Twitter", twitter.getStyle(), "metrofx/icons/Twitter-Bird.png");
                        break;
                    case "ubuntu":
                        setStage("Ubuntu", ubuntu.getStyle(), "metrofx/icons/Ubuntu.png");
                        break;
                    case "visualstudio":
                        setStage("Skype", visualstudio.getStyle(), "metrofx/icons/Visual-Studio.png");
                        break;
                    case "weather":
                        setStage("Weather", weather.getStyle(), "metrofx/icons/Weather-02.png");
                        break;
                    case "windows":
                        setStage("Windows", windows.getStyle(), "metrofx/icons/Windows.png");
                        break;
                    case "word":
                        setStage("Word", word.getStyle(), "metrofx/icons/Word.png");
                        break;
                        case "yahoo":
                        setStage("Tahoo", yahoo.getStyle(), "metrofx/icons/Yahoo-01.png");
                        break;

                }

            });

        }

    }

    private void setStage(String title, String style, String image) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("App.fxml"));
            Parent root = loader.load();
            AppController appController = loader.getController();
            appController.setStyles(style, image);
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
