package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int canidate = 2; i > 1; canidate++) {
			for (; i % canidate == 0; i /= canidate) {
				primes.add(canidate);
			}
		}
		return primes;
	}
}
