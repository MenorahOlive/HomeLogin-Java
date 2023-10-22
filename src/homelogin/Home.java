/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homelogin;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author olive
 */
class Home extends Application {
 static Stage homeStage  = new Stage();
   
    @Override
    public void start(Stage primaryStage) {
        Text greeting_lbl=new Text("Welcome to the Home Page");
        Button close_btn = new Button("Close");
       
       
            close_btn.setOnMouseClicked((new EventHandler<MouseEvent>() {
             public void handle(MouseEvent event) {
                    Stage stage = (Stage) close_btn.getScene().getWindow();  
                    stage.close();            
             }
          }));
       
       
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400,200);
        gridPane.setVgap(10);
        gridPane.setHgap(20);
        gridPane.setAlignment(Pos.CENTER);
     
        gridPane.add(greeting_lbl, 1, 1);
        gridPane.add(close_btn, 1, 2);
        primaryStage.setTitle("Second GUI");
       
        Scene scene=new Scene (gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
}
