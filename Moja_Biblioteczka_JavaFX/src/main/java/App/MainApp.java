package App;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.spi.ResourceBundleControlProvider;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import utils.DialogUtils;
import utils.FxmlUtils;

public class MainApp extends Application {

	private static final String FXML_BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// TODO Auto-generated method stub
		Locale.setDefault(new Locale("PL"));
		Pane borderPane = FxmlUtils.fxmlLoader(FXML_BORDER_PANE_MAIN_FXML);

		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);

		primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title.aplication"));
		primaryStage.show();

	}

}
