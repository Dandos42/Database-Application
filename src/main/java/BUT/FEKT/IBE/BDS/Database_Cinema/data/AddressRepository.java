//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.data;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

//list of imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.AddressView;
import BUT.FEKT.IBE.BDS.Database_Cinema.configuration.DataSourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddressRepository {
    private static final Logger logger = LoggerFactory.getLogger(AddressRepository.class);
    public AddressView findById(Integer id_address) {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT id_address, city, street, house_number, zip_code FROM bds.address WHERE id_address =?")
        ) {
            preparedStatement.setInt(1, id_address);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return mapToAddress(resultSet);
                }
            }
        } catch (SQLException e) {
            logger.error(String.format("DataSource configuration [Address] or SQL command is wrong\nMeassage: %s", e.getMessage()));
        }
        return null;
    }

    public List<AddressView> findAll() {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT id_address, city, street, house_number, zip_code FROM bds.address");
             ResultSet resultSet = preparedStatement.executeQuery()) {
            List<AddressView> address = new ArrayList<>();
            while (resultSet.next()) {
                address.add(mapToAddress(resultSet));
            }
            return address;
        } catch (SQLException e) {
            logger.error(String.format("DataSource configuration [Address] or SQL command is wrong\nMeassage: %s", e.getMessage()));
        }
        return null;
    }

    private AddressView mapToAddress(ResultSet map_address_result) throws SQLException {
        AddressView result = new AddressView();
        result.setId_address( map_address_result.getInt("id_address"));
        result.setCity( map_address_result.getString("city"));
        result.setStreet( map_address_result.getString("street"));
        result.setHouse_number( map_address_result.getString("house_number"));
        result.setZip_code( map_address_result.getString("zip_code"));
        return result;
    }
}
