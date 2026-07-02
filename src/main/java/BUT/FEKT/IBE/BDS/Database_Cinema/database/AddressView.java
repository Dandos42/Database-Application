//package path
package BUT.FEKT.IBE.BDS.Database_Cinema.database;

/**
 * @author Daniel Prachař
 * @creatin_date 22.12.2022
 */


public class AddressView {
    //Declaration variables
    private Integer id_address;

    private String city;

    private String street;

    private String house_number;

    private String zip_code;

    //Gettery for address
    public Integer getId_address() {return id_address;}

    public String getCity() {return city;}

    public String getStreet(){return street;}

    public String getHouse_number() {return house_number;}

    public String getZip_code(){return zip_code;}


    //Settery for address
    public void setId_address(Integer id_address) {this.id_address = id_address;}

    public void setCity(String city) {this.city = city;}

    public void setStreet(String street) {this.street = street;}

    public void setHouse_number(String house_number) {this.house_number = house_number;}

    public void setZip_code(String zip_code) {this.zip_code = zip_code;}


    @Override
    public String toString()
    {
        return "Address{" + "id_address=" + id_address+ ", city=" + city + ", street=" + street + ", house_number=" + house_number + ", zip_code=" + zip_code + "}";
    }



}
