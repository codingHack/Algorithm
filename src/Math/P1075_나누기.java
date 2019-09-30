package Math;

import java.util.Scanner;

public class P1075_나누기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();

		N /= 100;
		N *= 100;

		int num = 0;

		for (int i = 0; i < 100; i++) {
			if ((N + i) % F == 0) {
				num = i;
				break;
			}
		}

		if (num < 10) {
			System.out.println("0" + num);
		} else {
			System.out.println(num);
		}
	}

}
