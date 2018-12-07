package dao;

import java.util.List;
import java.util.Optional;

import entity.Vendorinformation;

public interface VendorinformationDAO {
	
	void addVendorinformation(Vendorinformation v) ;
	
	List<Vendorinformation> listVendors();
	
	void removeVendorinformation(Integer Id);
	
	Optional<Vendorinformation> readVendorinformation(Integer Id);
	
	Integer updateVendorid(String vendorid, Integer id);

	void updateVendor(Vendorinformation v);
}