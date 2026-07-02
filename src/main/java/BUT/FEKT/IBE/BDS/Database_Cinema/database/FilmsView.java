package BUT.FEKT.IBE.BDS.Database_Cinema.database;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class FilmsView {

    //Declaration
    private IntegerProperty id_film = new SimpleIntegerProperty();
    private StringProperty films_name = new SimpleStringProperty();
    private IntegerProperty footage_minutes = new SimpleIntegerProperty();
    private StringProperty premiere = new SimpleStringProperty();

    //Gettery for list of films
    public int getId_film() {return id_filmProperty().get();}

    public String getFilms_name() {return films_nameProperty().get();}

    public int getFootage_minutes() {return footage_minutesProperty().get();}

    public String getPremiere() {return premiereProperty().get();}

    //Settery for list of films
    public void setId_film(Integer id_film) {this.id_film.set(id_film);}

    public void setFilms_name(String films_name) {this.films_name.set(films_name);}

    public void setFootage_minutes(Integer footage_minutes) {this.footage_minutes.set(footage_minutes);}

    public void setPremiere(String premiere) {this.premiereProperty().setValue(premiere);}

    //Properties
    public IntegerProperty id_filmProperty() {return id_film;}
    public StringProperty films_nameProperty() {return films_name;}
    public IntegerProperty footage_minutesProperty() {return footage_minutes;}

    public StringProperty premiereProperty(){return  premiere;}



}
