package fr.asco.areva.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class Controller implements Initializable{



	@FXML private ComboBox ciudad;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		//ciudad.getItems().setAll("test","tt");
	}
	@FXML
	public void excel(ActionEvent evt){
		System.out.println("oui ");

	}
	public void setdate(){
		ciudad.getItems().setAll("test","tt");

	}
}
