//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.controllers;

/**
 * @author Daniel Prachař
 * @creatin_date 20.12.2022
*/

//list of imports
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.validation.ValidationSupport;
import org.controlsfx.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import BUT.FEKT.IBE.BDS.Database_Cinema.App;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.LoginRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.LoginService;
import java.io.IOException;


public class LoginController
{
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    //linking to fxml files

    @FXML
    private TextField usernameText;
    @FXML
    private PasswordField passwordText;
    @FXML
    private Button signInButton;
    @FXML
    private Button exit_btn;

    private LoginRepository loginRepository;
    private LoginService loginService;

    public LoginController() {
    }

    @FXML
    private void initialize()
    {
        usernameText.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                SignIn();
            }
        });
        passwordText.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                SignIn();
            }
        });
        initializeServices();
        ValidationSupport validation = new ValidationSupport();
        validation.registerValidator(usernameText, Validator.createEmptyValidator("The username must not be empty"));
        validation.registerValidator(passwordText, Validator.createEmptyValidator("The password must not be empty"));
        signInButton.disableProperty().bind(validation.invalidProperty());
        signInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SignIn();
            }
        });
        logger.info("LoginController initialized");
    }
    private void initializeServices() {
        loginRepository = new LoginRepository();
        loginService = new LoginService(loginRepository);
    }

    //Method to sign in: branching throws a popup based on login success
    private void SignIn()
    {
        String username = usernameText.getText();
        String password = passwordText.getText();
        if (loginService.login(username, password))
        {
            logger.info("User " + username + " logged in!");
            GoodLoginShowMenu();
        }
        else
        {
             WrongLogin();
            logger.info("Bad login attempt with email " + username + ".");
        }
    }


    //After successful login, the fxml file with the menu will be displayed
    private void GoodLoginShowMenu()
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("menu.fxml")); //link to selection menu
           Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Welcome to the menu"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) signInButton.getScene().getWindow();
            stageOld.close();

            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }

        //popup window for successful login
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Login successful");
        alert.setHeaderText("Login successful!");
        alert.setContentText("You may proceed to the application now.");

        //how long the window will be displayed
        Timeline idlestage = new Timeline(new KeyFrame(Duration.seconds(5), new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event) {
                alert.setResult(ButtonType.CANCEL);
                alert.hide();
            }
        }));
        idlestage.setCycleCount(1);
        idlestage.play();
        alert.showAndWait();
    }

    //popup window for unsuccessful login
    private void WrongLogin()
    {
        Alert notice = new Alert(Alert.AlertType.ERROR);
        notice.setTitle("Wrong credentials");
        notice.setHeaderText("Wrong login or password!");
        Timeline idlestage = new Timeline(new KeyFrame(Duration.seconds(5), new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event) {
                notice.setResult(ButtonType.CANCEL);
                notice.hide();
            }
        }));
        idlestage.setCycleCount(1);
        idlestage.play();
        notice.showAndWait();

    }

    public void ApplicationExit(ActionEvent actionEvent) {
        Stage stage = (Stage) exit_btn.getScene().getWindow();
        stage.close();
    }
}
