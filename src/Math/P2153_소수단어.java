package Math;

import java.util.Scanner;

public class P2153_소수단어 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int num = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				num += ((int) c) - 96;
			} else if (c >= 'A' && c <= 'Z') {
				num += ((int) c) - 38;
			}
		}
		boolean sosu = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				sosu = false;
				break;
			}
		}
		if (sosu) {
			System.out.println("It is a prime word.");
		} else {
			System.out.println("It is not a prime word.");
		}
	}

}
