package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	  @BeforeAll  //call one time whn program starts
	 public static void beforeClass() {
		System.out.println("Program Started...");
	}
	 
	  @BeforeEach   //calls before a test is done
	  void before() {
		  System.out.println( "Test Started...");
	  }
	  
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
	 
	    int actual = calculator.add(10,10);
	 
	    int expected = 20;
	 
	    assertEquals(expected, actual);
	    
	    System.out.println("Additon Test called");
		
	}
	@Test
	public void testSub() {
		
		Calculator calculator = new Calculator();

	    int actual = calculator.sub(20, 10);
	 
	    int expected = 10;
	 
	    assertEquals(expected, actual);
	    
	    System.out.println("Subtraction Test called");
	}
	
	@Test
	public void testMultiply() {
		
		Calculator calculator = new Calculator();

		int expected=calculator.multiply(20, 10);
		
		int actual=200;
		
		assertEquals(expected,actual);
		
		System.out.println("Multiplication Test called");
	}
	

	@Test
	public void testDivide() {
		
		Calculator calculator = new Calculator();

		int expected=calculator.divide(20, 10);
		
		int actual=2;
		
		assertEquals(expected,actual);
		
		System.out.println("Division Test called");
	}
	

	@Test
	public void testPower() {
		
		Calculator calculator = new Calculator();

		double expected=calculator.power(2, 5);
		
		double actual=32;
		
		assertEquals(expected,actual);
		
		System.out.println("Power function Test called");
	}
	
	@AfterEach //calls after the test is done
   public void afterEach() {
	   System.out.println("Test Ended..");
   }
	
	@AfterAll  //calls before ending of program
   public  static void afterAll() {
	   System.out.println("Program ended....");
   }
   
}
