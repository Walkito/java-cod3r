package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppLayoutGridPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene principal = new Scene(new TesteGridPane(), 800, 600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
