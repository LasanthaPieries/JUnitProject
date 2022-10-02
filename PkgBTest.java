package pkgB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

public class PkgBTest {
	
	@Tag("Sanity")
	@DisplayName("Package B Test")
	@Test
	public void Test2() {
		
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}

}
