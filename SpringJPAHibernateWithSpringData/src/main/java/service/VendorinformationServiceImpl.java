package service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.VendorinformationDAO;
import entity.Vendorinformation;

@Service
@Transactional
public class VendorinformationServiceImpl implements VendorinformationService{

	@Autowired
	private VendorinformationDAO vendorinformationDao;
	
	@Transactional
	@Override
	public void add(Vendorinformation v) {
		vendorinformationDao.addVendorinformation(v);
	}

	@Transactional
	@Override
	public void remove(Integer Id) {
		vendorinformationDao.removeVendorinformation(Id);
		
	}
	
	@Transactional
	@Override
	public Integer updateVendorid(String vendorid, Integer Id) {
		return vendorinformationDao.updateVendorid(vendorid, Id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Vendorinformation> read(Integer Id) {
		return vendorinformationDao.readVendorinformation(Id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Vendorinformation> listVendors() {
		return vendorinformationDao.listVendors();
	}
	
	@Transactional
	@Override
	public void updateVendor(Vendorinformation v) {
		vendorinformationDao.updateVendor(v);
	}
	
}
