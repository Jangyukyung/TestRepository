/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam21;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Callback;




/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    @FXML
    private ListView<Food> listView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listView.setCellFactory(new Callback<ListView<Food>, ListCell<Food>>() {
            @Override
            public ListCell<Food> call(ListView<Food> param) {
                ListCell<Food> listCell=new ListCell<Food>(){
                    @Override
                    protected void updateItem(Food item, boolean empty) {
                        super.updateItem(item, empty); //To change body of generated methods, choose Tools | Templates.

                       if(empty) return;  //empty가 true면 try~실행하지 마라 
                       
                       try {
                           //cell에 들어갈 컨테이너 생성
                           HBox hbox=(HBox)FXMLLoader.load(getClass().getResource("item.fxml")); 
                           ImageView foodImage=(ImageView)hbox.lookup("#image");
                           Label foodName=(Label)hbox.lookup("#name");
                           ImageView foodScore=(ImageView)hbox.lookup("#score");
                           Label foodDescription=(Label)hbox.lookup("#description");
                           
                           foodImage.setImage(new Image(getClass().getResource("images/"+item.getImage()).toString()));
                           foodName.setText(item.getName());
                           foodScore.setImage(new Image(getClass().getResource("images/star"+item.getScore()+".png").toString()));
                           foodDescription.setText(item.getDescription());
                           //cell의 내용으로 설정
                           setGraphic(hbox);
                           
                       } catch (IOException ex) {
                          ex.printStackTrace();
                       }  
                   }                  
               };
               return listCell;
            }
            
        });
        //선택 속성 감시
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Food>() {
            @Override
            public void changed(ObservableValue<? extends Food> observable, Food oldValue, Food newValue) {
                System.out.println(newValue.getName() + ":" + newValue.getScore() +" 점 / "+ newValue.getImage());
            }
        });
        
        //데이터세팅
        ObservableList<Food> value=FXCollections.observableArrayList();
        value.add(new Food("food01.png", "삼겹살",10,"맛있엉"));
        value.add(new Food("food02.png", "음식2",3,"짱짱"));
        value.add(new Food("food03.png", "음식3",5,"짱짱"));
        value.add(new Food("food04.png", "음식4",6,"짱짱"));
        value.add(new Food("food05.png", "음식5",1,"짱짱"));
        
        listView.setItems(value);
    }       
    
}
