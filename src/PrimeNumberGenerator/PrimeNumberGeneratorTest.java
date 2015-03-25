package PrimeNumberGenerator;

import static PrimeNumberGenerator.PrimeNumberGenerator.generate;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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
	      });
	   }

	   // This test will run 5 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
	      assertEquals(expectedResult, generate(input));
	   }

}