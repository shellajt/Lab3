package PrimeFactors;

import static PrimeFactors.PrimeFactors.generate;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PrimeFactorsTest {

	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), generate(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertEquals(list(2), generate(2));
	}
	
	@Test
	public void testThree() throws Exception {
		assertEquals(list(3), generate(3));
	}
	
	@Test
	public void testFour() throws Exception {
		assertEquals(list(2,2), generate(4));
	}
	
// This test is included in the lab instructions, 
//	but does not fail when added. Not useful for TDD.	
//	@Test
//	public void testSix() throws Exception {
//		assertEquals(list(2,3), generate(6));
//	}
	
	@Test
	public void testEight() throws Exception {
		assertEquals(list(2,2,2), generate(8));
	}
	
	@Test
	public void testNine() throws Exception {
		assertEquals(list(3,3), generate(9));
	}
	
//	This test is included in the lab instructions, but does 
// 	not fail when added. Not usefull for TDD.
//	@Test
//	public void test325115() throws Exception {
//		assertEquals(list(5,7,7,1327), generate(325115));
//	}
}
