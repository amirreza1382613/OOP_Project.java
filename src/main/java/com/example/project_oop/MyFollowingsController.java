package com.example.project_oop;

import BusinessLogic.Main.Main;
import UI.MyProfile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MyFollowingsController implements Initializable {
    public static String MyFollowings="",RemoveError="";
    public static int removenumber;
    @FXML
    Label MyFollowingsUsernameLabel;
    @FXML
    Label MyFollowingsErrorLabell;
    @FXML
    Button MyFollowingsBackButton;
    @FXML
    Button MyFollowingsRemoveButton;
    @FXML
    TextField MyFollowingsNumberofRemoveTextField;
    @FXML
    Label MyFollowingsFollowersLabel;
    public void pushback() throws IOException {
        Parent pane= FXMLLoader.load(getClass().getResource("MyProfile-view.fxml"));
        HelloApplication.stg.getScene().setRoot(pane);
    }
    public void pushremove() throws SQLException, IOException {
        removenumber=Integer.parseInt(MyFollowingsNumberofRemoveTextField.getText());

        if (removenumber<0||removenumber>DataBase.Follow.followingsList(Main.getUser().getUsername()).size())

            MyFollowingsErrorLabell.setText("invalid number given");

        else{
            // System.out.println(removenumber-1);
            Main.myFollowingsList(DataBase.Follow.followingsList(Main.getUser().getUsername()).get(removenumber-1));
            Parent pane= FXMLLoader.load(getClass().getResource("MyFollowing-view.fxml"));
            HelloApplication.stg.getScene().setRoot(pane);
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        MyFollowings="";
        try {
            MyProfile.myFollowingsList(DataBase.Follow.followingsList(Main.getUser().getUsername()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        MyFollowingsUsernameLabel.setText(HomePageController.user.getUsername());
        MyFollowingsFollowersLabel.setText(MyFollowings);
        MyFollowingsErrorLabell.setText(RemoveError);
    }
}
