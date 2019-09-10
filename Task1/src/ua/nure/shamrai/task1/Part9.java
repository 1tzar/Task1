package ua.nure.shamrai.task1;

public class Part9 {

	public static void main(String[] args) {
		int x = 2;
		int y = Integer.parseInt(args[0]);
		while (x <= y) {
			int n = Part6.nextPrime(x);
			if (n <= y) {
				System.out.print(x + " ");
			}
			if (n > y) {

				System.out.print(x);
			}
			x = n;
		}

	}
}
