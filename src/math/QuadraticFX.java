package math;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class QuadraticFX extends Application
{

	Quadratic Q = new Quadratic(0,0,0);
	
	private Label ans1;
	private Label ans2;
	private Label message;
	private TextField A;
	private TextField B;
	private TextField C;
	
	
	private boolean error;
	
	public void start(Stage primarystage)
	{
		
		Label inputA = new Label("A:");
		Label inputB = new Label("B:");
		Label inputC = new Label("C:");
		
		
		
		Button calc = new Button("Calculate");
		calc.setOnAction(this::processpush);
		
		message = new Label("");
		
		ans1 = new Label("---");
		ans2 = new Label("---");
		
				
		A = new TextField();
		B = new TextField();
		C = new TextField();
		
		A.setOnAction(this::processpush);
		B.setOnAction(this::processpush);
		C.setOnAction(this::processpush);
		
		FlowPane thePane = new FlowPane(inputA,A,inputB,B,inputC,C,calc,ans1,ans2,message);
		thePane.setHgap(30);
		thePane.setStyle("-fx-background-color: azure");
	
		Scene scene = new Scene(thePane,500,100);
		
		primarystage.setTitle("quadratic Ver.1.2.1");
		primarystage.setScene(scene);
		primarystage.show();
		
		
		
	}
	
	
	
	
	public void processpush(ActionEvent event)
	{
		try
		{
			message.setText("");
			error = false;
			Q.setA(Double.parseDouble(A.getText()));
			Q.setB(Double.parseDouble(B.getText()));
			Q.setC(Double.parseDouble(C.getText()));
			
		}
		catch (NumberFormatException exception)
		{
			message.setText("Make sure all fields are filled with numbers"); 
			error = true;
			ans1.setText("---");
			ans2.setText("---");
			
			String bruh = "bruh_2.mp3";
			Media hit = new Media(new File(bruh).toURI().toString());
			MediaPlayer bruhMoment = new MediaPlayer(hit);
			bruhMoment.play();
			
		}
		finally
		{
			if (error == false)
			{
				ans1.setText(Q.getans1());
				ans2.setText(Q.getans2());
			}
		}
		
	}
	public static void main(String[] args)
	{
		launch(args);
	}
	
}	
	





	

