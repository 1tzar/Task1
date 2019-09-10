package ua.nure.shamrai.task1;

public class Part7 {

	public static int sumNumber(int n) {
		int summa = 0;
		while (n != 0) {
			int lastnumber = n % 10;
			n = (n - lastnumber) / 10;
			summa += lastnumber;
		}
		return summa;

	}

	public static int getMax(int[] ary) {
		int maxnumber = ary[0];
		int sumnumb = 0;
		for (int i = 1; i < ary.length; i++) {
			sumnumb = sumNumber(maxnumber);
			if (sumnumb < sumNumber(ary[i])) {
				maxnumber = ary[i];
			}
		}
		return sumnumb;
	}

	public static void main(String[] args) {
		int numb = Integer.parseInt(args[0]);
		int[] arr = Part5.getPrimeNumbers(numb);
		int maxsum = getMax(arr);
		int count = 0;
		for (int elem : arr) {
			if (sumNumber(elem) == maxsum) {
				count++;
			}
		}
		System.out.println(maxsum + " " + count);
	}
}
