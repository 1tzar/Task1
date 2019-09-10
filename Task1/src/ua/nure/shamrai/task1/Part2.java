package ua.nure.shamrai.task1;

public class Part2 {

	public static void main(String[] args) {

		for (int i = args.length - 1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(args[i] + " ");
			} else {
				System.out.print(args[i]);
			}
		}

	}

}
