package PrimeNumberGenerator;

import static PrimeNumberGenerator.PrimeNumberGenerator.generate;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {
	private int input;
	private List<Integer> expectedResult;

	private static List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method
	public PrimeNumberGeneratorTest(Integer inputNumber, List<Integer> expected) {
		this.input = inputNumber;
		this.expectedResult = expected;
	}
	
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 1, list() },
	         { 3, list(2) },
	         { 4, list(2,3) },
	         { 6, list(2,3,5) },
	         { 8, list(2,3,5,7) },
	         { 12, list(2,3,5,7,11) },
	         { 14, list(2,3,5,7,11,13) },
	         { 18, list(2,3,5,7,11,13,17) },
	         { 100, list(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97) } 
	      });
	   }

	   // This test will run ? times since we have ? parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
	      assertEquals(expectedResult, generate(input));
	   }

}
