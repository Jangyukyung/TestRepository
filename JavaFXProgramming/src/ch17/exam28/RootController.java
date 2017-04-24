/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam28;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleOpenFileChooser(ActionEvent event) {
        FileChooser fileChooser=new FileChooser();
        File file=fileChooser.showOpenDialog(primaryStage);
        System.out.println(file.getPath());
    }

    @FXML
    private void handleSaveFileChooser(ActionEvent event) {
        FileChooser fileChooser=new FileChooser();
        
        Button button=(Button)event.getSource();  //컨트롤을통해 
        Scene scene=button.getScene();  //씬을 얻고 
        Stage stage=(Stage)scene.getWindow();  //씬을통해 스테이지를 얻고 
        
        //how3-프라이머리스테이직 가지고 있는 컨트롤 하나만 알면돼 
        File file=fileChooser.showSaveDialog(stage);   //File file=fileChooser.showSaveDialog(((Button)event.getSource()).getScene().getWindow());
        System.out.println(file.getPath());
    }

    @FXML
    private void handleDirectoryChooser(ActionEvent event) {
        DirectoryChooser directoryChooser=new DirectoryChooser();
        File file=directoryChooser.showDialog(primaryStage);
        System.out.println(file.getPath());
    }

    @FXML
    private void handlePopup(ActionEvent event) throws Exception {
        showNotification("알림","메시지도착ㄹㄹ");
        showNotification("경고","메시지도착ㅇㅇ");
    }

    private void showNotification(String type,String message) throws Exception{
        Popup popup=new Popup();
        HBox hbox=(HBox)FXMLLoader.load(getClass().getResource("popup.fxml"));
        
        ImageView imgMessage=(ImageView)hbox.lookup("#imgMessage");
        Label lblMessage=(Label)hbox.lookup("#lblMessage");
        if(type.equals("알림")){
            imgMessage.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
        }else if(type.equals("경고")){
            imgMessage.setImage(new Image(getClass().getResource("images/dialog-warning.png").toString()));
        }
        lblMessage.setText(message);
        
        popup.getContent().add(hbox); 
        popup.setAutoHide(true);  //포커스이동하면 닫힘 
        popup.show(AppMain.primaryStage);
    }
    
    @FXML
    private void handleCustom(ActionEvent event) throws IOException {
        
        showCustomDialog("help","확인하셨습니까?");
       // showCustomDialog("error","확인하셨습니까??");
    }
    
    private void showCustomDialog(String type, String message) throws IOException{
        
        Stage dialog=new Stage(StageStyle.UNIFIED);
        Parent parent=FXMLLoader.load(getClass().getResource("custom-dialog.fxml"));
        
        ImageView icon=(ImageView)parent.lookup("#icon");
        Label lblmessage=(Label)parent.lookup("#message");
        Button btnOk=(Button)parent.lookup("#btnOk");
        
        if(type.equals("error")){
            icon.setImage(new Image(getClass().getResource("images/dialog-error.png").toString()));
        }else if(type.equals("help")){
             icon.setImage(new Image(getClass().getResource("images/dialog-help.png").toString()));
        }else if(type.equals("info")){ 
             icon.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
        }else if(type.equals("waring")){
            icon.setImage(new Image(getClass().getResource("images/dialog-waring.png").toString()));
        }
        
        lblmessage.setText(message);
        
        btnOk.setOnAction(e->{
            dialog.hide();
        });
        
        Scene scene=new Scene(parent);
        dialog.setScene(scene);
        dialog.initOwner(AppMain.primaryStage);
        //dialog.initModality(Modality.WINDOW_MODAL);   //모달로바꿈 
        
        dialog.show();
    }
}
