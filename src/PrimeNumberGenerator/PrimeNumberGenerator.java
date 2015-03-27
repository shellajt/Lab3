package PrimeNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import PrimeFactors.PrimeFactors;

public class PrimeNumberGenerator {

	private static List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
//		if(1 > 10) {primes.add(2); primes.add(3); primes.add(5); primes.add(7);}
//		else {
//			if (i >= 3)
//				primes.add(2);
//			if (i >= 4)
//				primes.add(3);
//			if (i >= 6)
//				primes.add(5);
//			if (i >= 8)
//				primes.add(7);
//		}
//		if(i >= 11) primes.add(11);
//		if(i >= 14) primes.add(13);
		
		for(int j=2; j<i;j++){
			if(PrimeFactors.generate(j).equals(Arrays.asList(j))) primes.add(j);
		}
		
		return primes;
	}
}
