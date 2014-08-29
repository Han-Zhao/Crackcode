package chapter1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringUniqCharTest {
	String s1;
	String s2;

	@Before
	public void setUp() throws Exception {
		s1 = "12345";
		s2 = "1122334";
	}

	@Test
	public void testIsUniqChar() {
		assertFalse(StringUniqChar.isUniqChar(s2));
		assertTrue(StringUniqChar.isUniqChar(s1));
	}

}
