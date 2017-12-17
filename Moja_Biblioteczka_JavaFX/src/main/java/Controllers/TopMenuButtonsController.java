package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;
import utils.DialogUtils;

public class TopMenuButtonsController {

	public static final String ADD_BOOK_FXML = "/fxml/AddBook.fxml";
	
	public static final String STATISTICS_FXML = "/fxml/Statistics.fxml";

	public static final String LIST_OF_BOOKS_FXML = "/fxml/ListOfBooks.fxml";

	public static final String LIBRARY_FXML = "/fxml/Library.fl";

	private MainController mainController ; 
	   
	   @FXML
	   private ToggleGroup toggleButtons ;
	   
	   
	    @FXML
	    void openLibrary(ActionEvent event) {	    	
	    	mainController.setCenter(LIBRARY_FXML) ; 	    	
	    	
	    }

	    @FXML
	    void openListBooks(ActionEvent event) {
	    	mainController.setCenter(LIST_OF_BOOKS_FXML);
	    }

	    @FXML
	    void openStats(ActionEvent event) {
	    	mainController.setCenter(STATISTICS_FXML);
	    }

	    @FXML
	    void addBook () {
	    	if(toggleButtons.getSelectedToggle()!=null) {
	    		toggleButtons.getSelectedToggle().setSelected(false);
	    	}
	    	
	    	mainController.setCenter(ADD_BOOK_FXML);
	    }


		public void setMainController(MainController mainController) {
			this.mainController = mainController;
		}

	}
