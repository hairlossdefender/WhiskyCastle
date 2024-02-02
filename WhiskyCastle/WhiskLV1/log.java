package WhiskLV1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My JavaFX Application");

        Button button = new Button("Click me!");
        button.setOnAction(e -> System.out.println("Button clicked!"));

        Scene scene = new Scene(button, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
