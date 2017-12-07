package utils;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class FxmlUtils {

	public static Pane fxmlLoader(String fxmlPath) {
		FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getClass().getResource(fxmlPath)) ; 
		loader.setResources(getResourceBundle());
		
		try {
			return loader.load() ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			DialogUtils.errordialog(e.getMessage());
		} 
		return null ; 
	}
	
	public static ResourceBundle getResourceBundle () {
		return ResourceBundle.getBundle("bundles.text") ; 
		
	}
}
