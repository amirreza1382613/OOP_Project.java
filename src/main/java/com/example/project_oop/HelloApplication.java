package com.example.project_oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import BusinessLogic.Main.Main;

import java.io.IOException;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class HelloApplication extends Application {
    
    public static Stage stg;
    
    @Override
    public void start(Stage stage) throws IOException {
        stg=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();

    }
    public void changeScene(String fxml) throws IOException{
        Parent pane=FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
        stg.show();
    }

    public static void main(String[] args) {
        launch();
    }
}