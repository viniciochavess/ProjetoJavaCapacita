import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Principal extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent tela = FXMLLoader.load(getClass().getResource("/Formulario.fxml"));

        primaryStage.setScene(new Scene(tela));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
