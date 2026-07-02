//package path
package BUT.FEKT.IBE.BDS.Database_Cinema;

/**
 * @author Daniel Prachař
 * @creatin_date 20.12.2022
 */

//list of imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App extends Application {


    private FXMLLoader loader;
    private VBox mainStage;
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static int userId;
    public static void main(String[] args) {
        launch(args);
    }

    //method to program launch
    @Override
    public void start(Stage primaryStage) {
        try {
            //loading the login window
            loader = new FXMLLoader(getClass().getResource("login.fxml"));
            mainStage = loader.load();

            //Opening title of window forms
            primaryStage.setTitle("Cinema Village database");
            Scene login = new Scene(mainStage);
            setUserAgentStylesheet(STYLESHEET_CASPIAN);
            primaryStage.setScene(login);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Exception in method start: " + e.getMessage());
            return;
        }
    }

}

