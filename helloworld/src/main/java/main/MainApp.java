package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import calc.Calc;

@Component
public class MainApp {
	public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Calc obj = (Calc) context.getBean("calc");
      obj.add(1, 1);
      obj.sub(5, 4);
      obj.divide(10, 2);
      obj.multiply(2, 3);
   }
}