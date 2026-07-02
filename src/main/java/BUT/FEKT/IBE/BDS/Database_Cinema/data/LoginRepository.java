//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.data;
/**
 * @author Daniel Prachař
 * @creatin_date 20.12.2022
 */

//list of imports
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.*;
import BUT.FEKT.IBE.BDS.Database_Cinema.configuration.DataSourceConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository {
    private static final Logger logger = LoggerFactory.getLogger(LoginRepository.class);

    public LoginView getLoginView(String username) {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement prpstmt = connection.prepareStatement(
                     "SELECT username, password FROM bds.employees WHERE username = ?;"))
        {
            prpstmt.setString(1, username);
            try (ResultSet rs = prpstmt.executeQuery())
            {
                if (rs.next())
                {
                    return mapToLoginView(rs);
                }
            }
        } catch (SQLException e)
        {
            logger.error(String.format("Couldn't get login view!\nMeassage: %s", e.getMessage()));
        }
        return null;
    }

    private LoginView mapToLoginView(ResultSet rs) throws SQLException {
        LoginView loginView = new LoginView();
        loginView.setUsername(rs.getString("username"));
        loginView.setHashedPwd(rs.getString("password"));
        return loginView;
    }
}
