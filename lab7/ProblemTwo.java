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
public class ProblemTwo extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage myStage) throws Exception {	
		myStage.setTitle("String Utility");
		GridPane g=new GridPane();
		g.setPadding(new Insets(25,25,25,25));	
		Button countLetter=new Button("CountLetter");
		Button reverseLetter=new Button("ReverseLetter");
		Button removeDuplicate=new Button("RemoveDuplicate");
		Label input=new Label("Input");
		final TextField tInput=new TextField();
		Label output=new Label("Output");
		final TextField tOutput=new TextField();
		g.add(countLetter,1,0);g.add(reverseLetter,1,2);g.add(removeDuplicate,1,4);
		g.add(input, 2, 0);g.add(tInput, 2, 1);
		g.add(output, 2, 2);g.add(tOutput,2,3);
		myStage.setScene(new Scene(g,400,200));
		myStage.show();
		countLetter.setOnAction(new EventHandler(){

			@SuppressWarnings("restriction")
			@Override
			public void handle(Event e) {
				try{
				
				tOutput.setText(" "+(tInput.getText()).length());	
				}
				catch(Exception ex){}
			}
			
		});
		removeDuplicate.setOnAction(new EventHandler(){

			@Override
			public void handle(Event ee) {
				try{
					tOutput.setText(removeDuplicate(tInput.getText()));
				}
				catch(Exception ex){}
				
			}
			
		});
		
		reverseLetter.setOnAction(new EventHandler(){

			@Override
			public void handle(Event ee) {
				
					tOutput.setText(reversed(tInput.getText()));
				
				
			}
			
		});
	}
	private String reversed(String s){
		String end="";		
		if(s.length()==1){
			return end+s.charAt(0);
		}		
		return end+s.charAt(s.length()-1)+reversed(s.substring(0,s.length()-1));
		
	}
	private String removeDuplicate(String s){
		
		String temp=s;
		int flag=0;
		char c;
		for(int x=0; x<temp.length();x++){
			c=temp.charAt(x);
			flag=1;
			for(int y=0; y<temp.length(); y++){
				if(c==temp.charAt(y)){
					flag++;
				}
				//why 2, because it will compare to itself too
				if(flag>2){
					c=temp.charAt(y);
					temp=temp.substring(0,y)+temp.substring(y+1);
					y--;//because i removed one char from the string
					flag=2;//decrease by one for the same reason as y--
				}
				
			}
			
		}
		return temp;
	}
//	private String reversed(String s){
//		String reverse="";
//		if(s.length()==1){
//			return s.charAt(0)+reverse;
//		}
//		reverse=reversed(s.substring(1))+s.charAt(0);
//		return reverse;
//	}
}
