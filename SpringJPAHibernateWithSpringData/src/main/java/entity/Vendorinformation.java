package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Vendorinformation")
public class Vendorinformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;
	
	@Column(name = "VendorId")
	private String Vendorid;
	
	@Column(name = "Vendorname")
	private String Vendorname;
	
	@Column(name = "Address")
	private String Address;
	
	@Column(name = "Zip")
	private String Zip;
	
	@Column(name = "City")
	private String City;
	
	@Column(name = "Country")
	private String Country;
	
	@Column(name = "Phone")
	private String Phone;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Webaddress")
	private String Webaddress;
	
	@Column(name = "IBAN")
	private String IBAN;
	
	@Column(name = "VAT")
	private String VAT;
	
	@Column(name = "Datecreated")
	@Type(type="timestamp")
	private Date Datecreated;
	
	public Vendorinformation() {}
	
	public Vendorinformation(String vendorid, String vendorname, String address, String zip, String city, String country, String phone, String email, String webaddress, String iban, String vat, Date datecreated) {
		//this.Id = id;
		this.Vendorid = vendorid;
		this.Vendorname = vendorname;
		this.Address = address;
		this.Zip = zip;
		this.City = city;
		this.Country = country;
		this.Phone = phone;
		this.Email = email;
		this.Webaddress = webaddress;
		this.IBAN = iban;
		this.VAT = vat;
		this.Datecreated = datecreated;
	}
	
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

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
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

	public Date getDatecreated() {
		return Datecreated;
	}

	public void setDatecreated(Date datecreated) {
		Datecreated = datecreated;
	}
	
	
	
	
}
