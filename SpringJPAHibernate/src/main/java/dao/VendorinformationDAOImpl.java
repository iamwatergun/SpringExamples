package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Vendorinformation;

@Repository
public class VendorinformationDAOImpl implements VendorinformationDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addVendorinformation(Vendorinformation v) {
		em.persist(v);
	}
	
	@Override
	public void removeVendorinformation(Integer Id) {
		Vendorinformation v = em.find(Vendorinformation.class, Id);
		
		em.remove(v);
	}
	
	@Override
	public void updateVendorinformation(Vendorinformation v, Integer id) {
		Vendorinformation temp = em.find(Vendorinformation.class, id);
		
		temp.setVendorid(v.getVendorid());
		temp.setVendorname(v.getVendorname());
		temp.setAddress(v.getAddress());
		temp.setZip(v.getZip());
		temp.setCity(v.getCity());
		temp.setCountry(v.getCountry());
		temp.setPhone(v.getPhone());
		temp.setEmail(v.getEmail());
		temp.setWebaddress(v.getWebaddress());
		temp.setIBAN(v.getIBAN());
		temp.setVAT(v.getVAT());
		temp.setDatecreated(v.getDatecreated());
		em.persist(temp);
	}
	
	@Override
	public Vendorinformation readVendorinformation(Integer Id) {
		Vendorinformation temp = em.find(Vendorinformation.class, Id);
		return temp;
	}
	
	@Override
	public List<Vendorinformation> listVendors(){       
	 	CriteriaBuilder builder = em.getCriteriaBuilder();
	    CriteriaQuery<Vendorinformation> query = builder.createQuery(Vendorinformation.class);
	    Root<Vendorinformation> variableRoot = query.from(Vendorinformation.class);
	    query.select(variableRoot);

	    return em.createQuery(query).getResultList();

	}
}
