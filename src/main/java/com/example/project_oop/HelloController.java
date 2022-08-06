package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import BusinessLogic.Main.Main;

import java.io.IOException;

public class HelloController {
   HelloApplication helloApplication=new HelloApplication();
   @FXML
    Button ExitButton;
   @FXML
   Button SignInButton;
   @FXML
   Button SignUpButton;
   @FXML
   Button ChoseThemeButton;

   public void pushexit(ActionEvent actionEvent){

     Main.startPage("3");
   }

   public void pushSignIn(ActionEvent actionEvent) throws IOException {
     // HelloApplication.changeScene("SignIn-view.fxml");

      Parent pane= FXMLLoader.load(getClass().getResource("SignIn-view.fxml"));
      HelloApplication.stg.getScene().setRoot(pane);


      Main.startPage("2");
   }

   public void pushSignUp(ActionEvent actionEvent) throws IOException {

      Parent pane= FXMLLoader.load(getClass().getResource("SignUp-view.fxml"));
      HelloApplication.stg.getScene().setRoot(pane);

      Main.startPage("1");
   }
   public void pushchosetheme() throws IOException {
      Parent pane= FXMLLoader.load(getClass().getResource("SignUp-view.fxml"));
      HelloApplication.stg.getScene().setRoot(pane);
   }


}

