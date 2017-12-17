package utils;

import java.awt.TextArea;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class DialogUtils {
	static ResourceBundle bundle = FxmlUtils.getResourceBundle() ; 
	
	public static void dialogAboutAplictation() {
		Alert informationAlert = new Alert(Alert.AlertType.INFORMATION) ; 
		informationAlert.setTitle(bundle.getString("about"));	
		informationAlert.setHeaderText(bundle.getString("about.header"));
		informationAlert.setContentText(bundle.getString("about.content"));
		informationAlert.showAndWait() ; 
		
	}
	
	public static Optional<ButtonType> confitmationDialog() { 
		Alert confirmationAlert = new Alert (Alert.AlertType.CONFIRMATION);
		confirmationAlert.setTitle(bundle.getString("exit.title"));
		confirmationAlert.setHeaderText(bundle.getString("exit.header"));
		Optional<ButtonType> result = confirmationAlert.showAndWait() ; 
		return result ; 
	}
	
	public static void errordialog(String error) {
		Alert errorAlert = new Alert(Alert.AlertType.ERROR) ; 
		errorAlert.setTitle(bundle.getString("exit1.title"));
		errorAlert.setHeaderText(bundle.getString("exit1.header"));
		errorAlert.setContentText(error);
		errorAlert.showAndWait() ; 
	}
}
