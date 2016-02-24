package projectEulerLibrary50;

import java.util.List;

import projectEulerLibrary.Commons;
import projectEulerLibrary.Problem;

public class Problem010 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Summation of primes");

		long range = 2000000L;
		Commons comObj = new Commons();

		List<Long> primes = comObj.GetPrimesInRange(range);
		// System.out.println("Count of primes in range - " + primes.size());
		long sum = comObj.GetSum(primes);

		System.out.println("Sum = " + sum);
	}
}
