package BUT.FEKT.IBE.BDS.Database_Cinema.database;


/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */


import java.sql.Date;

public class FilmCreateView {

    //Declaration
    private String films_name;
    private Integer footage_minutes;
    private Date premiere;

    //Gettery for create film
    public String getFilms_name() {
        return films_name;
    }

    public Integer getFootage_minutes() {
        return footage_minutes;
    }

    public Date getPremiere() {
        return premiere;
    }

    //Settery for create film
    public void setFilms_name(String films_name) {
        this.films_name = films_name;
    }

    public void setFootage_minutes(Integer footage_minutes) {
        this.footage_minutes = footage_minutes;
    }

    public void setPremiere(Date premiere) {
        this.premiere = premiere;
    }

    @Override
    public String toString() {
        return "FilmCreateView{" + "films_name='" + films_name + '\'' + "footage_minutes='" + footage_minutes + '\'' + "premiere='" + premiere + '\'' + '}';
    }
}
