package DBConn;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import DBConn.VendorinformationDTO;

public class VendorinformationDAOImpl implements VendorinformationDAO {
    
	private JdbcTemplate jdbcTemplate;
	
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public int insert(VendorinformationDTO v) {
        int Id = v.getId();
        String Vendorid = v.getVendorid();
        String Vendorname = v.getVendorname();
        String Address = v.getAddress();
        Integer Zip = v.getZip();
        String City = v.getCity();
        String Country = v.getCountry();
        String Phone = v.getPhone();
        String Email = v.getEmail();
        String Webaddress = v.getWebaddress();
        String IBAN = v.getIBAN();
        String VAT = v.getVAT();
        String Datecreated = v.getDatecreated();
        
        int rows = jdbcTemplate.update("insert into vendorinformation values(?,?,?,?,?,?,?,?,?,?,?,?,?)", Id, Vendorid, Vendorname, Address, Zip, City, Country, Phone, Email, Webaddress, IBAN, VAT, Datecreated);
        return rows;
    }
    
    public int deleteVendorinformation(int Id) {
        String query = "DELETE from vendorinformation where id=?";
        return jdbcTemplate.update(query, new Object[] { Integer.valueOf(Id) });
    }
    
    public void updateVendorinformation(VendorinformationDTO v) {
        String query = "UPDATE vendorinformation SET Vendorid=?,Vendorname=?, Address=?, Zip=?, City=?, Country=?, Phone=?, Email=?, Webaddress=?, IBAN=?, VAT=?,Datecreated=? WHERE Id=?";
        jdbcTemplate.update(query,
                new Object[] { 
                        v.getVendorid(),v.getVendorname(),v.getAddress(), v.getZip(), v.getCity(), v.getCountry(), v.getPhone(), v.getEmail(), v.getWebaddress(), v.getIBAN(), v.getVAT(), v.getDatecreated(), Integer.valueOf(v.getId()) 
                        });
    }
    
    public VendorinformationDTO selectVendorinformation(int Id) {
        final VendorinformationDTO v = new VendorinformationDTO();
        String quer = "SELECT * FROM vendorinformation WHERE Id='" +Id+"'";
        return (VendorinformationDTO) jdbcTemplate.query(quer, new
        		ResultSetExtractor<VendorinformationDTO>() {
    				public VendorinformationDTO extractData(ResultSet rs) throws SQLException, DataAccessException {
		                if (rs.next()) {
		                    v.setId(rs.getInt(1));
		                    v.setVendorid(rs.getString(2));
		                    v.setVendorname(rs.getString(3));
		                    v.setAddress(rs.getString(4));
		                    v.setZip(rs.getInt(5));
		                    v.setCity(rs.getString(6));
		                    v.setCountry(rs.getString(7));
		                    v.setPhone(rs.getString(8));
		                    v.setEmail(rs.getString(9));
		                    v.setWebaddress(rs.getString(10));
		                    v.setIBAN(rs.getString(11));
		                    v.setVAT(rs.getString(12));
		                    v.setDatecreated(rs.getString(13));
		                    
		                }
		                return v;
        		}
        });
    }
}