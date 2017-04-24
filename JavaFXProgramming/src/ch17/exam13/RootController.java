/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author Administrator
 */
public class RootController implements Initializable{

    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(btn1.getText());
        //how1
        btn1.setOnAction(new EventHandler<ActionEvent>(){ //함수적 인터페이스!!
            @Override
            public void handle(ActionEvent event) {
                System.out.println("버튼1 클릭됨");
            }
        });
        
        //how2
        btn2.setOnAction(event ->{
             System.out.println("버튼2 클릭됨");
        });
        
//        btn3.setOnAction(event ->{
//             System.out.println("버튼3 클릭됨");
//        });

        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("버튼 4 !! ");
            }
        });
        
        btn5.setOnAction(event ->{
            System.out.println("버튼 5 !!");
        });
    }

    //how3
    public void btn3Handle(ActionEvent event){
        System.out.println("버튼3 클릭됨");
    }
    
    public void btn6Handle(ActionEvent event){
        System.out.println("버튼 6 !!");
    }
}
