package BUT.FEKT.IBE.BDS.Database_Cinema.database;

import java.sql.Time;

public class OpenHoursView {
    //Declaration variables
    private Integer id_open_hours;

    private Time opening;

    private Time closing;

    //Gettery for opening hours
    public Integer getId_open_hours() {return id_open_hours;}

    public Time getOpening() {return opening;}

    public Time getClosing() {return closing;}

    //Settery for opening hours
    public void setId_open_hours(Integer id_open_hours) {this.id_open_hours = id_open_hours;}

    public void setOpening(Time opening) {this.opening = opening;}

    public void setClosing(Time closing) {this.closing = closing;}

    @Override
    public String toString()
    {
        return "OpeningHours{" + "id_opening_hours=" + id_open_hours+ ", opening=" + opening+ ", closing=" + closing +"}";
    }
}
