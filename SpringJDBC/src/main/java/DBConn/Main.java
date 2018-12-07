package DBConn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import DBConn.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        DemoBean demo = (DemoBean) context.getBean("db");
        
        demo.insertVendorinformationDTO("LF1234", "Vendor", "Modestraﬂe", 1110, "Vienna", "÷sterreich", "06804005547", "nicolaus.rotter@adesso.at", "adesso.at", "IB4N", "VAT", "2018-03-26 15:10:59.0");
       
        // Selecting data from customer table
        VendorinformationDTO v = demo.selectVendorinformationDTO(165);
        System.out.println("Inserted Vendor : " + v.getId());
        System.out.println("Inserted Vendor : " + v.getEmail());
        
        demo.updateVendorinformationDTO(v);
        
        //demo.deleteVendorinformationDTO(162);

        VendorinformationDTO vTemp = demo.selectVendorinformationDTO(165);
        System.out.println("Inserted Vendor : " + vTemp.getId());
        System.out.println("Inserted Vendor : " + vTemp.getEmail());
       
    }
}