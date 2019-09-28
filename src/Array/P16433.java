package Array;

import java.util.Scanner;

public class P16433 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();

		int cur = 1;
		if ((r + c) % 2 == 0) {
			cur = 0;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if ((i + j) % 2 != cur) {
					System.out.print(".");
				} else {
					System.out.print("v");
				}
			}
			System.out.println();
		}
	}

}
