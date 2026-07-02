package BUT.FEKT.IBE.BDS.Database_Cinema.database;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CinemaInfoDetailView {

    //Declaration
    private IntegerProperty id_cinema = new SimpleIntegerProperty();
    private StringProperty cinemas_name = new SimpleStringProperty();
    private StringProperty email = new SimpleStringProperty();
    private StringProperty free_parking = new SimpleStringProperty();
    private StringProperty wheel_chair = new SimpleStringProperty();

    private StringProperty city = new SimpleStringProperty();
    private StringProperty street = new SimpleStringProperty();
    private StringProperty house_number = new SimpleStringProperty();
    private StringProperty zip_code = new SimpleStringProperty();

    private StringProperty total_capacity = new SimpleStringProperty();
    private StringProperty projections = new SimpleStringProperty();
    private StringProperty comt = new SimpleStringProperty();
    private StringProperty opening = new SimpleStringProperty();
    private StringProperty closing = new SimpleStringProperty();


    //Gettery for cinema info
    public int getId_cinema() {return id_cinemaProperty().get();}

    public String getCinemas_name() {return cinemas_nameProperty().get();}

    public String getEmail() {return emailProperty().get();}

    public String getFree_parking() {return free_parkingProperty().get();}

    public String getWheel_chair() {return wheel_chairProperty().get();}

    public String getCity() {
        return cityProperty().get();
    }

    public String getStreet() {
        return streetProperty().get();
    }

    public String getHouse_number() {
        return house_numberProperty().get();
    }

    public String getZip_code() {
        return zip_codeProperty().get();
    }

    public String getTotal_capacity() {return total_capacityProperty().get();}

    public String getProjections() {return projectionsProperty().get();}

    public String getComt() {return comtProperty().get();}

    public String getOpening() {return openingProperty().get();}

    public String getClosing() {return closingProperty().get();}



    //Settery for cinema info
    public void setId_cinema(int id_cinema) {this.id_cinema.set(id_cinema);}
    public void setCinemas_name(String cinemas_name) {this.cinemas_name.set(cinemas_name);}
    public void setEmail(String email) {this.email.set(email);}
    public void setFree_parking(String free_parking) {this.free_parking.set(free_parking);}
    public void setWheel_chair(String wheel_chair) {this.wheel_chair.set(wheel_chair);}
    public void setCity(String city) {
        this.city.set(city);
    }
    public void setStreet(String street) {
        this.street.set(street);
    }
    public void setHouse_number(String house_number) {
        this.house_number.set(house_number);
    }
    public void setZip_code(String zip_code) {
        this.zip_code.set(zip_code);
    }

    public void setTotal_capacity(String total_capacity) {this.total_capacity.set(total_capacity);}

    public void setProjections(String projections) {this.projections.set(projections);}

    public void setComt(String comt) {this.comt.set(comt);}

    public void setOpening(String opening) {this.opening.set(opening);}

    public void setClosing(String closing) {this.closing.set(closing);}


    //Properties
    public IntegerProperty id_cinemaProperty() {return id_cinema;}
    public StringProperty cinemas_nameProperty() {return cinemas_name;}
    public StringProperty emailProperty() {return email;}
    public StringProperty free_parkingProperty() {return free_parking;}
    public StringProperty wheel_chairProperty() {return wheel_chair;}
    public StringProperty cityProperty() {return city;}
    public StringProperty streetProperty() {return street;}
    public StringProperty house_numberProperty() {return house_number;}
    public StringProperty zip_codeProperty() {return zip_code;}

    public StringProperty total_capacityProperty() {return total_capacity;}

    public StringProperty projectionsProperty() {return projections;}

    public StringProperty comtProperty() {return comt;}
    public StringProperty openingProperty() {return opening;}
    public StringProperty closingProperty() {return closing;}


}

