package Calc;

import org.mockito.Mockito;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import calc.Calc;
import calc.Divide;
import calc.Minus;
import calc.Multiply;
import calc.Operation;
import calc.Plus;

@Configuration
public class CalcTestConfig {

	@Bean
	public Calc calc(Operation mockedPlus, Operation mockedMinus, Operation mockedDivide, Operation multiply){	
		return new Calc(mockedPlus, mockedMinus, mockedDivide, multiply);
	}
	
	@Bean
	public Operation plus() {
		return new Plus();
	}
	
	@Bean
	public Operation mockedPlus() {
		return Mockito.mock(Plus.class);
	}
	
	@Bean
	public Operation minus() {
		return new Minus();
	}
	
	@Bean 
	public Operation mockedMinus() {
		return Mockito.mock(Minus.class);
	}
	
	@Bean 
	public Operation mockedDivide() {
		return Mockito.mock(Minus.class);
	}
	
	@Bean
	public Operation divide() {
		return new Divide();
	}
	
	@Bean
	public Operation multiply() {
		return new Multiply();
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	//Singleton for 1 "global" Instance of Object
	//Prototype for a new Instance for every Call
	public Calc mockedCalc() {
		return Mockito.mock(Calc.class);
	}
	
}
