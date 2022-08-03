package com.example.project_oop;

import BusinessLogic.Main.Main;
import BusinessLogic.User.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.nio.Buffer;

public class HomePageController {

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
    @FXML
    Label MyProfileUsername;
    @FXML
    Label MyProfileFollowers;
    @FXML
    Label MyProfieFollowing;
    @FXML
    Label MyProfilePosts;
    @FXML
    Button MyProfileBackButton;
    @FXML
    Button MyProfilePostsButton;
    @FXML
    Button MyProfileFollowersButton;
    @FXML
    Button MyProfileFollowingButton;
    @FXML
    Button MyProfileSendMessageButton;
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

        MyProfilePosts.setText(MyProfileController.Postnumber);
        MyProfileFollowers.setText(MyProfileController.Followernumber);
        MyProfieFollowing.setText(MyProfileController.Followingnumber);
        MyProfileUsername.setText(MyProfileController.Username);

        Parent pane= FXMLLoader.load(getClass().getResource("MyProfile-view.fxml"));
        HelloApplication.stg.getScene().setRoot(pane);

    }
    public void pushsearch(){

    }

}
