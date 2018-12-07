package repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import entity.Vendorinformation;

@Transactional
@Component
public interface VendorinformationRepository extends JpaRepository<Vendorinformation, Integer> {
	
	@Modifying
	@Query(value = "update Vendorinformation v set v.VENDORID = :vendorid where v.Id = :id", nativeQuery = true)
	int updateVendorid(@Param("vendorid") String vendorid, @Param("id") Integer id);
}
