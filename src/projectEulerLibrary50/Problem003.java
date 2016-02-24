package projectEulerLibrary50;

import projectEulerLibrary.Commons;
import projectEulerLibrary.Problem;

public class Problem003 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Largest prime factor");

		long num = 600851475143L;
		Commons objComLib = new Commons();

		long largestPrimeFactor = objComLib.GetLargestPrimeFactor(num);

		System.out.println("Largest prime factor is : " + largestPrimeFactor);
	}
}