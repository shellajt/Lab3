package PrimeNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import PrimeFactors.PrimeFactors;

public class PrimeNumberGenerator {
	
	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();

		for(int j=2; j<i;j++){
			if(PrimeFactors.generate(j).equals(Arrays.asList(j))) primes.add(j);
		}
		
		return primes;
	}
}
