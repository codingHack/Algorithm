package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P9517_아이러브크로아티아 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		// 오답, 스킵-> 다음문제
		// 정답-> 왼쪽
		// T, N, P

		int curBomb = K;
		int curTime = 0;
		for (int i = 0; i < N; i++) {
			if (curTime >= 210) {
				break;
			}
			String in[] = br.readLine().split(" ");
			int time = Integer.parseInt(in[0]);
			String s = in[1];

			if (s.equals("T")) {
				curTime += time;
				if (curTime >= 210) {
					break;
				}
				curBomb++;
				curBomb = (curBomb == 9) ? 1 : curBomb;
			} else if (s.equals("N")) {
				curTime += time;
			} else if (s.equals("P")) {
				curTime += time;
				continue;
			}
		}
		System.out.println(curBomb);
	}
}
