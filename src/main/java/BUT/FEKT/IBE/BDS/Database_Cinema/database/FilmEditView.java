package BUT.FEKT.IBE.BDS.Database_Cinema.database;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

import java.sql.Date;

public class FilmEditView {

    //Declaration
    private Integer id_film;
    private String films_name;
    private Integer footage;
    private Date premiere;

    //Gettery for edit film
    public Integer getId_film() {return id_film;}

    public String getFilms_name() {return films_name;}

    public Integer getFootage() {return footage;}

    public Date getPremiere() {return premiere;}

    //Settery for edit film

    public void setId_film(Integer id_film) {this.id_film = id_film;}

    public void setFilms_name(String films_name) {this.films_name = films_name;}

    public void setFootage(Integer footage) {this.footage = footage;}

    public void setPremiere(Date premiere) {this.premiere = premiere;}


    @Override
    public String toString() {
        return "FilmEditView{" + "id_film,='" + id_film + '\'' + ", films_name='" + films_name + '\'' + ", footage_minutes='" + footage + '\''  + ", premiere='" + premiere + '\''  + '}';
    }




}
