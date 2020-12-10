import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;

import javafx.stage.Stage;


public class Interface extends Application{
private BorderPane root = new BorderPane();
private Stage stage;

    public static void main(String[]args){
        launch(args);
    }
    public void start(Stage stage){
        this.stage = stage;
        stage.setTitle("GUI-IoT project");
        left();
        right();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void left(){ //Skapat en borderpane till vänster med en Vbox i som meny.  !!!det behövs 2 panes i en borderpane för att köra programmet
        BorderPane left = new BorderPane();
        left.setPrefSize(200, 500);
        Separator separator = new Separator(Orientation.VERTICAL); //Avgränsar höger och vänster borderpane
        left.setRight(separator);
        VBox menu = new VBox();
        menu.setSpacing(10);
        menu.setPadding(new Insets(5));
        Button ex1 = new Button("ex1");
        Button ex2 = new Button("ex2");
        Button ex3 = new Button("ex3");
        ex1.setPrefWidth(100);
        ex2.setPrefWidth(100);
        ex3.setPrefWidth(100);
        menu.setAlignment(Pos.TOP_CENTER);

        menu.getChildren().addAll(ex1,ex2,ex3);
        left.setCenter(menu);
        root.setLeft(left);

    }
    public void right(){ // Skapat en borderpane till höger med en Hbox som header och en textruta som utfyllnad !!!det behövs 2 panes i en borderpane för att köra programmet
        BorderPane right = new BorderPane();
        right.setPrefSize(600, 500);
        HBox header = new HBox();
        Label name = new Label("GUI-IoT");
        right.setPadding(new Insets(5));
        header.setAlignment(Pos.TOP_CENTER);

        TextArea textbox = new TextArea();

        right.setCenter(textbox);
        header.getChildren().add(name);
        right.setTop(header);
        root.setRight(right);

    }

}
