package calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calc {
	
	private Operation plus;
	
	private Operation minus;
	
	private Operation divide;
	
	private Operation multiply;

	//@Autowired cna be omitted because there is only 1 Constructur
	@Autowired
	public Calc(Operation plus, Operation minus, Operation divide, Operation multiply) {
		this.plus = plus;
		this.minus = minus;
		this.divide = divide;
		this.multiply = multiply;
		System.out.println("Konstruktor DI");
	}
	
	public int sub(int i, int j) {
		return minus.operate(i, j);
	}
	
	public int add(int i , int j) {
		return plus.operate(i, j);
	}
	
	public int divide(int i, int j) {
		return divide.operate(i, j);
	}
	
	public int multiply(int i, int j) {
		return multiply.operate(i, j);
	}
}
