//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.controllers;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.App;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.FilmsRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.FilmsView;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.FilmsService;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class FilmsController {

    //link fxml files table + column
    private static final Logger logger = LoggerFactory.getLogger(FilmsController.class);

    @FXML
    private TableColumn<FilmsView, Integer> id_film_clm;
    @FXML
    private TableColumn<FilmsView, String> films_name_clm;
    @FXML
    private TableColumn<FilmsView, Integer> footage_clm;
    @FXML
    private TableColumn<FilmsView, String> premiere_date_clm;
    @FXML
    private TableView<FilmsView> list_of_films_tab;

    //others
    @FXML
    public Button create_film_btn;
    @FXML
    public Button delete_film_btn;
    @FXML
    public Button refresh_film_btn;
    @FXML
    public Button edit_film_btn;
    @FXML
    public Button exit_btn;
    @FXML
    public Button back_to_menu_btn;
    @FXML
    public Button filter_btn;
    @FXML
    private TextField filter_text;

    //Declaration
    private FilmsService filmsService;
    private FilmsRepository filmsRepository;


    @FXML
    private void initialize() {
        filmsRepository = new FilmsRepository();
        filmsService = new FilmsService(filmsRepository);

        id_film_clm.setCellValueFactory(new PropertyValueFactory<FilmsView, Integer>("id_film"));
        films_name_clm.setCellValueFactory(new PropertyValueFactory<FilmsView, String>("films_name"));
        footage_clm.setCellValueFactory(new PropertyValueFactory<FilmsView, Integer>("footage_minutes"));
        premiere_date_clm.setCellValueFactory(new PropertyValueFactory<FilmsView, String>("premiere"));

        ObservableList<FilmsView> observableFilmList = initializeFilmsData();
        list_of_films_tab.setItems(observableFilmList);

        list_of_films_tab.getSortOrder().add(id_film_clm);


        logger.info("FilmController initialized");
    }

    private ObservableList<FilmsView> initializeFilmsData() {
        List<FilmsView> films = filmsService.getFilmsView();
        return FXCollections.observableArrayList(films);
    }

    public void ApplicationExit(ActionEvent actionEvent) {
        Stage stage = (Stage) exit_btn.getScene().getWindow();
        stage.close();
    }

    public void BackToMenu(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("menu.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Welcome to the menu"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) back_to_menu_btn.getScene().getWindow();
            stageOld.close();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }

    }

    public void EditFilm(ActionEvent actionEvent) {


        FilmsView filmsView = list_of_films_tab.getSelectionModel().getSelectedItem();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(App.class.getResource("editFilm.fxml")); //link to selection menu
                Stage stage = new Stage();
                stage.setUserData(filmsView);
                stage.setTitle("Edit film"); //title

                //Create controller
                FilmEditController controller = new FilmEditController();
                controller.setStage(stage);
                fxmlLoader.setController(controller);

                Stage stageOld = (Stage) edit_film_btn.getScene().getWindow();
                stageOld.close();
                Scene scene = new Scene(fxmlLoader.load(), 600, 400); //load fxml file + size file
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
            }

        list_of_films_tab.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

               list_of_films_tab.getSelectionModel().getSelectedItem().getId_film();
                ObservableList<FilmsView> observableMeetingList = FXCollections.observableArrayList(filmsService.getFilmsView());
                list_of_films_tab.setItems(observableMeetingList);
            }
        });



    }

    public void DeleteFilm(ActionEvent actionEvent) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("deleteFilm.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Delete film"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) delete_film_btn.getScene().getWindow();
            stageOld.close();
            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }
    }

    public void CreateFilm(ActionEvent actionEvent) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("createFilm.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Create new Film"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) create_film_btn.getScene().getWindow();
            stageOld.close();
            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }
    }

    public void RefreshFilm(ActionEvent actionEvent) {
        ObservableList<FilmsView> observableFilmRefreshList = initializeFilmsData();
        list_of_films_tab.setItems(observableFilmRefreshList);
        list_of_films_tab.refresh();
        list_of_films_tab.sort();

        RefresheFilmOKDialog();

    }


    public void RefresheFilmOKDialog()
    {
        //popup window for ok create film
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Films successfully refreshed!");
        alert.setHeaderText("Films successfully refreshed");

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

    public void FilterFilm(ActionEvent actionEvent) {
        try
        {
            Integer footage = Integer.valueOf(filter_text.getText());
            ObservableList<FilmsView> observableList =
                    FXCollections.observableArrayList(filmsService.getFilterFilm(footage));
            list_of_films_tab.setItems(observableList);
            list_of_films_tab.refresh();
            list_of_films_tab.sort();
        } catch (NumberFormatException ex)
        {
            logger.error("Couldn't filter, wrong user input" + ex.getMessage());
        }
    }
}
