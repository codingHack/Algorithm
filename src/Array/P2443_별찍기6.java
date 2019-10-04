package Array;

import java.util.Scanner;

public class P2443_별찍기6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String s = "";
			for (int j = 0; j < i; j++) {
				s += " ";
			}
			for (int j = 0; j < (2 * N - 1) - 2 * i; j++) {
				s += "*";
			}

			System.out.println(s);
		}

	}

}
