//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.controllers;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */


//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.App;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.EmployeesRespository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.InjectionsAttacksView;
import BUT.FEKT.IBE.BDS.Database_Cinema.services.EmployeesService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.List;

public class InjectionsAttacksController {

    private static final Logger logger = LoggerFactory.getLogger(InjectionsAttacksController.class);

    //link fxml files table + column
    @FXML
    private TableColumn<InjectionsAttacksView, Integer> id_employee_clm;
    @FXML
    private TableColumn<InjectionsAttacksView, String> first_name_clm;
    @FXML
    private TableColumn<InjectionsAttacksView, String> last_name_clm;
    @FXML
    private TableColumn<InjectionsAttacksView, String> username_clm;
    @FXML
    private TableView<InjectionsAttacksView> employees_tab;

    //link to fxml files others
    @FXML
    public Button exit_btn;
    @FXML
    public Button back_to_menu_btn;
    @FXML
    public TextField injections_text;

    @FXML
    public Button execute_btn;

    //declaration
    private EmployeesService employeesService;
    private EmployeesRespository employeesRespository;
    private Stage stage;
    public void setStageInjection(Stage stage)
    {
        this.stage = stage;
    }

    @FXML
    private void initialize() {
        employeesRespository = new EmployeesRespository();
        employeesService = new EmployeesService(employeesRespository);

        id_employee_clm.setCellValueFactory(new PropertyValueFactory<InjectionsAttacksView, Integer>("id_employee"));
        first_name_clm.setCellValueFactory(new PropertyValueFactory<InjectionsAttacksView, String>("first_name"));
        last_name_clm.setCellValueFactory(new PropertyValueFactory<InjectionsAttacksView, String>("last_name"));
        username_clm.setCellValueFactory(new PropertyValueFactory<InjectionsAttacksView, String>("username"));

        ObservableList<InjectionsAttacksView> observableAI = initializeEmployeesData();
        employees_tab.setItems(observableAI);

        employees_tab.getSortOrder().add(id_employee_clm);

        logger.info("InjectionsAttacksController initialized");
    }

    private ObservableList<InjectionsAttacksView> initializeEmployeesData()
    {
        List<InjectionsAttacksView> employees = employeesService.getInjectionAttacks(injections_text.getText());
        return FXCollections.observableArrayList(employees);
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

    public void ExecuteCommand(ActionEvent actionEvent){
        ObservableList<InjectionsAttacksView> observableList = initializeEmployeesData();
        employees_tab.setItems(observableList);
    }
}
