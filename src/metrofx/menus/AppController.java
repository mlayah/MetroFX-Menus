/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrofx.menus;

import java.io.File;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author danml
 */
public class AppController implements Initializable {

    @FXML
    private AnchorPane appMainAnchor;
    @FXML
    private ImageView appImageview;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      setStyles(null, "metrofx/icons/Mail.png");
       
    }

    public void setStyles(String value, String path) {
        appMainAnchor.setStyle(value);
        
            
        
        appImageview.setImage(new Image(path));

    }

}
