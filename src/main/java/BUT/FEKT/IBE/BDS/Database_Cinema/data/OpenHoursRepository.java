package BUT.FEKT.IBE.BDS.Database_Cinema.data;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

import BUT.FEKT.IBE.BDS.Database_Cinema.configuration.DataSourceConfig;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.OpenHoursView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class OpenHoursRepository
{
    private static final Logger logger = LoggerFactory.getLogger(OpenHoursRepository.class);
    public OpenHoursView findById(Integer id_open) {
            try (Connection connection = DataSourceConfig.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(
                         "SELECT id_opening_hours, opening, closing FROM bds.opening_hours WHERE id_opening_hours =?")
            ) {
                preparedStatement.setInt(1, id_open);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return mapToOpeningHours(resultSet);
                    }
                }
            } catch (SQLException e) {
                logger.error(String.format("DataSource configuration [OpenHours] or SQL command is wrong\nMeassage: %s", e.getMessage()));
            }
            return null;
        }


        private OpenHoursView mapToOpeningHours(ResultSet map_open_result) throws SQLException {
           OpenHoursView result = new OpenHoursView();
            result.setId_open_hours( map_open_result.getInt("id_opening_hours"));
            result.setOpening( map_open_result.getTime("opening"));
            result.setClosing( map_open_result.getTime("closing"));

            return result;
        }
}
