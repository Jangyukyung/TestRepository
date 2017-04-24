/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam42;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class AppMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent=FXMLLoader.load(AppMain.class.getResource("root.fxml")); //fxml불러옴 
        //Parent parent=FXMLLoader.load(getClass().getResource("root.fxml"));
        
        Scene scene=new Scene(parent); //HBox를 받는거랑 같음(Parent 상속받으니까)/Hbox로 바꿔도됨
        primaryStage.setScene(scene);
        primaryStage.setTitle("Title");
        
        primaryStage.setOnCloseRequest(event ->{
            System.out.println("Closd");
        });
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
//기다림이 존재하는 것 동기화 방식 실행하다가 메소드 호출해서 메소드 호출하고 돌아와서 밑에 실행하는 방식
//실행하다가 메소드 호출해놓고 밑에꺼 실행시키는 것 비동기 방식 
//태스크를 더 편리하게 사용 할 수 있게 하는 방식이다.runable 자체가 쓰레드는 아니다.쓰레드가 작업을 해야하는 것을 정의 하는 것과 똑같다.
//작업을 정의하는 거를 쓰레드 안에 집어 넣어준다.Task 작업결과가 있어야 한다.
//runable 작업객체는 작업을 하고나서 리턴값 없이 끝나는void 형이고 Task 같은 경우는 작업의 결과를 리턴해준다.
//대문자는 클래스 타입
