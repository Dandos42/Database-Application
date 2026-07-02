//package pat
package BUT.FEKT.IBE.BDS.Database_Cinema.controllers;

/**
 * @author Daniel Prachař
 * @creatin_date 26.12.2022
 */

//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.App;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.AddressRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.CinemaInfoRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.OpenHoursRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.OtherInfoRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.*;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.AddressService;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.CinemaInfoService;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.OpenHoursService;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.OtherInfoService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.List;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import java.sql.Time;


public class CinemaInfoController {
    private static final Logger logger = LoggerFactory.getLogger(CinemaInfoController.class);

    //link to fxml files address table and columns
    @FXML
    private TableColumn<AddressView, Integer> id_address_clm;
    @FXML
    private TableColumn<AddressView, String> city_clm;
    @FXML
    private TableColumn<AddressView, String> street_clm;
    @FXML
    private TableColumn<AddressView, String> house_number_clm;
    @FXML
    private TableColumn<AddressView, String> zip_clm;
    @FXML
    private TableView<AddressView> address_tab;

    @FXML
    private TableColumn<AddressView, Integer> id_address_clm_all;
    @FXML
    private TableColumn<AddressView, String> city_clm_all;
    @FXML
    private TableColumn<AddressView, String> street_clm_all;
    @FXML
    private TableColumn<AddressView, String> house_number_clm_all;
    @FXML
    private TableColumn<AddressView, String> zip_clm_all;
    @FXML
    private TableView<AddressView> address_tab_all;

    //link to fxml files cinema table and columns
    @FXML
    private TableColumn<CinemaInfoView, Integer> id_cinema_clm;
    @FXML
    private TableColumn<CinemaInfoView, String> cinemas_name_clm;
    @FXML
    private TableColumn<CinemaInfoView, String> email_clm;
    @FXML
    private TableColumn<CinemaInfoView, Boolean> free_park_clm;
    @FXML
    private TableColumn<CinemaInfoView, Boolean> wheel_clm;
    @FXML
    private TableView<CinemaInfoView> cinema_tab;

    //link to fxml files opening hours table and columns
    @FXML
    private TableColumn<OpenHoursView, Integer> id_open_clm;
    @FXML
    private TableColumn<OpenHoursView, Time> open_clm;
    @FXML
    private TableColumn<OpenHoursView, Time> clos_clm;
    @FXML
    private TableView<OpenHoursView>  opening_tab;

    //link to fxml files - Other information about cinema
    @FXML
    private TableColumn<OtherInfoView, Integer> id_other_info_clm;
    @FXML
    private TableColumn<OtherInfoView, Integer> total_capacity_clm;
    @FXML
    private TableColumn<OtherInfoView, String> projection_clm;
    @FXML
    private TableColumn<OtherInfoView, Integer>  count_of_movie_hall_clm;
    @FXML
    private TableView<OtherInfoView>  other_info_tab;

    @FXML
    public Button exit_btn;
    @FXML
    public Button back_to_menu_btn;
    @FXML
    public Button detail_info_btn;


    //Declaration
    private CinemaInfoService cinemaInfoService;
    private CinemaInfoRepository cinemaInfoRepository;
    private AddressService addressService;
    private AddressRepository addressRepository;
    private OpenHoursService openHoursService;
    private OpenHoursRepository openHoursRepository;
    private OtherInfoService otherInfoService;
    private OtherInfoRepository otherInfoRepository;

    @FXML
    private void initialize() {
        cinemaInfoRepository  = new CinemaInfoRepository();
        cinemaInfoService = new CinemaInfoService(cinemaInfoRepository);

        id_cinema_clm.setCellValueFactory(new PropertyValueFactory<CinemaInfoView, Integer>("id_cinema"));
        cinemas_name_clm.setCellValueFactory(new PropertyValueFactory<CinemaInfoView, String>("cinemas_name"));
        email_clm.setCellValueFactory(new PropertyValueFactory<CinemaInfoView, String>("email"));
        free_park_clm.setCellValueFactory(new PropertyValueFactory<CinemaInfoView, Boolean>("free_parking"));
        wheel_clm.setCellValueFactory(new PropertyValueFactory<CinemaInfoView, Boolean>("wheel_chair"));

        ObservableList<CinemaInfoView> observableCinemaList = initializeCinemasData();
        cinema_tab.setItems(observableCinemaList);

        cinema_tab.getSortOrder().add(id_cinema_clm);

        initializeAddressTable();
        initializeOpenHoursTable();
        initializeOtherInfoTable();
        initializeAddressTableAll();

        logger.info("CinemaController initialized");
    }


    private ObservableList<CinemaInfoView> initializeCinemasData()
    {
        List<CinemaInfoView> cinemas= cinemaInfoService.getCinemaInfoViews();
        return FXCollections.observableArrayList(cinemas);
    }

    private void initializeAddressTable()
    {
        addressRepository = new AddressRepository();
        addressService = new AddressService(addressRepository);

        id_address_clm.setCellValueFactory(new PropertyValueFactory<AddressView, Integer>("id_address"));
        city_clm.setCellValueFactory(new PropertyValueFactory<AddressView, String>("city"));
        street_clm.setCellValueFactory(new PropertyValueFactory<AddressView, String>("street"));
        house_number_clm.setCellValueFactory(new PropertyValueFactory<AddressView, String>("house_number"));
        zip_clm.setCellValueFactory(new PropertyValueFactory<AddressView, String>("zip_code"));

        LinkAllTable();

    }

    private void initializeAddressTableAll()
    {
        addressRepository = new AddressRepository();
        addressService = new AddressService(addressRepository);

        id_address_clm_all.setCellValueFactory(new PropertyValueFactory<AddressView, Integer>("id_address"));
        city_clm_all.setCellValueFactory(new PropertyValueFactory<AddressView, String>("city"));
        street_clm_all.setCellValueFactory(new PropertyValueFactory<AddressView, String>("street"));
        house_number_clm_all.setCellValueFactory(new PropertyValueFactory<AddressView, String>("house_number"));
        zip_clm_all.setCellValueFactory(new PropertyValueFactory<AddressView, String>("zip_code"));

        LinkAllTable();

    }

    private void initializeOpenHoursTable()
    {
        openHoursRepository = new OpenHoursRepository();
        openHoursService = new OpenHoursService(openHoursRepository);

        id_open_clm.setCellValueFactory(new PropertyValueFactory<OpenHoursView, Integer>("id_open_hours"));
        open_clm.setCellValueFactory(new PropertyValueFactory<OpenHoursView, Time>("opening"));
        clos_clm.setCellValueFactory(new PropertyValueFactory<OpenHoursView, Time>("closing"));

        LinkAllTable();
    }

    private void initializeOtherInfoTable()
    {
        otherInfoRepository= new OtherInfoRepository();
        otherInfoService = new OtherInfoService(otherInfoRepository);

        total_capacity_clm.setCellValueFactory(new PropertyValueFactory<OtherInfoView, Integer>("total_capacity"));
        projection_clm.setCellValueFactory(new PropertyValueFactory<OtherInfoView, String>("projections"));
        count_of_movie_hall_clm.setCellValueFactory(new PropertyValueFactory<OtherInfoView, Integer>("count_of_movie_theater"));

        LinkAllTable();
    }

    public void LinkAllTable(){
        cinema_tab.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                Integer id_address = cinema_tab.getSelectionModel().getSelectedItem().getId_cinema();
                ObservableList<AddressView> observableAddressList = FXCollections.observableArrayList(addressService.findById(id_address));
                address_tab.setItems(observableAddressList);

                Integer id_open = cinema_tab.getSelectionModel().getSelectedItem().getId_cinema();
                ObservableList<OpenHoursView> observableOpenHoursList = FXCollections.observableArrayList(openHoursService.findById(id_open));
                opening_tab.setItems(observableOpenHoursList);

                Integer id_other_info = cinema_tab.getSelectionModel().getSelectedItem().getId_cinema();
                ObservableList<OtherInfoView> observableOtherInfoList = FXCollections.observableArrayList(otherInfoService.findById(id_other_info));
                other_info_tab.setItems(observableOtherInfoList);

                cinema_tab.getSelectionModel().getSelectedItem().getId_cinema();
                ObservableList<AddressView> observableAddress_all = FXCollections.observableArrayList(addressService.findAll());
                address_tab_all.setItems(observableAddress_all);

            }


        });
    }
    
    
    public void ApplicationExit(ActionEvent actionEvent) {
        Stage stage = (Stage) exit_btn.getScene().getWindow();
        stage.close();
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

    public void DetailCinemaInfo(ActionEvent actionEvent) {

        CinemaInfoView cinemaInfoView= cinema_tab.getSelectionModel().getSelectedItem();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(App.class.getResource("detail_cinema_info.fxml")); //link to selection menu
            Stage stagedetail = new Stage();
            stagedetail.setTitle("Detail cinema info"); //title

            Integer id_cinema = cinemaInfoView.getId_cinema();


            CinemaInfoDetailView cinemaInfoDetailView = cinemaInfoService.getCinemaDetailView(id_cinema);
            stagedetail.setUserData(cinemaInfoDetailView);

            //Create controller
            CinemaDetailInfoController controller = new CinemaDetailInfoController();
            controller.setStagedetail(stagedetail);
            fxmlLoader.setController(controller);

            Stage stageOld = (Stage) detail_info_btn.getScene().getWindow();
            stageOld.close();
            Scene scene = new Scene(fxmlLoader.load(), 800, 600); //load fxml file + size file
            stagedetail.setScene(scene);
            stagedetail.show();
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(String.format("Error loading fxml file!\nMessage: %s", e.getMessage()));
        }

        cinema_tab.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });

    }
}
