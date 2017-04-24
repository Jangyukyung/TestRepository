/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam42;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class LoginController implements Initializable {

	@FXML
	private BorderPane login;
	@FXML
	private Button btnMain;


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnMain.setOnAction(e->handleBtnMain(e));
	}	

	private void handleBtnMain(ActionEvent e) {//로그인 컨트롤러 에서 Scene 로 갔다가 roo.fxml 로 가야한다.getRoot(),getScene();스태틱 선언도 가능
	//RootController.rootPane.getChildren().remove(1);
			//리스트에서는 리무브를 통해서 제거한다.
		StackPane rootPane=(StackPane)btnMain.getScene().getRoot();
			//rootPane.getChildren().remove(login);
			//login.setTranslateX(350);//width 가350 으로 잡혀있다. stackpane 가 350 이다.350 만큼 옆으로 생성되어 있는 것이다.초기값
			login.setOpacity(1);
			KeyValue keyValue=new KeyValue(login.opacityProperty(),0);
			//KeyValue keyValue=new KeyValue(login.translateXProperty(),350);//어떤 것을 어디 까지 변화시킬 것인가 무엇을 변화 시킬 것인가 무엇을 변화시키고 종료값을0으로
			KeyFrame keyFrame=new KeyFrame(Duration.millis(500),(event)->{rootPane.getChildren().remove(login);},keyValue);//애니메이션 진행시간 0.1초동안 진행하겠다.익명객체 재정의 
			Timeline timeline=new Timeline();
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();//애니메이션 종료 되고나면 remove 시켜줘야 한다 애니메이션이 종료되면 이벤트 가 발생을 한다 이벤트 핸들러거 처리해준다.
			//이벤트 매우 중요하다.
			
			
}
}
