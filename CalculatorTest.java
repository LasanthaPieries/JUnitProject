package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	
	@Test
	public void Test1() {
		
		assertEquals(11, Calculator.Add(5, 6));
		
	}
	
	public void Test2() {
		
		assertEquals(4, Calculator.Sub(10, 6));
		
	}

}