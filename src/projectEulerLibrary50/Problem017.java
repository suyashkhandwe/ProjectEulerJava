package projectEulerLibrary50;

import java.util.HashMap;
import java.util.Map;

import projectEulerLibrary.Problem;

public class Problem017 implements Problem {

	private Map<Integer, String> wordsValues = new HashMap<Integer, String>();

	@Override
	public void ProblemSolver() {
		setup();
		int start = 1;
		int end = 1000;
		long sum = 0;
		for (int counter = start; counter <= end; counter++) {
			String inWords = getNumberInWords(counter);
			sum += getLetterCount(inWords);
		}
		System.out.println("Sum - " + sum);
	}

	private static int getLetterCount(String inWords) {
		return inWords.replace("-", "").replace(" ", "").length();
	}

	private void setup() {
		wordsValues.put(0, "");
		wordsValues.put(1, "One");
		wordsValues.put(2, "Two");
		wordsValues.put(3, "Three");
		wordsValues.put(4, "Four");
		wordsValues.put(5, "Five");
		wordsValues.put(6, "Six");
		wordsValues.put(7, "Seven");
		wordsValues.put(8, "Eight");
		wordsValues.put(9, "Nine");
		wordsValues.put(10, "Ten");
		wordsValues.put(11, "Eleven");
		wordsValues.put(12, "Twelve");
		wordsValues.put(13, "Thirteen");
		wordsValues.put(14, "Fourteen");
		wordsValues.put(15, "Fifteen");
		wordsValues.put(16, "Sixteen");
		wordsValues.put(17, "Seventeen");
		wordsValues.put(18, "Eighteen");
		wordsValues.put(19, "Nineteen");
		wordsValues.put(20, "Twenty");
		wordsValues.put(30, "Thirty");
		wordsValues.put(40, "Forty");
		wordsValues.put(50, "Fifty");
		wordsValues.put(60, "Sixty");
		wordsValues.put(70, "Seventy");
		wordsValues.put(80, "Eighty");
		wordsValues.put(90, "Ninety");
	}

	private String getNumberInWords(int num) {
		String words = "";

		if (num == 1000) {
			words = "One Thousand";
			num = 0;
		}
		if (num < 1000 && num >= 100) {
			int hundredsDigit = num / 100;
			num %= 100;
			words = wordsValues.get(hundredsDigit) + " hundred";
		}
		if (num < 100 && num > 20) {
			int unitsDigit = num % 10;
			int tensDigit = num - unitsDigit;
			words = words + (words.length() == 0 ? "" : " and ") + wordsValues.get(tensDigit)
					+ (unitsDigit == 0 ? "" : "-") + wordsValues.get(unitsDigit);
		}
		if (num <= 20 && num > 0) {

			words = words + (words.length() == 0 ? "" : " and ") + wordsValues.get(num);
		}
		return words;
	}
}