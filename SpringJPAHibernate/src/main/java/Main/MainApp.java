package Main;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import java.sql.Timestamp;
import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import entity.Vendorinformation;
import service.VendorinformationService;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		VendorinformationService service = context.getBean(VendorinformationService.class);
	
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		
		Vendorinformation newVendor = new Vendorinformation("LF1234", "VendorTest", "Modestraße", "1110", "Vienna", "Österreich", "06804005547", "nicolaus.rotter@adesso.at", "adesso.at", "IB4N", "VAT", date);
		//java.sql.Timestamp.valueOf(java.time.LocalDate.of(myYear, myMonth, myDay).atStartOfDay()))
		service.add(newVendor);
		//service.add(new Vendorinformation("LF12345", "Vendor2", "Modestraße", 1110, "Vienna", "Österreich", "06804005547", "nicolaus.rotter@adesso.at", "adesso.at", "IB4N", "VAT", new Timestamp(2018,12,23,11,01,30,300)));
		
		System.out.println("ID: " + service.read(newVendor.getId()).getId() + ", Vendorid: " + service.read(newVendor.getId()).getVendorid());
		
		service.update(new Vendorinformation("NEWID123", "VendorTest", "Modestraße", "1110", "Vienna", "Österreich", "06804005547", "nicolaus.rotter@adesso.at", "adesso.at", "IB4N", "VAT", date), newVendor.getId());
		
		System.out.println("ID: " + service.read(newVendor.getId()).getId() + ", Vendorid: " + service.read(newVendor.getId()).getVendorid());
		
		service.remove(newVendor.getId());
		
		/*if(service.read(newVendor.getId()).getVendorid() == null) {
			System.out.println("nullpointer wegen delete");
		}*/
		
		service.add(new Vendorinformation("NEWID123", "VendorTest", "Modestraße", "1110", "Vienna", "Österreich", "06804005547", "nicolaus.rotter@adesso.at", "adesso.at", "IB4N", "VAT", date));
		
		List<Vendorinformation> vendors = service.listVendors();
		for(Vendorinformation v: vendors) {
			System.out.println(v.getId());
			System.out.println(v.getVendorname());
		}
		
		context.close();
	}
}
