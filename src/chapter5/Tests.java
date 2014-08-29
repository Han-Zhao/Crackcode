package chapter5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Tests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testUpdateBits() {
		int a = Integer.parseInt("11111111111", 2);
		int b = Integer.parseInt("00101", 2);
		//System.out.println(UpdateBits.updateBits(a, b, 2, 6));
		assertTrue(UpdateBits.updateBits(a, b, 2, 6) == Integer.parseInt("11110010111", 2));
		//System.out.println(Integer.parseInt("11111010111", 2));
	}

	@Test
	public void testPrintBinary() {
		
		//System.out.println(UpdateBits.updateBits(a, b, 2, 6));
		//PrintBinary.printBinary("3.72");
		//System.out.println(Integer.parseInt("11111010111", 2));
	}
	
	@Test
	public void testGetNP() {
		
		System.out.println(Integer.toBinaryString(GetNP.getNext_NP(Integer.parseInt("11100", 2))));
		System.out.println(Integer.toBinaryString(GetNP.getPrevious_NP(Integer.parseInt("100011", 2))));
		
	}
}
