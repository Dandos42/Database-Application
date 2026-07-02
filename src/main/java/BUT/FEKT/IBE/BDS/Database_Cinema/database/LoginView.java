//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.database;

/**
 * @author Daniel Prachař
 * @creatin_date 20.12.2022
 */

//list of imports
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginView {


    private final StringProperty username = new SimpleStringProperty();
    private final StringProperty hashedPwd = new SimpleStringProperty();

    public String getUsername() {return this.username.get();}

    public void setUsername(String username)
    {
        this.username.setValue(username);
    }

    public String getHashedPwd()
    {
        return this.hashedPwd.get();
    }

    public void setHashedPwd(String hashedPwd) {
        this.hashedPwd.setValue(hashedPwd);
    }

}
