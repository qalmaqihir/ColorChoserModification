package ColorChoserModification;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ColorChoserModification extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ColorChoserModification.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("ColorChooserApp");
        stage.setScene(scene);
        stage.show();
    }
}