package com.example.project_oop;

import BusinessLogic.Main.Main;
import BusinessLogic.User.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.nio.Buffer;
import java.util.ResourceBundle;

public class HomePageController  {

    public static User user;
    /////
    @FXML
    Button HomePageExitButton;
    @FXML
    Button HomePageLogoutButton;
    @FXML
    Button HomePageSearchButton;
    @FXML
    Button HomePageMyProfileButton;
//////////

    ///////////////
    public void pushexit(){
        System.out.println("exit");
        Main.startPage("3");
    }
    public void pushlogout() throws IOException {
        Parent pane= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        HelloApplication.stg.getScene().setRoot(pane);

    }
    public void pushmyprofile() throws IOException {

       // System.out.println("here"+MyProfileController.Postnumber+"here");
       // MyProfilePostsLabel.setText(MyProfileController.Postnumber);
       // System.out.println(MyProfilePostsLabel.getText());


        //MyProfileFollowersLabel.setText(MyProfileController.Followernumber);
        //MyProfieFollowingLabel.setText(MyProfileController.Followingnumber);
        //MyProfileUsernameLAbel.setText(MyProfileController.Username);

        Parent pane= FXMLLoader.load(getClass().getResource("MyProfile-view.fxml"));
        HelloApplication.stg.getScene().setRoot(pane);

    }
    public void pushsearch() throws IOException {
        Parent pane= FXMLLoader.load(getClass().getResource("Search-view.fxml"));
        HelloApplication.stg.getScene().setRoot(pane);

    }


}
