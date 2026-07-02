//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.controllers;


/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.App;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.FilmsRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.FilmCreateView;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.FilmsService;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.validation.ValidationSupport;
import org.controlsfx.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.sql.Date;

public class FilmCreateController {
    private static final Logger logger = LoggerFactory.getLogger(FilmCreateController.class);

    //link to fxml files
    @FXML
    public Button back_to_menu_btn;
    @FXML
    public Button exit_btn;
    @FXML
    public Button create_film_btn;
    @FXML
    private TextField movie_name_text;
    @FXML
    private TextField footage_text;
    @FXML
    private TextField premiere_text;

    private FilmsService filmsService;
    private FilmsRepository filmsRepository;
    private ValidationSupport validation;

    @FXML
    public void initialize() {
        filmsRepository= new FilmsRepository();
       filmsService = new FilmsService(filmsRepository);

        validation = new ValidationSupport();
        validation.registerValidator(movie_name_text, Validator.createEmptyValidator("The films name must not be empty."));
        validation.registerValidator(footage_text, Validator.createEmptyValidator("The footage in minutes must not be empty."));

        create_film_btn.disableProperty().bind(validation.invalidProperty());

        logger.info("FilmCreateController initialized");
    }
    public void CreateNewFilm(ActionEvent actionEvent) {

        FilmCreateView filmCreateView = new FilmCreateView();
        filmCreateView.setFilms_name(movie_name_text.getText());
        filmCreateView.setFootage_minutes(Integer.valueOf(footage_text.getText()));
        filmCreateView.setPremiere(Date.valueOf(premiere_text.getText()));

        filmsService.CreateFilm(filmCreateView);
        CreateFilmOKDialog();


    }

    public void CreateFilmOKDialog()
    {
        //popup window for ok create film
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("The movie is successfully created!");
        alert.setHeaderText("the movie is successfully created");

        //how long the window will be displayed
        Timeline idlestage = new Timeline(new KeyFrame(Duration.seconds(2), new EventHandler<ActionEvent>()
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


    public void BackToMenu(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("films.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("CRUD FILMS"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) back_to_menu_btn.getScene().getWindow();
            stageOld.close();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }

    }

    public void ApplicationExit(ActionEvent actionEvent) {

        Stage stage = (Stage) exit_btn.getScene().getWindow();
        stage.close();
    }
}
