package dao;

import java.util.List;

import entity.Vendorinformation;

public interface VendorinformationDAO {
	
	void addVendorinformation(Vendorinformation v) ;
	
	List<Vendorinformation> listVendors();
	
	void removeVendorinformation(Integer Id);
	
	void updateVendorinformation(Vendorinformation v, Integer id);
	
	Vendorinformation readVendorinformation(Integer Id);
}