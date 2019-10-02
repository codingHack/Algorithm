package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10886_CUTE {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		int a = 0;
		int b = 0;
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(br.readLine()) == 1) {
				a++;
			} else {
				b++;
			}
		}

		if (a > b) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}

	}

}
