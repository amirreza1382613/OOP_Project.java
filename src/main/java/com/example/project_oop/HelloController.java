package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import BusinessLogic.Main.Main;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
   HelloApplication helloApplication=new HelloApplication();
   @FXML
    Button ExitButton;
   @FXML
   Button SignInButton;
   @FXML
   Button SignUpButton;
   @FXML
   Button ChoseThemeButton;
   @FXML
   AnchorPane abc;


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
      Parent pane= FXMLLoader.load(getClass().getResource("ChooseTheme-view.fxml"));
      HelloApplication.stg.getScene().setRoot(pane);
   }
   public void choosetheme() throws IOException {

   }


   @Override
   public void initialize(URL location, ResourceBundle resources) {
      if (Main.getTheme()==0) abc.setStyle("-fx-background-color: #87CEEB");
      else if (Main.getTheme()==1) abc.setStyle("-fx-background-color: #808080");
      else abc.setStyle("-fx-background-color: #90EE90");
   }
}

