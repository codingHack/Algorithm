package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9325_얼마 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());

		for (int i = 0; i < T; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			sum += Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				sum += (a * b);
			}
			System.out.println(sum);

		}
	}

}
