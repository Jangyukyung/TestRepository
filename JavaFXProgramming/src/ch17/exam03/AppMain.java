/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam03;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class AppMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox=new HBox();
        hbox.setPadding(new Insets(10));  //여백생김
        hbox.setSpacing(10);  //컨트롤간의간격
        
        TextField textField=new TextField();
        textField.setPrefWidth(200);
        
        Button button=new Button("확인");
        
        ObservableList list=hbox.getChildren();
        list.add(textField);
        list.add(button);
        
        Scene scene=new Scene(hbox);
        primaryStage.setScene(scene);   //스테이지에 씬 넣음 
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
