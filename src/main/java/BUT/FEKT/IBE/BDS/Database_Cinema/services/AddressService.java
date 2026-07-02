//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.services;

/**
 * @author Daniel Prachař
 * @creatin_date 20.12.2022
 */

//list of imports
import BUT.FEKT.IBE.BDS.Database_Cinema.data.AddressRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.AddressView;
import java.util.List;

public class AddressService {
    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public AddressView findById(Integer id_address) {
        AddressView addressView = addressRepository.findById(id_address);
        return addressView;
    }

    public List<AddressView> findAll() {
        List<AddressView> addressViews = addressRepository.findAll();
        return addressViews;
    }


}
