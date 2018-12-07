package DBConn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VendorinformationDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;
	
	private String Vendorid;
	
	private String Vendorname;
	
	private String Address;
	
	private int Zip;
	
	private String City;
	
	private String Country;
	
	private String Phone;
	
	private String Email;
	
	private String Webaddress;
	
	private String IBAN;
	
	private String VAT;
	
	private String Datecreated;
	
	public int getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}

	public String getVendorid() {
		return Vendorid;
	}

	public void setVendorid(String vendorid) {
		Vendorid = vendorid;
	}

	public String getVendorname() {
		return Vendorname;
	}

	public void setVendorname(String vendorname) {
		Vendorname = vendorname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(Integer zip) {
		Zip = zip;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getWebaddress() {
		return Webaddress;
	}

	public void setWebaddress(String webaddress) {
		Webaddress = webaddress;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}

	public String getDatecreated() {
		return Datecreated;
	}

	public void setDatecreated(String datecreated) {
		Datecreated = datecreated;
	}
	
	
	
	
}
