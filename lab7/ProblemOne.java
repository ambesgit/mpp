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
public class ProblemOne extends Application{
	
	public static void main(String[] args) {
		launch(args);


	}

	@Override
	public void start(Stage myStage) throws Exception {
		myStage.setTitle("Address Form");
		GridPane g=new GridPane();
		g.setHgap(10);
		g.setVgap(10);
		g.setPadding(new Insets(25,25,25,25));
		Label name=new Label("Name");
		final TextField tname=new TextField();
		Label street=new Label("Street");
		final TextField tstreet=new TextField();
		Label city=new Label("City");
		final TextField tcity=new TextField();		
		Label state=new Label("State");
		final TextField tstate=new TextField();
		Label zip=new Label("Zip");
		final TextField tzip=new TextField();
		Button submit=new Button("Submit");
		g.add(name,1,0);g.add(street,2,0);g.add(city,3,0);
		g.add(tname,1,1);g.add(tstreet,2,1);g.add(tcity,3,1);		
		g.add(state, 2, 2);g.add(zip, 3, 2);
		g.add(tstate,2,3);g.add(tzip,3,3);
		g.add(submit, 3,4);
		myStage.setScene(new Scene(g,400,200));
		myStage.show();
		submit.setOnAction(new EventHandler(){

			@Override
			public void handle(Event e) {
				try{
				printFileds(tname.getText(),tstreet.getText(),tcity.getText(),state.getText(),Integer.parseInt(tzip.getText()));
				}
				catch(Exception ex){}
			}
			
		});
	
	}
private void printFileds(String name,String street, String city,String state,int zip){
	System.out.println(name+"\n"+street+"\n"+city+","+state+" "+zip);
		
}
}