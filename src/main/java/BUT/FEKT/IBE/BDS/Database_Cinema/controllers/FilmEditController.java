//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.controllers;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.App;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.FilmsRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.FilmEditView;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.FilmsView;
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


public class FilmEditController {
    private static final Logger logger = LoggerFactory.getLogger(FilmEditController.class);

    //link to fxml files
    @FXML
    public Button back_to_menu_btn;
    @FXML
    public Button edit_film_btn;
    @FXML
    private TextField edit_id_film_text;
    @FXML
    private TextField edit_film_name_text;
    @FXML
    private TextField edit_footage_text;
    @FXML
    private TextField edit_premiere_text;



    //Declaration
    private FilmsService filmsService;
    private FilmsRepository filmsRepository;
    private ValidationSupport validation;
    public Stage stage;
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void initialize() {

        filmsRepository= new FilmsRepository();
        filmsService = new FilmsService(filmsRepository);

        validation = new ValidationSupport();
        validation.registerValidator(edit_id_film_text, Validator.createEmptyValidator("The id_film must not be empty."));
        edit_id_film_text.setEditable(false);
        validation.registerValidator(edit_film_name_text, Validator.createEmptyValidator("The films name must not be empty."));
        validation.registerValidator(edit_footage_text, Validator.createEmptyValidator("The footage in minutes must not be empty."));

         edit_film_btn.disableProperty().bind(validation.invalidProperty());

        LoadData();

        logger.info("FilmEditController initialized");
    }

    private void LoadData() {
        Stage stage = this.stage;
        if (stage.getUserData() instanceof FilmsView) {
            FilmsView filmsView = (FilmsView) stage.getUserData();
            edit_id_film_text.setText(String.valueOf(filmsView.getId_film()));
            edit_film_name_text.setText(filmsView.getFilms_name());
            edit_footage_text.setText(String.valueOf(filmsView.getFootage_minutes()));
            edit_premiere_text.setText(String.valueOf(filmsView.getPremiere()));
        }
    }

    @FXML
    public void EditFilm(ActionEvent actionEvent) {

        FilmEditView filmEditView = new FilmEditView();

        filmEditView.setId_film(Integer.valueOf(edit_id_film_text.getText()));
        filmEditView.setFilms_name(edit_film_name_text.getText());
        filmEditView.setFootage(Integer.valueOf(edit_footage_text.getText()));
        filmEditView.setPremiere(Date.valueOf(edit_premiere_text.getText()));


        filmsService.EditFilm(filmEditView);

        EditFilmOKDialog();
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

    public void EditFilmOKDialog() {
        //popup window for delete film ok
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("The movie is successfully edited!");
        alert.setHeaderText("the movie is successfully edited");

        //how long the window will be displayed
        Timeline idlestage = new Timeline(new KeyFrame(Duration.seconds(2), new EventHandler<ActionEvent>() {
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


}


