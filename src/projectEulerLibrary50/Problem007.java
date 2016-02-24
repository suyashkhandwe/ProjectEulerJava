package projectEulerLibrary50;

import java.util.List;

import projectEulerLibrary.Commons;
import projectEulerLibrary.Problem;

public class Problem007 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("10001st prime");
		List<Long> primeNumbers = new Commons().GetPrimesInRange(120000L);

		System.out.println("10001st primer number : " + primeNumbers.get(10000));
	}
}