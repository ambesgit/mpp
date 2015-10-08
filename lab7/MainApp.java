package lab7;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class MainApp extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("hello world");
		Button btn=new Button("say Hello");
		btn.setOnAction(new EventHandler(){

			@Override
			public void handle(Event arg0) {
				btn.setText("clicked me");
				
			}
			
		});
		GridPane g=new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setPadding(new Insets(25,25,25,25));
		g.setVgap(10);
		g.setHgap(10);
		HBox hbxBtn=new HBox(10);
		hbxBtn.getChildren().add(btn);
		Text sceneTitle= new Text("Welcome");
		sceneTitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
		g.add(sceneTitle, 1, 0);
		g.add(btn, 1,1);
		g.add(hbxBtn, 2, 2);
		primaryStage.setScene(new Scene(g,400,400));
		primaryStage.show();
		
	}

}
