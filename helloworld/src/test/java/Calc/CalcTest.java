package Calc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import calc.Calc;
import calc.Operation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CalcTestConfig.class})
public class CalcTest {
	
	@Autowired
	private Calc calc;

	@Autowired
	private Operation mockedPlus;
	
	@Autowired
	private Operation mockedMinus;
	
	@Autowired
	private Operation mockedDivide;
	
	@Before
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
         
         //NICHT calc.add sondern mockedPlus.operate testen
         Mockito.when(mockedPlus.operate(1, 1)).thenReturn(2);
         Mockito.when(mockedMinus.operate(1, 1)).thenReturn(0);
         Mockito.when(mockedDivide.operate(10, 5)).thenReturn(2);
    }
	
	@Test
	public void testAutoWiredMockedPlusIsOk() {
		assertEquals(2, calc.add(1, 1));
		Mockito.verify(mockedPlus, times(1)).operate(1, 1);
	}
	
	@Test
	public void testAutoWiredMockedMinusIsOk() {
		assertEquals(0, calc.sub(1, 1));
		Mockito.verify(mockedMinus, times(1)).operate(1, 1);
	}
	
	@Test
	public void testAutoWiredMockedDivideIsOk() {
		assertEquals(2,calc.divide(10, 5));
		Mockito.verify(mockedDivide, times(1)).operate(10,5);
	}
	
	@Test
	public void testAutoWiredMultiplyIsOk() {
		assertEquals(10, calc.multiply(5, 2));
	}
}
