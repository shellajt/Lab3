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
	public void test1() {
		assertEquals(list(), generate(1));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(list(2), generate(2));
	}
	
	@Test
	public void test3() throws Exception {
		assertEquals(list(3), generate(3));
	}
}
