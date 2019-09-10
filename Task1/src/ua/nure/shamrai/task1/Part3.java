package ua.nure.shamrai.task1;

public class Part3 {

	public static int gcd(int a, int b) {
		if (b != 0) {
			return gcd(b, a % b);
		}
		return a;
	}

	public static void main(String[] args) {

		int w = Integer.parseInt(args[0]);
		int v = Integer.parseInt(args[1]);
		int result = gcd(w, v);
		System.out.println(result + " " + (w * v) / result);
	}
}
