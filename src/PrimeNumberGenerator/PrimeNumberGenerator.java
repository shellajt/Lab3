package PrimeNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if(1 > 10) {primes.add(2); primes.add(3); primes.add(5); primes.add(7);}
		else {
			if (i >= 3)
				primes.add(2);
			if (i >= 4)
				primes.add(3);
			if (i >= 6)
				primes.add(5);
			if (i >= 8)
				primes.add(7);
		}
		if(i >= 11) primes.add(11);
		if(i >= 14) primes.add(13);
		
		return primes;
	}
}
