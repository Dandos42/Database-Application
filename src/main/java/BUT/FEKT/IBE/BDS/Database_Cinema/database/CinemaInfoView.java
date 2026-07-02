package BUT.FEKT.IBE.BDS.Database_Cinema.database;

import javafx.beans.property.*;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

public class CinemaInfoView {

    //Declaration
    private IntegerProperty id_cinema = new SimpleIntegerProperty();
    private StringProperty cinemas_name = new SimpleStringProperty();
    private StringProperty email = new SimpleStringProperty();
    private StringProperty free_parking = new SimpleStringProperty();
    private StringProperty wheel_chair = new SimpleStringProperty();



    //Gettery for cinema info
    public int getId_cinema() {return id_cinemaProperty().get();}

    public String getCinemas_name() {return cinemas_nameProperty().get();}

    public String getEmail() {return emailProperty().get();}

    public String getFree_parking() {return free_parkingProperty().get();}

    public String getWheel_chair() {return wheel_chairProperty().get();}

    //Settery for cinema info
    public void setId_cinema(int id_cinema) {this.id_cinema.set(id_cinema);}

    public void setCinemas_name(String cinemas_name) {this.cinemas_name.set(cinemas_name);}

    public void setEmail(String email) {this.email.set(email);}

    public void setFree_parking(String free_parking) {this.free_parking.set(free_parking);}

    public void setWheel_chair(String wheel_chair) {this.wheel_chair.set(wheel_chair);}


    //Properties
    public IntegerProperty id_cinemaProperty() {return id_cinema;}
    public StringProperty cinemas_nameProperty() {return cinemas_name;}
    public StringProperty emailProperty() {return email;}
    public StringProperty free_parkingProperty() {return free_parking;}
    public StringProperty wheel_chairProperty() {return wheel_chair;}

}
