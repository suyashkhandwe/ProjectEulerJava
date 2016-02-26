package projectEulerLibrary;

import projectEulerLibrary50.Problem017;

public class ProjectEulerMainEngine {

	public static void main(String[] args) {

		final long startTime = System.currentTimeMillis();

		new Problem017().ProblemSolver();

		final long endTime = System.currentTimeMillis();

		Long ms = (endTime - startTime);
		Long s = ms / 1000;
		System.out.println("\nTotal execution time : " + (endTime - startTime) + " ms (~" + s + " s)");
	}
}
