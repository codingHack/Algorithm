package Brute;

import java.util.Scanner;

public class P1074_Z {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();

		if (N == 1) {
			if (r == 1 && c == 1) {
				System.out.println(1);
			} else if (r == 1 && c == 2) {
				System.out.println(2);
			} else if (r == 2 && c == 1) {
				System.out.println(3);
			} else {
				System.out.println(4);
			}
			return;
		}

		int cur = (int) Math.pow(4, N - 1);

		int count = 0;
		while (cur != 1) {
			int half = cur / 2;
			if (r >= half && c >= half) {// 4
				r -= half;
				c -= half;
				count += 3 * (half * half);
			} else if (r >= half && c < half) {// 3
				r -= half;
				count += 2 * (half * half);
			} else if (r < half && c >= half) {// 2
				c -= half;
				count += (half * half);
			}
			cur = half;

		}
		System.out.println(count);
	}

}
