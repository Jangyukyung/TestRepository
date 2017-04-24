/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam01;

import java.util.Map;
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
        /*
        List<String> list=params.getRaw();
        for(String param:list){
            System.out.println(param);
        }*/
        
        //java AppMain --ip=192.168.3.29 --port=50001입력시 
        Map<String,String> map=params.getNamed();
        String ip=map.get("ip");
        String port=map.get("port");
        System.out.println(ip);
        System.out.println(port);
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
