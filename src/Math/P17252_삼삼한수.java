package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P17252_삼삼한수 {
	public static int maxPow;
	public static long number;
	public static boolean can;

	static public void cal(int v, long sum, String s) {
		// System.out.println(s + " " + sum);
		if (can) {
			return;
		}
		if (sum == number) {
			can = true;
			return;
		}
		if (sum > number) {
			return;
		}
		for (int i = v + 1; i <= maxPow; i++) {
			cal(i, sum + (long) Math.pow(3, i), s + " " + i);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		number = Integer.parseInt(st.nextToken());
		if (number == 0) {
			System.out.println("NO");
			return;
		}
		can = false;
		maxPow = 0;
		long cur = 0;
//		for (int i = 0; cur <= number; i++) {
//			cur = (int) Math.pow(3, i + 1);
//			maxPow = i;
//		}

		for (int i = 0;; i++) {
			int num = (int) Math.pow(3, i);
			if (num == number) {
				System.out.println("YES");
				return;
			}
			if (Math.pow(3, i) > number) {
				maxPow = i;
				break;
			}
		}

		cal(-1, 0, "");
//		for (int i = 0; i <= maxPow; i++) {
//			cal(i, (int) Math.pow(3, i), " " + i);
//		}
		if (can) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
