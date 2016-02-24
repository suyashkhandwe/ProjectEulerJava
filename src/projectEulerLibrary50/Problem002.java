package projectEulerLibrary50;

import java.util.Iterator;
import java.util.List;

import projectEulerLibrary.Commons;
import projectEulerLibrary.Problem;

public class Problem002 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Even Fibonacci numbers");

		Commons objComLib = new Commons();

		List<Long> x = objComLib.GetFibonacciSeries(1L, 2L, 4000000L);

		Iterator<Long> iterator = x.iterator();
		long sum = 0L;
		while (iterator.hasNext()) {
			long num = iterator.next();

			if (objComLib.IsEven(num)) {
				sum += num;
			}
		}
		System.out.println("Sum : " + sum);
	}
}
