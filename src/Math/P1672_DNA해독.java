package Math;

import java.util.Scanner;

public class P1672_DNA해독 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int A = 0;
		final int G = 1;
		final int C = 2;
		final int T = 3;

		int arr[][] = { { A, C, A, G }, { C, G, T, A }, { A, T, C, G }, { G, A, G, T } };

		Scanner sc = new Scanner(System.in);

		int L = Integer.parseInt(sc.nextLine());
		String s[] = sc.nextLine().split("");
		int sn[] = new int[L];

		for (int i = 0; i < L; i++) {
			if (s[i].equals("A")) {
				sn[i] = 0;
			} else if (s[i].equals("G")) {
				sn[i] = 1;
			} else if (s[i].equals("C")) {
				sn[i] = 2;
			} else if (s[i].equals("T")) {
				sn[i] = 3;
			}
		}

		for (int i = L - 1; i > 0; i--) {
			sn[i - 1] = arr[sn[i]][sn[i - 1]];
		}

		if (sn[0] == 0) {
			System.out.println("A");
		} else if (sn[0] == 1) {
			System.out.println("G");
		} else if (sn[0] == 2) {
			System.out.println("C");
		} else {
			System.out.println("T");
		}

	}

}
