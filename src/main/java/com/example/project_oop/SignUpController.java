package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import UI.SignUp;
import BusinessLogic.Main.Main;
import BusinessLogic.Event.Event;
import BusinessLogic.Message.Message;
import BusinessLogic.Post.Comment;
import BusinessLogic.Post.Post;
import BusinessLogic.User.User;
import DataBase.ReadUser;
import Exceptions.LogicException.*;
import Exceptions.DataBaseExceptions.*;
import UI.MyProfile;
import UI.Profile;
import UI.Search;

import java.io.IOException;

public class SignUpController {
    public static boolean flag=false;
    public static String labelAnswerSecurityBug="",labelPasswordBug="";
    public static String usernametextfield,passwordpasswordfield,repeatpasswordpasswordfield,securityquestion1textfield,securityquestion2textfield,securityquestion3textfield;

    @FXML
    Label LabelAnswerSecurityBug;
    @FXML
    Label LabelPasswordBug;
    @FXML
    TextField SecurityQuestion1TextField;
    @FXML
    TextField SecurityQuestion2TextField;
    @FXML
    TextField SecurityQuestion3TextField;
    @FXML
    TextField UsernameTextField;
    @FXML
    PasswordField PasswordPasswordField;
    @FXML
    PasswordField RepeatPasswordPasswordField;
    @FXML
    Button SignUp2Button;
    @FXML
    Button SignUpReturnBackButton;

    public void pushsignup(ActionEvent actionEvent) throws IOException {
        labelAnswerSecurityBug="";labelPasswordBug="";
        usernametextfield=UsernameTextField.getText();
        passwordpasswordfield=PasswordPasswordField.getText();
        repeatpasswordpasswordfield=RepeatPasswordPasswordField.getText();
        securityquestion1textfield=SecurityQuestion1TextField.getText();
        securityquestion2textfield=SecurityQuestion2TextField.getText();
        securityquestion3textfield=SecurityQuestion3TextField.getText();

        Main.signUp(usernametextfield,passwordpasswordfield,repeatpasswordpasswordfield,securityquestion1textfield,securityquestion2textfield,securityquestion3textfield);

        if (flag){
            System.out.println("come");
            flag=false;
            LabelPasswordBug.setText(labelPasswordBug);
            LabelAnswerSecurityBug.setText(labelAnswerSecurityBug);
            UsernameTextField.setText("");
            PasswordPasswordField.setText("");
            RepeatPasswordPasswordField.setText("");
            SecurityQuestion1TextField.setText("");
            SecurityQuestion2TextField.setText("");
            SecurityQuestion3TextField.setText("");

            Parent pane= FXMLLoader.load(getClass().getResource("HomePage-view.fxml"));
            HelloApplication.stg.getScene().setRoot(pane);
        }
        LabelPasswordBug.setText(labelPasswordBug);
        LabelAnswerSecurityBug.setText(labelAnswerSecurityBug);
        UsernameTextField.setText("");
        PasswordPasswordField.setText("");
        RepeatPasswordPasswordField.setText("");
        SecurityQuestion1TextField.setText("");
        SecurityQuestion2TextField.setText("");
        SecurityQuestion3TextField.setText("");

    }
    public void pushreturnbackbutton() throws IOException {
        UsernameTextField.setText("");
        PasswordPasswordField.setText("");
        RepeatPasswordPasswordField.setText("");
        SecurityQuestion1TextField.setText("");
        SecurityQuestion2TextField.setText("");
        SecurityQuestion3TextField.setText("");

        Parent pane= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        HelloApplication.stg.getScene().setRoot(pane);

    }



}
