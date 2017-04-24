/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam41;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

	@FXML
	private Button btnLogin;
	@FXML
	private StackPane stackPane;

	public static StackPane rootPane;
	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		rootPane=stackPane; //stackPane이 rootPane으로 대입
		btnLogin.setOnAction(e->handleBtnLogin(e));
		
	}	

	private void handleBtnLogin(ActionEvent e) {
		try {
			Parent parent=FXMLLoader.load(getClass().getResource("login.fxml"));
			stackPane.getChildren().add(parent);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
