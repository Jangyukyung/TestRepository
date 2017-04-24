/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam42;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

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
		rootPane=stackPane;
		btnLogin.setOnAction(e->handleBtnLogin(e));
	}	

	private void handleBtnLogin(ActionEvent e) {
		try {
			Parent parent=FXMLLoader.load(getClass().getResource("login.fxml"));
			stackPane.getChildren().add(parent);//로딩한 내용 추가 한다.
			parent.setTranslateX(350);//width 가350 으로 잡혀있다. stackpane 가 350 이다.350 만큼 옆으로 생성되어 있는 것이다.초기값
			KeyValue keyValue=new KeyValue(parent.translateXProperty(),0);//어떤 것을 어디 까지 변화시킬 것인가 무엇을 변화 시킬 것인가 무엇을 변화시키고 종료값을0으로
			KeyFrame keyFrame=new KeyFrame(Duration.millis(300),keyValue);//애니메이션 진행시간 0.1초동안 진행하겠다.
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
			
		} catch (IOException ex) {
		}
	}
	
}
//keyvalue 는 어떤 것을 어떻게 변화시킬것인가. 색상 크기 투명도 이런 종류를 변화시키는것
//keyframe 은 몇초 동안 변화 시킬 것인가