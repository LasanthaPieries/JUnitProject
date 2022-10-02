package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample {

	@ValueSource(strings = {"RADAR", "MOM", "MADAM"})
	@ParameterizedTest
	public void Test1(String arg1) {
		assertTrue(StringFunctions.isPalindrom(arg1));
	}
	
	@CsvSource(value = {"RADAR:RADAR:This is a comparison"}, delimiter=':')
	@ParameterizedTest
	public void Test2(String arg1, String arg2, String arg3) {
		assertEquals(arg1, arg2, arg3);
	}
}
