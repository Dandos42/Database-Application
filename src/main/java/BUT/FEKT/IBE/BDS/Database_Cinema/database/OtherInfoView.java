package BUT.FEKT.IBE.BDS.Database_Cinema.database;

import java.sql.Time;

public class OtherInfoView {

    //Declaration variables
    private Integer id_other_information;

    private Integer total_capacity;

    private String projections;
    private Integer count_of_movie_theater;

    //Gettery for other info
    public Integer getId_other_information() {return id_other_information;}

    public Integer getTotal_capacity() {return total_capacity;}

    public String getProjections() {return projections;}

    public Integer getCount_of_movie_theater() {return count_of_movie_theater;}

    //Settery for other info
    public void setId_other_information(Integer id_other_information) {this.id_other_information = id_other_information;}

    public void setTotal_capacity(Integer total_capacity) {this.total_capacity = total_capacity;}

    public void setProjections(String projections) {this.projections = projections;}

    public void setCount_of_movie_theater(Integer count_of_movie_theater) {this.count_of_movie_theater = count_of_movie_theater;}

    @Override
    public String toString()
    {
        return "OtherInformation{" + "id_other_information=" + id_other_information+ ", total_capacity=" + total_capacity+ ", projections=" + projections +", count_of_movie_theater=" + count_of_movie_theater +"}";
    }
}
