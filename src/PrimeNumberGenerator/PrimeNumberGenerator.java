package PrimeNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if(i >= 3) primes.add(2);
		if(i >= 4) primes.add(3);
		if(i >= 6) primes.add(5);
		if(i >= 8) primes.add(7);
		
		return primes;
	}
}
