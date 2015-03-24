package PrimeFactors;

import static PrimeFactors.PrimeFactors.generate;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import javax.crypto.AEADBadTagException;

import org.junit.Test;

public class PrimeFactorsTest {

	private List<Integer> list(Integer...integers) {
		// TODO Auto-generated method stub
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
	
	@Test
	public void testSix() throws Exception {
		assertEquals(list(2,3), generate(6));
	}
}
