package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String nomFXML="Hola.fxml";
        Parent root=FXMLLoader.load(getClass().getResource(nomFXML));
        Scene scene = new Scene(root);
        primaryStage.setTitle(nomFXML);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
