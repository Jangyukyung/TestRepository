/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam24;

import ch17.exam23.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class AppMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent=FXMLLoader.load(AppMain.class.getResource("root.fxml")); //fxml불러옴 
        //Parent parent=FXMLLoader.load(getClass().getResource("root.fxml"));
        
        Scene scene=new Scene(parent); //HBox를 받는거랑 같음(Parent 상속받으니까)/Hbox로 바꿔도됨
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        
        primaryStage.setOnCloseRequest(event ->{
            System.out.println("Closed");
        });
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
