package opgave9.quiz;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;



public class MainUI extends Application {

    private Scene sporgsmaal2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("QuizStart.fxml"));
        primaryStage.setTitle("1. semester quiz");
        primaryStage.setScene(new Scene(root, 640, 400));
        primaryStage.show();
    }

    public void changeSceneToSporgsmaal2(javafx.event.ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sporgsmaal2.fxml"));

        // Only creates a new scene if it doesn't already exist
        if (sporgsmaal2 == null)
            sporgsmaal2 = new Scene(root);
        // This is the line that gets the stage information
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(sporgsmaal2);
        primaryStage.show();
    }
}
