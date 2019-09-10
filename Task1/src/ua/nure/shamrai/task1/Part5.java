package ua.nure.shamrai.task1;

public class Part5 {

	public static boolean isPrime(int number) {
		int sqr = (int) Math.sqrt(number);
		for (int i = 2; i <= sqr; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] getPrimeNumbers(int n) {
		int[] array = new int[n];
		int prime = 2;
		int i = 0;
		while (i < array.length) {
			if (isPrime(prime)) {
				array[i] = prime;
				i++;
			}
			++prime;

		}
		return array;

	}

	public static void main(String[] args) {
		int nb = Integer.parseInt(args[0]);
		int[] array = getPrimeNumbers(nb);
		int arrayl = array.length;
		for (int i = 0; i < arrayl; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + " ");
			} else {
				System.out.print(array[i]);

			}
		}
	}

}
