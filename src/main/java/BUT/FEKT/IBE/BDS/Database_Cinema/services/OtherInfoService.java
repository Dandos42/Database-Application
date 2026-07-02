package BUT.FEKT.IBE.BDS.Database_Cinema.services;
/**
 * @author Daniel Prachař
 * @creatin_date 22.12.2022
 */
import BUT.FEKT.IBE.BDS.Database_Cinema.data.OtherInfoRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.OtherInfoView;

public class OtherInfoService {
    private OtherInfoRepository otherInfoRepository;

    public OtherInfoService(OtherInfoRepository otherInfoRepository) {this.otherInfoRepository = otherInfoRepository;}

    public OtherInfoView findById(Integer id_other_info) {
        OtherInfoView otherInfoView = otherInfoRepository.findById(id_other_info);
        return otherInfoView;
    }

}
