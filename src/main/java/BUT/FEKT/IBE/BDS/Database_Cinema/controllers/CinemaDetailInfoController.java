//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.controllers;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.App;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.CinemaInfoRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.CinemaInfoDetailView;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.CinemaInfoService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.validation.ValidationSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class CinemaDetailInfoController {
    private static final Logger logger = LoggerFactory.getLogger(CinemaDetailInfoController.class);

    //Link to fxml stuff (detail information about cinema)
    @FXML
    private TextField id_cinema_detail_text;
    @FXML
    private TextField cinemas_name_detail_text;
    @FXML
    private TextField email_detail_text;
    @FXML
    private TextField park_detail_text;
    @FXML
    private TextField wa_detail_text;
    @FXML
    private TextField city_detail_text;
    @FXML
    private TextField street_detail_text;
    @FXML
    private TextField hn_detail_text;
    @FXML
    private TextField zipc_code_detail_text;
    @FXML
    private TextField total_capacity_detail_text;
    @FXML
    private TextField projections_detail_text;
    @FXML
    private TextField comt_detail_text;
    @FXML
    private TextField open_detail_text;
    @FXML
    private TextField close_detail_text;

    //Others stuff
    @FXML
    public Button back_to_menu_btn;
    @FXML
    public Button exit_btn;


    //Declaration
    private ValidationSupport validation;
    public Stage stagedetail;
    public void setStagedetail(Stage stagedetail) {
        this.stagedetail = stagedetail;
    }

    private CinemaInfoService cinemaInfoServiceDetail;
    private CinemaInfoRepository cinemaInfoRepositoryDetail;


    @FXML
    private void initialize() {

        //elements cannot be edited
        id_cinema_detail_text.setEditable(false);
        cinemas_name_detail_text.setEditable(false);
        email_detail_text.setEditable(false);
        park_detail_text.setEditable(false);
        wa_detail_text.setEditable(false);
        city_detail_text.setEditable(false);
        street_detail_text.setEditable(false);
        hn_detail_text.setEditable(false);
        zipc_code_detail_text.setEditable(false);
        total_capacity_detail_text.setEditable(false);
        projections_detail_text.setEditable(false);
        comt_detail_text.setEditable(false);
        open_detail_text.setEditable(false);
        close_detail_text.setEditable(false);

        //calling the method - loadData
        LoadData();
        logger.info("CinemaDetailController initialized");
    }

    //Linking text fields with data from the database
    private void LoadData() {
        Stage stagedetail = this.stagedetail;
        if (stagedetail.getUserData() instanceof CinemaInfoDetailView) {
            CinemaInfoDetailView cinemaInfoDetailView = (CinemaInfoDetailView) stagedetail.getUserData();
            id_cinema_detail_text.setText(String.valueOf(cinemaInfoDetailView.getId_cinema()));
            cinemas_name_detail_text.setText(cinemaInfoDetailView.getCinemas_name());
            email_detail_text.setText(cinemaInfoDetailView.getEmail());
            park_detail_text.setText(cinemaInfoDetailView.getFree_parking());
            wa_detail_text.setText(cinemaInfoDetailView.getWheel_chair());
            city_detail_text.setText(cinemaInfoDetailView.getCity());
            street_detail_text.setText(cinemaInfoDetailView.getStreet());
            hn_detail_text.setText(cinemaInfoDetailView.getHouse_number());
            zipc_code_detail_text.setText(cinemaInfoDetailView.getZip_code());
            total_capacity_detail_text.setText(cinemaInfoDetailView.getTotal_capacity());
            projections_detail_text.setText(cinemaInfoDetailView.getProjections());
            comt_detail_text.setText(cinemaInfoDetailView.getComt());
            open_detail_text.setText(cinemaInfoDetailView.getOpening());
            close_detail_text.setText(cinemaInfoDetailView.getClosing());

        }
    }

    //Button exit
    public void ApplicationExit(ActionEvent actionEvent) {
        Stage stage = (Stage) exit_btn.getScene().getWindow();
        stage.close();
    }

    public void BackToMenu(ActionEvent actionEvent) {

        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("cinema_information.fxml")); //link to selection menu
            Scene scene = new Scene(fxmlLoader.load(), 1300, 650); //load fxml file + size file
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
}
