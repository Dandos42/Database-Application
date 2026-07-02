package BUT.FEKT.IBE.BDS.Database_Cinema.services;
/**
 * @author Daniel Prachař
 * @creatin_date 22.12.2022
 */
import BUT.FEKT.IBE.BDS.Database_Cinema.data.OpenHoursRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.OpenHoursView;

public class OpenHoursService {

    private OpenHoursRepository openHoursRepository;

    public OpenHoursService(OpenHoursRepository openHoursRepository) {this.openHoursRepository = openHoursRepository;}

    public OpenHoursView findById(Integer id_open) {
        OpenHoursView openHoursView = openHoursRepository.findById(id_open);
        return openHoursView;
    }

}
