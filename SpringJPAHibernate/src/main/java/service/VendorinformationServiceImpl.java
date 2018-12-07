package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.VendorinformationDAO;
import entity.Vendorinformation;

@Service
@Transactional
public class VendorinformationServiceImpl implements VendorinformationService{

	@Autowired
	private VendorinformationDAO vDao;
	
	@Transactional
	@Override
	public void add(Vendorinformation v) {
		vDao.addVendorinformation(v);
	}

	@Transactional
	@Override
	public void remove(Integer Id) {
		vDao.removeVendorinformation(Id);
		
	}
	
	@Transactional
	@Override
	public void update(Vendorinformation v, Integer Id) {
		vDao.updateVendorinformation(v, Id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Vendorinformation read(Integer Id) {
		return vDao.readVendorinformation(Id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Vendorinformation> listVendors() {
		return vDao.listVendors();
	}
	
}
