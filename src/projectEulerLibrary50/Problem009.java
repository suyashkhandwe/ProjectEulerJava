package projectEulerLibrary50;

import projectEulerLibrary.Problem;

public class Problem009 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Special Pythagorean triplet");
		for (int a = 1; a <= 1000; a++) {
			for (int b = 1; b <= 1000; b++) {
				for (int c = 1; c <= 1000; c++) {
					if (a + b + c != 1000)
						continue;

					if (Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2))
						continue;

					System.out.println("abc = " + a * b * c);
					return;
				}
			}
		}
	}
}