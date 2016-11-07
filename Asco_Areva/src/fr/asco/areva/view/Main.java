package fr.asco.areva.view;

import fr.asco.areva.controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.*;
public class Main  extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		//Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		FXMLLoader loader =  new FXMLLoader(getClass().getResource("Sample.fxml"));
		Parent root = loader.load();
		Controller moncontroller = loader.getController();
		moncontroller.setdate();
		stage.setTitle("Test");
		stage.setScene(new Scene(root,1000,600));
		stage.show();


	}


	public static void main(String[]args){
		Application.launch(args);
	}

}
