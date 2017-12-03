package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

	   private MainController mainController ; 
	   
	    @FXML
	    void openLibrary(ActionEvent event) {
	    	System.out.println("library");

	    }

	    @FXML
	    void openListBooks(ActionEvent event) {

	    }

	    @FXML
	    void openStats(ActionEvent event) {

	    }



		public void setMainController(MainController mainController) {
			this.mainController = mainController;
		}

	}
