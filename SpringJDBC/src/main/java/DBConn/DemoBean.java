package DBConn;

import org.springframework.beans.factory.annotation.Autowired;
import DBConn.*;

public class DemoBean {
	
    @Autowired
    private VendorinformationDAO vendorinformationDAO;
    
    
    public void setVendorinformationDAO(VendorinformationDAO vendorinformationDAO) {
        this.vendorinformationDAO = vendorinformationDAO;
    }
    
    public void insertVendorinformationDTO(String Vendorid, String Vendorname, String Address, int Zip, String City, String Country, String Phone, String Email, String Webaddress, String IBAN, String VAT, String Datecreated) {
        VendorinformationDTO v = new VendorinformationDTO();
        v.setVendorid(Vendorid);
        v.setVendorname(Vendorname);
        v.setAddress(Address);
        v.setZip(Zip);
        v.setCity(City);
        v.setCountry(Country);
        v.setPhone(Phone);
        v.setEmail(Email);
        v.setWebaddress(Webaddress);
        v.setIBAN(IBAN);
        v.setVAT(VAT);
        v.setDatecreated(Datecreated);
        int res = vendorinformationDAO.insert(v);
        System.out.println(res + ": Records inserted");
    }
    public int deleteVendorinformationDTO(int Id) {
        return vendorinformationDAO.deleteVendorinformation(Id);
    }
    public VendorinformationDTO selectVendorinformationDTO(int Id) {
        return vendorinformationDAO.selectVendorinformation(Id);
    }
    public void updateVendorinformationDTO(VendorinformationDTO v) {
    	vendorinformationDAO.updateVendorinformation(v);
    }
}