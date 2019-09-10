package ua.nure.shamrai.task1;

public class Part1 {

	public static void main(String[] args) {

		int summa = 0;
		for (String string : args) {
			summa += Integer.valueOf(string);
		}
		System.out.print(summa);

	}

}
