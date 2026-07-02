package BUT.FEKT.IBE.BDS.Database_Cinema.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.*;
import BUT.FEKT.IBE.BDS.Database_Cinema.configuration.DataSourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CinemaInfoRepository
{
    private static final Logger logger = LoggerFactory.getLogger(CinemaInfoRepository.class);
    public List<CinemaInfoView> getCinemaView()
    {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT id_cinema, cinemas_name, email, free_parking, wheelchair_access, id_address, city, street, house_number, zip_code, total_capacity, projections, count_of_movie_theater, id_opening_hours, opening, closing" +
                             " FROM bds.cinema p" +
                             " LEFT JOIN bds.address a ON p.id_cinemas_address = a.id_address LEFT JOIN bds.has_other_information h ON p.id_other_information = h.id_other_information LEFT JOIN bds.opening_hours o ON p.id_opens_closes = o.id_opening_hours");
             ResultSet resultSet = preparedStatement.executeQuery())
        {
            List<CinemaInfoView> CinemaInfoViews = new ArrayList<>();
            while (resultSet.next()) {
                CinemaInfoViews.add(mapToCinemaInfoView(resultSet));
            }
            return CinemaInfoViews;
        } catch (SQLException e)
        {
            logger.error(String.format("DataSource configuration [CinemaInfo] or SQL command is wrong\nMeassage: %s", e.getMessage()));
        }
        return null;
    }


    private CinemaInfoView mapToCinemaInfoView(ResultSet cinema_info_result) throws SQLException
    {
        CinemaInfoView civ = new CinemaInfoView();
        civ.setId_cinema(cinema_info_result.getInt("id_cinema"));
        civ.setCinemas_name(cinema_info_result.getString("cinemas_name"));
        civ.setEmail(cinema_info_result.getString("email"));
        civ.setFree_parking(cinema_info_result.getString("free_parking"));
        civ.setWheel_chair(cinema_info_result.getString("wheelchair_access"));
        return civ;
    }



    public CinemaInfoDetailView getCinemaDetailView(Integer id_cinema) {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT id_cinema, cinemas_name, email, free_parking, wheelchair_access, id_address, city, street, house_number, zip_code, total_capacity, projections, count_of_movie_theater, id_opening_hours, opening, closing" +
                             " FROM bds.cinema p" +
                             " LEFT JOIN bds.address a ON p.id_cinemas_address = a.id_address LEFT JOIN bds.has_other_information h ON p.id_other_information = h.id_other_information LEFT JOIN bds.opening_hours o ON p.id_opens_closes = o.id_opening_hours WHERE p.id_cinema =?"))
        {
            preparedStatement.setInt(1, id_cinema);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return mapToCinemaAllDataView(resultSet);
                }
            }
        } catch (SQLException e) {
            logger.error(String.format("DataSource configuration [CinemaInfo] or SQL command is wrong\nMeassage: %s", e.getMessage()));
        }
        return null;
    }

    private CinemaInfoDetailView mapToCinemaAllDataView(ResultSet rs) throws SQLException {
        CinemaInfoDetailView cinemaInfoDetailView = new CinemaInfoDetailView();
        cinemaInfoDetailView.setId_cinema(rs.getInt("id_cinema"));
        cinemaInfoDetailView.setCinemas_name(rs.getString("cinemas_name"));
        cinemaInfoDetailView.setEmail(rs.getString("email"));
        cinemaInfoDetailView.setFree_parking(rs.getString("free_parking"));
        cinemaInfoDetailView.setWheel_chair(rs.getString("wheelchair_access"));
        cinemaInfoDetailView.setCity(rs.getString("city"));
        cinemaInfoDetailView.setStreet(rs.getString("street"));
        cinemaInfoDetailView.setHouse_number(rs.getString("house_number"));
        cinemaInfoDetailView.setZip_code(rs.getString("zip_code"));
        cinemaInfoDetailView.setTotal_capacity(rs.getString("total_capacity"));
        cinemaInfoDetailView.setProjections(rs.getString("projections"));
        cinemaInfoDetailView.setComt(rs.getString("count_of_movie_theater"));
        cinemaInfoDetailView.setOpening(rs.getString("opening"));
        cinemaInfoDetailView.setClosing(rs.getString("closing"));
        return cinemaInfoDetailView;
    }

}
