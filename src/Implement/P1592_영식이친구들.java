package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1592_영식이친구들 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int count[] = new int[N + 1];

		int cur = 1;
		int time = 0;

		while (true) {
			if (count[cur] == M - 1) {
				System.out.println(time);
				return;
			}
			time++;
			count[cur]++;
			// System.out.println(cur);
			if (count[cur] % 2 == 0) {
				cur -= L;
				if (cur <= 0) {
					cur = N + cur;
				}
			} else {
				// 시계L
				cur += L;
				if (cur > N) {
					cur -= N;
				}
			}

			/*
			 * 1_> 1 N 1-> 2 N-1 1-> 3 N-2
			 * 
			 * 2->4 1 N N-1 N-2
			 * 
			 * 3-> (4) 2 1 N N-1 5 4 3 2 5 6 8
			 */

		}
	}
}
