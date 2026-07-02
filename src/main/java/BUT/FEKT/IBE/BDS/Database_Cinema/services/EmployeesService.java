package BUT.FEKT.IBE.BDS.Database_Cinema.services;
/**
 * @author Daniel Prachař
 * @creatin_date 22.12.2022
 */
import BUT.FEKT.IBE.BDS.Database_Cinema.data.EmployeesRespository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.InjectionsAttacksView;

import java.util.List;

public class EmployeesService {

    private final EmployeesRespository employeesRespository;

    public EmployeesService(EmployeesRespository employeesRespository) {this.employeesRespository = employeesRespository;}

    // injection
    public List<InjectionsAttacksView> getInjectionAttacks(String input) {return employeesRespository.getInjectionAttacksView();}
}
