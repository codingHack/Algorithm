package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P17252_삼삼한수 {
	public static int maxPow;
	public static int number;
	public static boolean can;

	static public void cal(int depth, int sum) {
		if (sum == number) {
			can = true;
			return;
		}
		if (sum > number) {
			return;
		}
		for (int i = depth + 1; i < maxPow; i++) {
			cal(i, sum + (int) Math.pow(3, i));
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		number = Integer.parseInt(st.nextToken());
		can = false;
		maxPow = 0;
		
		if(number==0) {

			System.out.println("NO");
			return;
		}

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

		cal(-1, 0);
		if (can) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
