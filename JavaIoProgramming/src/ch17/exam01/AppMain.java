/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam01;

import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class AppMain extends Application{
    public AppMain(){
        System.out.println("Constructor");
    }

    @Override
    public void init() throws Exception {
        System.out.println("init");    
        Parameters params=getParameters();
        List<String> list=params.getRaw();
        for(String param:list){
            System.out.println(param);
        }
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(Thread.currentThread().getName());
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");   
    }
    
   
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
    
}
