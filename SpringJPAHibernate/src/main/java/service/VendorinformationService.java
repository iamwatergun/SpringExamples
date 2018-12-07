package service;

import java.util.List;

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
	
	void update (Vendorinformation v, Integer Id);
	
	Vendorinformation read (Integer Id);
	
}
