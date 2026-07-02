//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.configuration;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

//list of imports
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DataSourceConfig {

    //constructor
    private DataSourceConfig() {}
    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    private static final HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    private static final String login_credentials = "login";

    static {
        try (InputStream resourceStream = DataSourceConfig.class.getClassLoader().getResourceAsStream(login_credentials))
        {
            Properties properties = new Properties();
            properties.load(resourceStream);
            config.setJdbcUrl(properties.getProperty("datasource.url"));
            config.setUsername(properties.getProperty("datasource.username"));
            config.setPassword(properties.getProperty("datasource.password"));
            ds = new HikariDataSource(config);
        }
        catch (IOException | NullPointerException | IllegalArgumentException e)
        {
            logger.error("Configuration of the datasource was not successful.", e);
        }
        catch (Exception e)
        {
            logger.error("Could not connect to the database.", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
