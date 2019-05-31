package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practise.Calculator;

public class Calculatortest {

	
	


	public class CalculatorTest{
		
		@BeforEach
		
		public void setup() {
			c = new Calculator();
			
		}
		
		
		@Test
		public void addTest() {
			assertEquals("Numbers did not add up correctly"
					,8
					,c.add(5,2));
		}
		
		
	}
}
	
