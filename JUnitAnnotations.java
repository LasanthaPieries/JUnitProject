package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitAnnotations {
	
	@BeforeAll
	public static void BeforeAllJUnit() {
		
		System.out.println("Inside Before All");
		
	}
	
	@BeforeEach
	public void BeforeJUnit() {
		
		System.out.println("Inside Before Each");
		
	}
	
	@Test
	public void Test1() {
		
		assertEquals(11, Calculator.Add(5, 6));
		
	}
	
	@AfterEach
	public void AfterJUnit() {
		
		System.out.println("Inside After each");
	}
	
	@AfterAll
	public static void AfterAllJUnit() {
		
		System.out.println("Inside After All");
	}


}
