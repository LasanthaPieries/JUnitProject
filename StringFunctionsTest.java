package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {

	@Test
	public void Test1() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}

	@Test
	public void Test2( ) {
		assertTrue(StringFunctions.isPalindrom("DAD"));
	}
	
	@DisplayName("Test Case 3")
	@RepeatedTest(4)
	public void Test3( ) {
		assertTrue(StringFunctions.isPalindrom("MOM"));
	}
	
	@Test
	public void Test4() {
		assertTrue(StringFunctions.isPalindrom("MADAM"));
	}

	@Test
	public void Test5( ) {
		assertFalse(StringFunctions.isPalindrom("PRIYA"));
	}
	
	@Test
	public void Test6( ) {
		assertFalse(StringFunctions.isPalindrom("MIKE"));
	}
	
	@Test
	public void Test7( ) {
		assertFalse(StringFunctions.isPalindrom("JHON"));
	}

	@Test
	public void Test8( ) {
		assertFalse(StringFunctions.isPalindrom("MaDAM"));
	}

}

