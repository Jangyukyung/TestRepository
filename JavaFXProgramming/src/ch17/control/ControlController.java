/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class ControlController implements Initializable {

	@FXML
	private ToggleGroup menuGroup;
	@FXML
	private ToggleButton btnLight;
	@FXML
	private ToggleButton btnGas;
	@FXML
	private ToggleButton btnHeat;
	@FXML
	private StackPane stackPane;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		btnLight.setOnAction(e->handleBtnLight(e));
		btnGas.setOnAction(e->handleBtnGas(e));
		btnHeat.setOnAction(e->handleBtnHeat(e));
	}	

	private void handleBtnLight(ActionEvent e) {
		try {
			StackPane xx=new StackPane();
			Parent parent=FXMLLoader.load(getClass().getResource("light.fxml"));
			stackPane.getChildren().add(xx);
			stackPane.getChildren().add(parent);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private void handleBtnGas(ActionEvent e) {
		try {
			Parent parent=FXMLLoader.load(getClass().getResource("gas.fxml"));
			stackPane.getChildren().add(parent);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private void handleBtnHeat(ActionEvent e) {
		try {
			Parent parent=FXMLLoader.load(getClass().getResource("heat.fxml"));
			stackPane.getChildren().add(parent);
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	
}
