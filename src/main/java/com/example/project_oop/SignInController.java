package com.example.project_oop;
import BusinessLogic.Main.Main;
import UI.SignIn;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignInController {
    public static boolean flag=false;
    public static String signinusername="",signinpassword="",signinbuglabel="";
    @FXML
    TextField SignInUsernameTextField;
    @FXML
    PasswordField SignInPasswordPasswordField;
    @FXML
    Button SignInSignInButton;
    @FXML
    Label SignInBugLabel;


    public void pushsigninbutton() throws IOException {
        signinusername=SignInUsernameTextField.getText();
        signinpassword=SignInPasswordPasswordField.getText();
        Main.signIn(signinusername,signinpassword);
        if (flag){
            flag=false;
            SignInUsernameTextField.setText("");
            SignInPasswordPasswordField.setText("");

            Parent pane= FXMLLoader.load(getClass().getResource("HomePage-view.fxml"));
            HelloApplication.stg.getScene().setRoot(pane);
        }

        SignInUsernameTextField.setText("");
        SignInPasswordPasswordField.setText("");

    }
    public void pushreturnbackbutton() throws IOException {
        SignInUsernameTextField.setText("");
        SignInPasswordPasswordField.setText("");
        SignInBugLabel.setText("");


        Parent pane= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        HelloApplication.stg.getScene().setRoot(pane);

    }
}
