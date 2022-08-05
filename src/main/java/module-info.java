module com.example.project_oop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;


    opens com.example.project_oop to javafx.fxml;
    exports com.example.project_oop;
}