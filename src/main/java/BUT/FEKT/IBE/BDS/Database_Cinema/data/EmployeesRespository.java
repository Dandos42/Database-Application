package BUT.FEKT.IBE.BDS.Database_Cinema.data;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

import BUT.FEKT.IBE.BDS.Database_Cinema.database.InjectionsAttacksView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import BUT.FEKT.IBE.BDS.Database_Cinema.configuration.DataSourceConfig;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeesRespository {

    private static final Logger logger = LoggerFactory.getLogger(EmployeesRespository.class);

    // Injection
    public List<InjectionsAttacksView> getInjectionAttacksView()
    {
        String injection = "SELECT id_employee, first_name, last_name, username FROM bds.employees";
        try (Connection conn = DataSourceConfig.getConnection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(injection))
        {
            List<InjectionsAttacksView> injectionsAttacksViews = new ArrayList<>();
            while (rs.next())
            {
                injectionsAttacksViews.add(mapToInjectionAttacksView(rs));
            }
            return injectionsAttacksViews;
        } catch (SQLException e)
        {
            logger.error("Failed to find users\nMessage:" + e.getMessage());
        }
        return null;
    }

    private InjectionsAttacksView mapToInjectionAttacksView(ResultSet ia) throws SQLException
    {
        InjectionsAttacksView injectionsAttacksView = new InjectionsAttacksView();
        injectionsAttacksView.setId_employee(ia.getInt("id_employee"));
        injectionsAttacksView.setFirst_name(ia.getString("first_name"));
        injectionsAttacksView.setLast_name(ia.getString("last_name"));
        injectionsAttacksView.setUsername(ia.getString("username"));

        return injectionsAttacksView;
    }
}
