package projectEulerLibrary50;

import projectEulerLibrary.Commons;
import projectEulerLibrary.Problem;

public class Problem005 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Smallest multiple");

		Commons comObjLib = new Commons();

		long rangeStart = 1L;
		long rangeEnd = 20L;
		long product = 1L;

		for (long counter = rangeStart; counter <= rangeEnd; counter++) {
			if (!comObjLib.IsPrime(counter)) {
				continue;
			}
			long validMultiplier = counter;
			while (validMultiplier <= rangeEnd) {
				validMultiplier *= counter;
				if (validMultiplier <= rangeEnd) {
					continue;
				}
				validMultiplier /= counter;
				break;

			}
			product *= validMultiplier;

		}
		System.out.println("Answer : " + product);
	}
}