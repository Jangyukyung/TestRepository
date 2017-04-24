/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam39;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label lblWorkDone;
	@FXML
	private Label lblResult;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;

	private TimeService timeService;
	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnStart.setOnAction(e->handleBtnStart(e));
		btnStop.setOnAction(e->handleBtnStop(e));
	}	

	private void handleBtnStart(ActionEvent e) {
		if(timeService==null){
			timeService= new TimeService();
			timeService.start();
		}else{
			timeService.restart();
		}
	}

	private void handleBtnStop(ActionEvent e) {
		 timeService.cancel();
	}
	
	class TimeService extends Service<Integer> {
		@Override
		protected Task<Integer> createTask(){
			Task<Integer> task=new Task<Integer>(){
				@Override
				protected Integer call() throws Exception{
					int sum=0;
					for(int i=1;i<=100;i++){
						sum+=i;
						if(isCancelled()){ break; }  //isCancelled 가 true면 빠져나옴 
						try{Thread.sleep(100);
						}catch(Exception e){
						} 
						int value=i;  //i는 final특성을 가지기 때문에 
						Platform.runLater(()->{
							progressBar.setProgress(value/100.0);  
							lblWorkDone.setText(String.valueOf(value));
						});		
					}
					return sum;
			}
		};
			return task;
	}

		@Override
		protected void succeeded() {
			lblResult.setText(String.valueOf(getValue()));
		}
	}
}

