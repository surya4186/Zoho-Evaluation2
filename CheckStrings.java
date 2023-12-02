package zsgs;

import java.util.Scanner;

public class CheckStrings {
	public static boolean checkTwoString(String str1, String str2) {
		boolean flag = false;
		char letter = ' ';
		for (int i = 0; i < str2.length(); i++) {

			for (int j = 0; j < str1.length(); j++) {
				letter = str1.charAt(j);
				if (letter >= 65 && letter <= 90) {
					letter = (char) (str1.charAt(j) + 32);

				}
				if (str2.charAt(i) == letter) {
					flag = true;
					break;

				}

			}
			if (flag) {

				flag = false;
			} else {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String str1 = scan.next();
		System.out.println("Enter the 2nd string");
		String str2 = scan.next();
		System.out.println(checkTwoString(str1, str2));

	}

}
