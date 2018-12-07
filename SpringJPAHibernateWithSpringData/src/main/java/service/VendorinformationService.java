package service;

import java.util.List;
import java.util.Optional;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import entity.Vendorinformation;

public interface VendorinformationService {
	
	void add (Vendorinformation v);
	
	List<Vendorinformation> listVendors();
	
	void remove (Integer Id);
	
	Optional<Vendorinformation> read (Integer Id);

	Integer updateVendorid(String vendorid, Integer Id);
	
	void updateVendor(Vendorinformation v);
}
