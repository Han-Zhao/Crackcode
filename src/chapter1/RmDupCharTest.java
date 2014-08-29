package chapter1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RmDupCharTest {
	char[] s1 = {'1', '2', '3', '4', '5'};
	char[] s2 = {'1', '1', '3', '3', '5'};

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRmDupChar() {
		RmDupChar.rmDupChar(s2);
		System.out.println(s2);
	}

}
