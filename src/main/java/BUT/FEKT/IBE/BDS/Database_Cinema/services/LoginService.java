//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.services;

/**
 * @author Daniel Prachař
 * @creatin_date 20.12.2022
 */

//list of imports
import at.favre.lib.crypto.bcrypt.BCrypt;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.LoginView;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.LoginRepository;

public class LoginService
{
    //Declaration
    private final LoginRepository loginRepository;

    private LoginView getLoginView(String username) {return loginRepository.getLoginView(username);}
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    //Method type boolean for login
    public boolean login(String username, String password)
    {
       if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
          return false;
        }

        LoginView loginView =  getLoginView(username);
        if (loginView != null) {

            //Hash password
            return BCrypt.verifyer().verify(password.toCharArray(), loginView.getHashedPwd()).verified;
        }
        return false;
    }
}
