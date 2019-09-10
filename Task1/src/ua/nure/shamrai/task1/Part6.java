package ua.nure.shamrai.task1;

public class Part6 {

	public static int nextPrime(int number) {
		boolean variable = true;
		while (variable) {
			++number;
			variable = Part5.isPrime(number) ? false : true;
		}
		return number;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.print(n + " = ");
		int i = 2;
		int pows = 0;
		while (true) {

			if (n % i == 0) {
				pows++;
			} else if (n == 1) {
				System.out.print(i + "^" + pows);
				break;
			} else {
				if (pows != 0) {
					System.out.print(i + "^" + pows + " x ");
					pows = 0;
				}
				i = nextPrime(i);
				pows++;
			}
			n /= i;
		}
	}

}
