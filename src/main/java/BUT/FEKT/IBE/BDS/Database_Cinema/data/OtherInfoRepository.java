package BUT.FEKT.IBE.BDS.Database_Cinema.data;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

import BUT.FEKT.IBE.BDS.Database_Cinema.configuration.DataSourceConfig;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.OtherInfoView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OtherInfoRepository {

    private static final Logger logger = LoggerFactory.getLogger(OtherInfoRepository.class);
    public OtherInfoView findById(Integer id_other_info) {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT total_capacity, projections, count_of_movie_theater FROM bds.has_other_information WHERE id_other_information =?")
        ) {
            preparedStatement.setInt(1, id_other_info);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return mapToOtherInformation(resultSet);
                }
            }
        } catch (SQLException e) {
            logger.error(String.format("DataSource configuration [OtherInfo] or SQL command is wrong\nMeassage: %s", e.getMessage()));
        }
        return null;
    }



    private OtherInfoView mapToOtherInformation(ResultSet map_address_result) throws SQLException {
        OtherInfoView result = new OtherInfoView();
        result.setTotal_capacity( map_address_result.getInt("total_capacity"));
        result.setProjections( map_address_result.getString("projections"));
        result.setCount_of_movie_theater( map_address_result.getInt("count_of_movie_theater"));
        return result;
    }
}
