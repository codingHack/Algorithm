package Math;

import java.util.Scanner;

public class P2903_중앙이동 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int count = 2;
		for (int i = 0; i < num; i++) {
			count += (count - 1);
		}

		System.out.println((int) Math.pow(count, 2));
	}

}
