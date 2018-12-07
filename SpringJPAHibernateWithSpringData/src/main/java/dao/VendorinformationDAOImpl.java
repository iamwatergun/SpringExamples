package dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Vendorinformation;
import repository.VendorinformationRepository;

@Repository
public class VendorinformationDAOImpl implements VendorinformationDAO{
	
	@PersistenceContext
	private EntityManager entityManagerFactory;
	
	@Autowired
	private VendorinformationRepository vendorinformationRepository;
	
	@Override
	public void addVendorinformation(Vendorinformation v) {
		//em.persist(v);
		vendorinformationRepository.save(v);
	}
	
	@Override
	public void removeVendorinformation(Integer Id) {
		//Vendorinformation v = em.find(Vendorinformation.class, Id);
		
		//em.remove(v);
		vendorinformationRepository.deleteById(Id);
	}
	
	@Override
	public Integer updateVendorid(String vendorid, Integer id) {
		return vendorinformationRepository.updateVendorid(vendorid, id);
	}
	
	@Override
	public void updateVendor(Vendorinformation v) {
		vendorinformationRepository.save(v);
	}
	
	@Override
	public Optional<Vendorinformation> readVendorinformation(Integer Id) {
		//Vendorinformation vendor = em.find(Vendorinformation.class, Id);
		//return vendor;
		return vendorinformationRepository.findById(Id);
	}
	
	@Override
	public List<Vendorinformation> listVendors(){ 
		return vendorinformationRepository.findAll();
		/*
	 	CriteriaBuilder builder = em.getCriteriaBuilder();
	    CriteriaQuery<Vendorinformation> query = builder.createQuery(Vendorinformation.class);
	    Root<Vendorinformation> variableRoot = query.from(Vendorinformation.class);
	    query.select(variableRoot);

	    return em.createQuery(query).getResultList();*/

	}
}
