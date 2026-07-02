//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.services;
/**
 * @author Daniel Prachař
 * @creatin_date 22.12.2022
 */
//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.database.CinemaInfoView;
import BUT.FEKT.IBE.BDS.Database_Cinema.data.CinemaInfoRepository;
import java.util.List;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.*;

public class CinemaInfoService {

    private CinemaInfoRepository cinemaInfoRepository;

    public CinemaInfoService(CinemaInfoRepository cinemaInfoRepository) {
        this.cinemaInfoRepository = cinemaInfoRepository;
    }


    public List<CinemaInfoView> getCinemaInfoViews() {
        return cinemaInfoRepository.getCinemaView();
    }


    // Detailed View
    public CinemaInfoDetailView getCinemaDetailView(Integer id_cinema) {
        return cinemaInfoRepository.getCinemaDetailView(id_cinema);
    }

}
