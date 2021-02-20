import javafx.application.Application;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

 public class Display extends Application{

public static void main(String[] args){
    launch(args);
}

@Override
public void start(Stage stage) throws Exception{


    HBox root = new HBox(); 

    Button button = new Button("button");
    Label  label = new Label("Label");

    root.getChildren().addAll(button, label);

    Scene scene = new Scene(root, 700,300);
    scene.getStylesheets().add("DarkTheme.css");
    stage.setScene(scene);

    stage.setTitle("Title");

    stage.show();
  }
}