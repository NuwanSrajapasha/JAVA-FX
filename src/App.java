import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'start'");
        URL resource = getClass().getResource("./Main.fxml");
         Parent root = FXMLLoader.load(resource);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
