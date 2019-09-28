package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4153_직각삼각형 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String s[] = br.readLine().split(" ");
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[1]);
			int C = Integer.parseInt(s[2]);
			if (A == 0 && B == 0 && C == 0) {
				break;
			}

			int max = Math.max(A, B);
			int min = Math.min(A, B);

			if (C > max) {
				if (Math.pow(C, 2) == Math.pow(A, 2) + Math.pow(B, 2)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else {
				if (Math.pow(max, 2) == Math.pow(C, 2) + Math.pow(min, 2)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}

			}
		}

	}

}
