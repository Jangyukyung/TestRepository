/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam20;

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
    private ListView<Phone> listView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listView.setCellFactory(new Callback<ListView<Phone>, ListCell<Phone>>() {
            @Override
            public ListCell<Phone> call(ListView<Phone> param) {
               ListCell<Phone> listCell=new ListCell<Phone>(){ //상속받아 Phone객체타입의 ListCell객체를 만든다? 
                   @Override
                   protected void updateItem(Phone item, boolean empty) {
                       super.updateItem(item,empty);  //부모에 있는거도 실행하고, 내꺼도 실행하고 
                       
                       if(empty) return;  //empty가 true면 try~실행하지 마라 
                       
                       try {
                           //cell에 들어갈 컨테이너 생성
                           HBox hbox=(HBox)FXMLLoader.load(getClass().getResource("item.fxml")); 
                           ImageView phoneImage=(ImageView)hbox.lookup("#image");
                           Label phoneName=(Label)hbox.lookup("#name");
                           Label phoneContent=(Label)hbox.lookup("#content");
                           
                           phoneImage.setImage(new Image(getClass().getResource("images/"+item.getImage()).toString()));
                           phoneName.setText(item.getName());
                           phoneContent.setText(item.getContent());
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
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {
            @Override
            public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
                System.out.println(newValue.getName() + ":" + newValue.getImage());
               
            }
        });
        
        //클릭 이벤트 처리
//        listView.setOnMouseClicked(e->{
//            Phone phone=(Phone)listView.getSelectionModel().getSelectedItems();
//            System.out.println(phone.getName());
//        });
        
        //데이터세팅
        ObservableList<Phone> value=FXCollections.observableArrayList();
        value.add(new Phone("phone01.png", "갤럭시S8","짱짱"));
        value.add(new Phone("phone02.png", "갤럭시S8","짱짱"));
        value.add(new Phone("phone03.png", "갤럭시S8","짱짱"));
        value.add(new Phone("phone04.png", "갤럭시S8","짱짱"));
        value.add(new Phone("phone05.png", "갤럭시S8","짱짱"));
        listView.setItems(value);
    }       
}
