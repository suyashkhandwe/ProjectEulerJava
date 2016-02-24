package projectEulerLibrary50;

import projectEulerLibrary.Problem;

public class Problem014 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Longest Collatz sequence");

		long startingNum = 1000000;
		int maxSequenceLength = -1;
		long numWithMaxSequenceLength = -1;
		while (startingNum >= 1) {
			int sequenceLength = CountCollatzSequenceLength(startingNum);
			if (sequenceLength > maxSequenceLength) {
				maxSequenceLength = sequenceLength;
				numWithMaxSequenceLength = startingNum;
			}
			startingNum--;
		}
		System.out.println(
				"numWithMaxSequenceLength = " + numWithMaxSequenceLength + " Sequence Length = " + maxSequenceLength);
	}

	private int CountCollatzSequenceLength(long num) {
		int seqLength = 0;
		while (num > 1) {
			num = (num % 2) == 0 ? (num / 2) : (3 * num + 1);
			seqLength++;
		}
		return seqLength++;
	}
}
