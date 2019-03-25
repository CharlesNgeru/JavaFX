/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_login;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sircharles
 */
public class HomeController implements Initializable {
    private JFrame frame;
    @FXML
    private JFXButton btn_login, btn_signup;
    
    @FXML
    private AnchorPane pn_login, pn_signup;
    
    @FXML
    private JFXButton exit;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btn_login)
        {
            pn_login.toFront();
        }
        else if(event.getSource() == btn_signup)
        {
            pn_signup.toFront();
        }
        frame=new JFrame("exit");
        if(JOptionPane.showConfirmDialog(frame, exit, "Are you sure you want to exit??", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
/*Combo-box code

ObservableList role = FXCollections.observableArrayList("put items here and separate with comma for each");

To call it

fx:id(conductor).setItems(role);
*/