package Controllers;


import java.io.IOException;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainController {
	
	private static final String STYLESHEET_CASPIAN = "CASPIAN";

	private static final String STYLESHEET_MODENA = "MODENA";

	@FXML
	private BorderPane borderPane ; 

	@FXML
	private TopMenuButtonsController topMenuButtonsController ; 
	
	@FXML
	private void initialize () {
		topMenuButtonsController.setMainController(this);
		
	} 
	
	@FXML
	public void closeAplication () {
		Platform.exit();
		System.exit(0);
	}
	
	@FXML
	public void setCaspian() {
		Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
	}
	
	@FXML
	public void setModena() {
		Application.setUserAgentStylesheet(STYLESHEET_MODENA);
	}
	
	@FXML
	public void setAlwaysOnTop(ActionEvent actionEvent) {
		Stage stage = (Stage) borderPane.getScene().getWindow() ; 
		boolean value =  ((CheckMenuItem) actionEvent.getSource()).selectedProperty().get() ; 
		stage.setAlwaysOnTop(value);
	}
	
	@FXML
	public void about() {
			
	}

	
	public void setCenter(String fxmlPath) {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath)) ; 
		
		HBox hBox = null ; 
		
			try {
				hBox = loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		borderPane.setCenter(hBox);
	}


}