package App;

import java.util.ResourceBundle;
import java.util.spi.ResourceBundleControlProvider;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/BorderPaneMain.fxml")) ; 
		ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages") ;
		loader.setResources(bundle);
		
		BorderPane borderPane = loader.load() ; 
		Scene scene = new Scene(borderPane) ; 
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle(bundle.getString("tittle.application"));
		primaryStage.show();
	}

}
