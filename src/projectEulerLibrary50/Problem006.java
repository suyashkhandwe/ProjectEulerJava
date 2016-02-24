package projectEulerLibrary50;

import projectEulerLibrary.Problem;

public class Problem006 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Sum square difference");

		int n = 100;
		long sumOfSquares = n * (n + 1) * (2 * n + 1) / 6L;
		long sumOfNumbers = n * (n + 1) / 2L;
		long squareOfSum = sumOfNumbers * sumOfNumbers;
		System.out.print("Difference between the sum of the squares and the square of the sum : "
				+ (squareOfSum - sumOfSquares));
	}
}