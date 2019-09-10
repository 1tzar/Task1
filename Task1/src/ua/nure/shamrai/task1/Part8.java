package ua.nure.shamrai.task1;

public class Part8 {

	public static int[][] pascal(int n) {
		int[][] triangle = new int[n][];
		for (int i = 0; i < n; i++) {
			triangle[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				int binc = binCof(i, j);
				triangle[i][j] = binc;
			}
		}
		return triangle;
	}

	public static int factorial(int i) {
		if (i == 0) {
			return 1;
		}
		return i * factorial(i - 1);
	}

	public static int binCof(int a, int b) {
		int q = factorial(a);
		int w = factorial(a - b);
		int e = factorial(b);
		return q / (w * e);
	}

	public static void main(String[] args) {
		int col = Integer.parseInt(args[0]);
		int[][] array = pascal(col);
		for (int i = 0; i < col; i++) {
			for (int j = col - (i + 1); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j > 0) {
					System.out.print(" " + array[i][j]);
				} else {
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}

	}

}
