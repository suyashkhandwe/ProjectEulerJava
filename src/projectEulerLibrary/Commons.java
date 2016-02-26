package projectEulerLibrary;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Commons {

	/**
	 * Gets Fibonacci numbers starting from the given 2 numbers up to the given
	 * highest number
	 * 
	 * @param startNum1
	 *            First number with which the series is to be started
	 * @param startNum2
	 *            Second number with which the series is to be started
	 * @param highestNum
	 *            Highest number up to which the series should go
	 * @return Returns a List of Long type which is the Fibonacci series
	 */
	public List<Long> GetFibonacciSeries(long startNum1, long startNum2, long highestNum) {
		List<Long> fibonacciSeries = new ArrayList<Long>();
		fibonacciSeries.add(startNum1);
		fibonacciSeries.add(startNum2);
		long nextFibonacciNumber = 0L;
		long previousNum1 = startNum1;
		long previousNum2 = startNum2;
		while (nextFibonacciNumber <= highestNum) {
			nextFibonacciNumber = previousNum1 + previousNum2;
			previousNum1 = previousNum2;
			previousNum2 = nextFibonacciNumber;
			if (nextFibonacciNumber <= highestNum) {
				fibonacciSeries.add(nextFibonacciNumber);
			}
		}
		return fibonacciSeries;
	}

	/**
	 * Gets Fibonacci numbers starting from 0 and the given number up to the
	 * given highest number
	 * 
	 * @param startNum
	 *            First starting number default to 0. Second number with which
	 *            the series is to be started
	 * @param highestNum
	 *            Highest number up to which the series should go
	 * @return Returns a List of Long type which is the Fibonacci series
	 */
	public List<Long> GetFibonacciSeries(long startNum, long highestNum) {
		return GetFibonacciSeries(0L, startNum, highestNum);

	}

	/**
	 * Gets Fibonacci numbers starting from 0 and 1 up to the given highest
	 * number
	 * 
	 * @param highestNum
	 *            Highest number up to which the series should go
	 * @return Returns a List of Long type which is the Fibonacci series
	 */
	public List<Long> GetFibonacciSeries(long highestNum) {
		return GetFibonacciSeries(0L, 1L, highestNum);
	}

	/**
	 * Checks if the given number is even or odd
	 * 
	 * @param num
	 *            Number to be tested
	 * @return Returns TRUE if the number is EVEN. FALSE if the number is ODD
	 */
	public Boolean IsEven(long num) {
		return num % 2 == 0;
	}

	/**
	 * Checks if the given number is prime or not
	 * 
	 * @param num
	 *            Number to be tested
	 * @return Returns TRUE if the number is PRIME. FALSE otherwise
	 */
	public boolean IsPrime(long num) {
		if (num < 2) {
			return false;
		} else if (num == 2) {
			return true;
		} else {
			for (int counter = 2; counter <= Math.sqrt(num); counter++) {
				if (num % counter == 0) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * Gets all the factors for the given number
	 * 
	 * @param num
	 *            Number which needs to be factorized
	 * @param getOnlyPrime
	 *            TRUE if only prime factors are required. FALSE to get all
	 *            factors
	 * @return List of Long type with the factors for the given number
	 */
	public List<Long> Factorize(long num, boolean getOnlyPrime) {
		List<Long> factors = new ArrayList<Long>();

		for (long counter = 1L; counter <= num; counter++) {
			if (num % counter == 0) {
				num /= counter;
				if (getOnlyPrime) {
					if (IsPrime(counter)) {
						factors.add(counter);
					}
				} else {
					factors.add(counter);
				}
			}
		}
		return factors;
	}

	/**
	 * Gets all the factors for the given number
	 * 
	 * @param num
	 *            Number which needs to be factorized
	 * @param primeNumbers
	 *            List of prime numbers
	 * @return All factors
	 */
	public List<Long> GetAllPrimeFactors(long num, List<Long> primeNumbers) {
		List<Long> factors = new ArrayList<Long>();
		long divisor = 2L;

		Iterator<Long> iterator = primeNumbers.iterator();
		if (iterator.hasNext()) {
			divisor = iterator.next();
			while (num > 1) {
				if (num % divisor == 0) {
					num /= divisor;
					if (IsPrime(divisor)) {
						factors.add(divisor);
					}
				} else {
					if (iterator.hasNext()) {
						divisor = iterator.next();
					} else {
						break;
					}
				}
			}
		}
		return factors;
	}

	/**
	 * Gets all prime factors for the given number
	 * 
	 * @param num
	 *            Number for which prime factors are required
	 * @return List of Long type with the prime factors for the given number
	 */
	public List<Long> GetPrimeFactors(long num) {
		return Factorize(num, true);
	}

	/**
	 * Checks if the given string is a palindrome or not
	 * 
	 * @param text
	 *            String which needs to be tested
	 * @return TRUE if the given string is a palindrome. FALSE otherwise
	 */
	public boolean IsPalindrome(String text) {
		String reversedString = ReverseString(text);
		return reversedString.equals(text);
	}

	/**
	 * Reverses the given string
	 * 
	 * @param text
	 *            String to be reversed
	 * @return Reversed string
	 */
	public String ReverseString(String text) {
		char[] strArray = text.toCharArray();
		int len = text.length();
		for (int index = 0; index < len / 2; index++) {
			char tempChar = strArray[index];
			strArray[index] = strArray[len - 1 - index];
			strArray[len - 1 - index] = tempChar;
		}
		return new String(strArray);
	}

	/**
	 * Populates primality for the given range of numbers
	 * 
	 * @param range
	 *            Highest number for which primality needs to be populated
	 * @return An array of boolean type where value of each index represents if
	 *         the number is prime or not
	 */
	public boolean[] PopulatePrimality(long range) {
		Boolean[] primality = new Boolean[(int) (range + 1)];

		primality[0] = false;
		primality[1] = false;

		for (int counter = 2; counter <= range; counter++) {
			if (primality[counter] == null) {
				primality[counter] = IsPrime(counter);
				if (primality[counter]) {
					Integer primalityUpdateCounter = counter * 2;
					while (primalityUpdateCounter <= range) {
						primality[primalityUpdateCounter] = false;
						primalityUpdateCounter += counter;
					}
				}
			}
		}

		boolean[] returnPrimality = new boolean[(int) (range + 1)];
		for (int index = 0; index <= range; index++) {
			returnPrimality[index] = primality[index] == null ? false : primality[index];
		}
		return returnPrimality;
	}

	/**
	 * Gets prime numbers in the given range
	 * 
	 * @param range
	 *            Highest number up to which prime numbers are required
	 * @return List of Long type which are prime number in the given range
	 */
	public List<Long> GetPrimesInRange(long range) {

		boolean[] primality = PopulatePrimality(range);

		List<Long> primeNumbers = new ArrayList<Long>();

		for (int counter = 0; counter < range + 1; counter++) {
			if (primality[counter]) {
				primeNumbers.add((long) counter);
			}
		}
		return primeNumbers;
	}

	/**
	 * Gets the sum of given list of numbers
	 * 
	 * @param numbers
	 *            List of numbers
	 * @return Sum of number
	 */
	public long GetSum(List<Long> numbers) {
		long sum = 0L;
		Iterator<Long> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			sum += iterator.next();
		}
		return sum;
	}

	/**
	 * Finds out the largest number from the given list
	 * 
	 * @param numbers
	 *            List of number
	 * @return Largest number form the given list
	 */
	public long GetLargestNumberFromCollection(List<Long> numbers) {
		Iterator<Long> iterator = numbers.iterator();

		long largestNo = 0L;

		while (iterator.hasNext()) {
			largestNo = Math.max(iterator.next(), largestNo);
		}
		return largestNo;
	}

	/**
	 * Gets the largest prime factor of the given number
	 * 
	 * @param number
	 *            Number for which largest prime factor needs to be found
	 * @return Largest prime factor of the given number
	 */
	public long GetLargestPrimeFactor(long number) {
		return GetLargestNumberFromCollection(GetPrimeFactors(number));
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public long Factorial(long number) {
		long multiplier = 1L;
		long product = 1L;
		while (multiplier <= number) {
			product *= multiplier++;
		}
		return product;
	}

	/**
	 * Gets the total number of factors for the given number
	 * 
	 * @param number
	 *            Number of long type for which count of factors need to be
	 *            calculated
	 * @param primeNumbers
	 *            List of prime numbers
	 * @return Total number of factors for the given number
	 */
	public int GetCountOfFactors(long number, List<Long> primeNumbers) {
		int countOfFactors = 1;

		if (number == 2 || number == 3) {
			return 2;
		}
		List<Long> allPrimeFactors = GetAllPrimeFactors(number, primeNumbers);

		Collections.sort(allPrimeFactors);
		int currentPrimeFactorCount = 0;
		long currentPrimeFactor = 1L;

		Iterator<Long> iterator = allPrimeFactors.iterator();
		long newPrimeFactor = 1L;
		while (true) {
			if (iterator.hasNext()) {
				newPrimeFactor = iterator.next();
			}

			if (newPrimeFactor == currentPrimeFactor) {
				currentPrimeFactorCount++;
			} else {
				currentPrimeFactor = newPrimeFactor;
				countOfFactors *= (currentPrimeFactorCount + 1);
				currentPrimeFactorCount = 1;
			}

			if (!iterator.hasNext()) {
				countOfFactors *= (currentPrimeFactorCount + 1);
				break;
			}
		}
		return countOfFactors;
	}

	/**
	 * Converts the given number into an array of digits
	 * 
	 * @param num
	 *            Number to be converted to array of digits
	 * @return An integer array containing the digits of the given number
	 */
	public List<Integer> ConvertNumberToArrayOfDigits(BigInteger num) {
		List<Integer> list = new ArrayList<Integer>();
		BigInteger ten = BigInteger.valueOf(10);
		while (num.compareTo(BigInteger.ZERO) > 0) {
			BigInteger digit = num.mod(ten);
			list.add(digit.intValue());
			num = (num.subtract(digit)).divide(ten);
		}
		return list;
	}
}