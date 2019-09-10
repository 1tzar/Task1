package ua.nure.shamrai.task1;

public class Part4 {

	public static void main(String[] args) {
		
		int res = 0;
		int il = args.length;
		for (int i = 0; i < il; i++) {
			for (int j = 0; j < args[i].length(); j++) {
				if (Character.isDigit(args[i].charAt(j))) {
					res += args[i].charAt(j) - '0';
				}
			}
		}
		System.out.print(res);
	}

}
