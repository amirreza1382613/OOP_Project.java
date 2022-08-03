package UI;
import BusinessLogic.Event.Event;
import BusinessLogic.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.example.project_oop.SignUpController;

import java.util.concurrent.TimeUnit;

public class SignUp {


    public enum SignUpSituation {
        EMPTY,
        REPEATED_PASSWORD_NOT_MATCH,
        PASSWORD_LENGTH,
        WEAK_PASSWORD,
        PASSWORD_FORMAT,
        USERNAME_LENGTH,
        USERNAME_FORMAT,
        USERNAME_EXISTS,
        SECURITY_ANSWERS_LENGTH,
        DATA_BASE
    }

    public static void signUp(SignUpSituation situation) {
     //   UI.clearScreen();
        //System.out.println(UI.ANSI_BLUE + "\n--------------------SignUp--------------------\n" + UI.ANSI_RESET);
        System.out.println("helloooooo");
      //  System.out.print(UI.ANSI_RED);
        switch (situation) {
            case REPEATED_PASSWORD_NOT_MATCH ->{ System.out.print("repeated password does not match\nplease enter again\n");
               SignUpController.labelPasswordBug="repeated password does not match,please enter again";
                System.out.println("hello");}

            case PASSWORD_LENGTH ->{System.out.print("password must be at least 6 characters and at most 20 characters\n" +
                    "please enter again\n");
                SignUpController.labelPasswordBug="password must be at least 6 characters and at most 20 characters,please enter again";}

            case WEAK_PASSWORD ->{System.out.print("password is weak\npassword must not have only lowercase or only uppercase\n" +
                    "please enter again\n");SignUpController.labelPasswordBug="password is weak\npassword must not have only lowercase or only uppercase,please enter again";}

            case PASSWORD_FORMAT -> {System.out.print("password must include only lowercase letter, uppercase letter, digits " +
                    " and @-#-.-* signs\nplease enter again\n");
                SignUpController.labelPasswordBug="password must include only lowercase letter, uppercase letter, digits and @-#-.-* signs,please enter again";}

            case USERNAME_LENGTH ->{ System.out.print("username must have at least 3 characters and at most 20 characters\n" +
                    "please enter again\n");
                SignUpController.labelPasswordBug="username must have at least 3 characters and at most 20 characters,please enter again";}

            case USERNAME_FORMAT ->{ System.out.print("username must include only lowercase letter, uppercase letter, " +
                    "digits and under line sign\nusername must starts with a letter\n" +
                    "please enter again\n");
                SignUpController.labelPasswordBug="username must include only lowercase letter, uppercase letter,digits and under line sign,username must starts with a letter,please enter again";}

            case USERNAME_EXISTS ->{ System.out.print("this username is already taken\nchoose another username\n");
                SignUpController.labelPasswordBug="this username is already taken,choose another username";}

            case DATA_BASE -> {
                System.out.print("oops! we have some problem in connection :(\n" +
                        "please try again\n");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    System.out.print("something went wrong\nplease try later");
                    System.exit(0);
                }
                UI.clearScreen();
            }
            case SECURITY_ANSWERS_LENGTH ->{ System.out.println
                    ("answer of security questions most be at least one character and at most twenty");
                SignUpController.labelAnswerSecurityBug="answer of security questions most be at least one character and at most twenty";
            }
        }
        System.out.print(UI.ANSI_RESET);

       // return getInfo();
    }

    private static Event getInfo() {
        String user_name;
        String password;
        String repeated_password;
        String sec_answer1;
        String sec_answer2;
        String sec_answer3;

        System.out.print("username : ");
        user_name = UI.scanner.nextLine();
        System.out.print("password : ");
        password = UI.scanner.nextLine();
        System.out.print("repeat password : ");
        repeated_password = UI.scanner.nextLine();

        UI.clearScreen();
        System.out.println("\nhere is three security questions will help you to recover your password later\n");
        System.out.print("In what city were you born? : ");
        sec_answer1 = UI.scanner.nextLine();
        System.out.print("What is the name of your favorite pet? : ");
        sec_answer2 = UI.scanner.nextLine();
        System.out.print("What is the name of your first school? : ");
        sec_answer3 = UI.scanner.nextLine();

        return new Event(Main.UserRequest.SIGN_UP, "username="+user_name,
                "password="+password, "repeatedpassword="+repeated_password,
                "sec_ans1=" + sec_answer1, "sec_ans2=" + sec_answer2, "sec_ans3=" + sec_answer3);
    }
    public static void check(){
        System.out.println("slj;vjds");
    }

}
