//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.controllers;

/**
 * @author Daniel Prachař
 * @creatin_date 20.12.2022
 */

//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class MenuController
{

    private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

    //link to fxml files
    @FXML
    public Button cinema_branch_btn;
    @FXML
    public Button employees_btn;
    @FXML
    public Button update_film_btn;
    @FXML
    public Button project_info_btn;
    @FXML
    public Button partners_btn;
    @FXML
    public Button exit_btn;
    @FXML
    public Button back_to_menu_btn;


    public MenuController() {

    }


    public void ShowInfoAboutCinemas(ActionEvent event)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("cinema_information.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 1300, 650); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Information about cinemas"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) cinema_branch_btn.getScene().getWindow();
            stageOld.close();

            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }
    }


    public void ShowPartners(ActionEvent event)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("partners.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Thank you partners"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) partners_btn.getScene().getWindow();
            stageOld.close();

            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }

    }

    public void ShowFilms(ActionEvent event)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("films.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("CRUD FILMS"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) update_film_btn.getScene().getWindow();
            stageOld.close();

            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }

    }

    public void BackToMenu(ActionEvent actionEvent) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("menu.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Welcome to the menu"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) back_to_menu_btn.getScene().getWindow();
            stageOld.close();

            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }
    }

    public void ApplicationExit(ActionEvent actionEvent) {
        Stage stage = (Stage) exit_btn.getScene().getWindow();
        stage.close();
    }

    public void ShowEmployees(ActionEvent actionEvent) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("injectionsAttacks.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Injections SQL attacks"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) employees_btn.getScene().getWindow();
            stageOld.close();

            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }
    }

    public void ShowProjectInfo(ActionEvent actionEvent) {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("project_info.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            Stage stage = new Stage();
            stage.setTitle("Project info"); //title
            stage.setScene(scene);

            Stage stageOld = (Stage) project_info_btn.getScene().getWindow();
            stageOld.close();

            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }
    }
}
