package projectEulerLibrary50;

import projectEulerLibrary.Commons;
import projectEulerLibrary.Problem;

public class Problem004 implements Problem {

	@Override
	public void ProblemSolver() {
		System.out.println("Largest palindrome product");

		Commons comObjLib = new Commons();
		int largestProduct = 0;
		for (int num1 = 999; num1 >= 100; num1--) {
			for (int num2 = 999; num2 >= 100; num2--) {
				Integer product = num1 * num2;
				if (comObjLib.IsPalindrome(product.toString())) {
					largestProduct = Math.max(product.intValue(), largestProduct);
				}
			}
		}
		System.out.println("Largest palindrome made from the product of two 3-digit numbers : " + largestProduct);
	}
}