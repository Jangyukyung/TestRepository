/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam22;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {
    @FXML
    private TableView<Phone> tableView;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TableColumn tc0=tableView.getColumns().get(0); //첫번째 column에 대한 TableColumn을 얻음
        TableColumn tc1=tableView.getColumns().get(1);
        TableColumn tc2=tableView.getColumns().get(2);
        
        tc0.setCellValueFactory(new PropertyValueFactory<Phone,String>("name"));//phone객체에서 (String타입인)name필드의 값을 만들어 넣어준다.
        tc1.setCellValueFactory(new PropertyValueFactory<Phone,String>("image"));
        tc2.setCellValueFactory(new PropertyValueFactory<Phone,String>("content"));
         
        ObservableList<Phone> list=FXCollections.observableArrayList();
        list.add(new Phone("phone01.png","갤럭시S1","첫번째모델"));
        list.add(new Phone("phone02.png","갤럭시S2","첫번째모델"));
        list.add(new Phone("phone03.png","갤럭시S3","첫번째모델"));
        
        tableView.setItems(list);
        
    }    
    
}
