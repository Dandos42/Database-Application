package BUT.FEKT.IBE.BDS.Database_Cinema.data;

/**
 * @author Daniel Prachař
 * @creatin_date 30.12.2022
 */

import BUT.FEKT.IBE.BDS.Database_Cinema.configuration.DataSourceConfig;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.DeleteView;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.FilmCreateView;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.FilmEditView;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.FilmsView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmsRepository {
    private static final Logger logger = LoggerFactory.getLogger(FilmsRepository.class);
    public List<FilmsView> getFilmsView()
    {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT id_film, films_name, footage_minutes, premiere FROM bds.films;" );
             ResultSet resultSet = preparedStatement.executeQuery();) {
            List<FilmsView> FilmsView = new ArrayList<>();
            while (resultSet.next()) {
                FilmsView.add(mapToFilmsView(resultSet));
            }
            return FilmsView;
        } catch (SQLException e)
        {
            logger.error(String.format("DataSource configuration [Films] or SQL command is wrong\nMeassage: %s", e.getMessage()));
        }
        return null;
    }

    public void CreateFilm(FilmCreateView filmCreateView) {
        String insertPersonSQL = "INSERT INTO bds.films (films_name, footage_minutes, premiere) VALUES (?,?,?)";
        try (Connection connection = DataSourceConfig.getConnection();
             // would be beneficial if I will return the created entity back
             PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSQL, Statement.RETURN_GENERATED_KEYS)) {
            // set prepared statement variables
            preparedStatement.setString(1, filmCreateView.getFilms_name());
            preparedStatement.setInt(2, filmCreateView.getFootage_minutes());
            preparedStatement.setDate(3, filmCreateView.getPremiere());
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                System.out.println("Creating film failed, no rows affected.");
            }
        } catch (SQLException e) {
            logger.error(String.format("Movie cannot be created\nMeassage: %s", e.getMessage()));
        }
    }


    public void EditFilm(FilmEditView filmEditView)
    {
        String insertPersonSQL = "UPDATE bds.films p SET films_name = ?, footage_minutes = ?, premiere =? WHERE p.id_film = ?";
        String checkIfExists = "SELECT films_name FROM bds.films p WHERE p.id_film = ?";
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSQL, Statement.RETURN_GENERATED_KEYS))
            {
                preparedStatement.setString(1, filmEditView.getFilms_name());
                preparedStatement.setInt(2, filmEditView.getFootage());
                preparedStatement.setDate(3, filmEditView.getPremiere());
                preparedStatement.setInt(4, filmEditView.getId_film());

            try
            {
                connection.setAutoCommit(false);

                try (PreparedStatement ps = connection.prepareStatement(checkIfExists, Statement.RETURN_GENERATED_KEYS))
                {
                    ps.setInt(1, filmEditView.getId_film());
                    ps.execute();
                }
                catch (SQLException e)
                {
                    System.out.println("This film for edit do not exists.");
                }

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows == 0)
                {
                    System.out.println("New edit film  failed");
                }
                connection.commit();

            }
            catch (SQLException e)
            {
                connection.rollback();
                System.out.println("Somethink is wrong with rollback");
            } finally
            {
                connection.setAutoCommit(true);
            }
        }
        catch (SQLException e)
        {
            System.out.println("Editing film failed operation on the database failed.");
        }
    }
    public void RemoveFilm(DeleteView id_film)
    {
        String remove = "DELETE FROM bds.films WHERE id_film = ?;";
        try (Connection conn = DataSourceConfig.getConnection();
             PreparedStatement prpstmt = conn.prepareStatement(remove))
        {
            prpstmt.setInt(1, id_film.getId_film());
            prpstmt.executeUpdate();
        } catch (SQLException e)
        {
            logger.error("Couldn't delete film\nMessage: " + e.getMessage());
        }
    }

    public List<FilmsView> getFilterFilm (Integer footage)
    {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement prpstmt = connection.prepareStatement(
                     "SELECT id_film, films_name, footage_minutes, premiere FROM bds.films WHERE footage_minutes = ? ;"))
        {
            prpstmt.setInt(1, footage);
            return mapToFilmsFiltredView(prpstmt, connection);
        } catch (SQLException e)
        {
            logger.error("Failed to get Filtered DB\nMessage: " + e.getMessage());
        }
        return null;
    }

    private List<FilmsView> mapToFilmsFiltredView(PreparedStatement prpstmt, Connection connection)  throws SQLException {
        List<FilmsView> view = new ArrayList<>();
        ResultSet rs = prpstmt.executeQuery();
        while (rs.next())
        {
            FilmsView bv = new FilmsView();
            bv.setId_film(rs.getInt("id_film"));
            bv.setFilms_name(rs.getString("films_name"));
            bv.setFootage_minutes(rs.getInt("footage_minutes"));
            bv.setPremiere(rs.getString("premiere"));
            view.add(bv);
        }
        return view;
    }


    private FilmsView mapToFilmsView(ResultSet films_result) throws SQLException
    {
        FilmsView fv = new FilmsView();
        fv.setId_film( films_result.getInt("id_film"));
        fv.setFilms_name( films_result.getString("films_name"));
        fv.setFootage_minutes( films_result.getInt("footage_minutes"));
        fv.setPremiere( films_result.getString("premiere"));
        return fv;
    }
}
