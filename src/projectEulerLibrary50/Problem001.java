package projectEulerLibrary50;

import projectEulerLibrary.Problem;

public class Problem001 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Multiples of 3 and 5");

		int sum = 0;
		for (int num = 1; num < 1000; num++) {
			sum += (num % 3 == 0 || num % 5 == 0) ? num : 0;
		}
		System.out.println("Sum is " + sum);
	}
}