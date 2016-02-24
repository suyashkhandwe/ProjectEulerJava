package projectEulerLibrary50;

import java.util.List;

import projectEulerLibrary.Commons;
import projectEulerLibrary.Problem;

public class Problem012 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Highly divisible triangular number");

		long n = 1L;
		int requiredFactorCount = 501;

		Commons comObj = new Commons();
		List<Long> primeNumbers = comObj.GetPrimesInRange(2000000L);
		while (true) {
			long triangleNoForN = n * (n + 1) / 2;
			int countOfFactors = comObj.GetCountOfFactors(triangleNoForN, primeNumbers);
			if (countOfFactors >= requiredFactorCount) {
				System.out.println("Triangle # - " + triangleNoForN);
				break;
			}
			n++;
		}
	}
}