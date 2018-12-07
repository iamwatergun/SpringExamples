package DBConn;

import DBConn.VendorinformationDTO;

public interface VendorinformationDAO {
	
    VendorinformationDTO selectVendorinformation(int Id);
    
    int insert(VendorinformationDTO v);
    
    int deleteVendorinformation(int Id);
    
    void updateVendorinformation(VendorinformationDTO vendorinformationdto);
    
}