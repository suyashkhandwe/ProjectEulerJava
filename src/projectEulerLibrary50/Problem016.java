package projectEulerLibrary50;

import java.math.BigInteger;
import java.util.List;

import projectEulerLibrary.Commons;
import projectEulerLibrary.Problem;

public class Problem016 implements Problem {

	@Override
	public void ProblemSolver() {
		final long num = 2;
		final int power = 1000;
		BigInteger result = BigInteger.valueOf(num);
		result = result.pow(power);
		Commons comObj = new Commons();
		List<Integer> digits = comObj.ConvertNumberToArrayOfDigits(result);
		long sumOfDigits = 0;
		for (int index = 0; index < digits.size(); index++) {
			sumOfDigits += digits.get(index);
		}
		System.out.println(String.format("%1$d ^ %2$d = %3$d. Sum of digits = %4$d", num, power, result, sumOfDigits));
	}
}