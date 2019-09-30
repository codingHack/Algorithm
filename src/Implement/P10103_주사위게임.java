package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10103_주사위게임 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int a = 100;
		int b = 100;

		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			int an = Integer.parseInt(s[0]);
			int bn = Integer.parseInt(s[1]);

			if (an > bn) {
				b -= an;
			} else if (an < bn) {
				a -= bn;
			}
		}

		System.out.println(a);
		System.out.println(b);

	}

}
