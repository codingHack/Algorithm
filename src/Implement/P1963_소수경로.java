package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1963_소수경로 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		for (int t = 0; t < N; t++) {
			boolean eratos[] = new boolean[10000];
			for (int i = 2; i < 5000; i++) {
				if (!eratos[i]) {
					for (int j = 2 * i; j < 10000; j += i) {
						eratos[j] = true;
					}
				}
			}
			for (int i = 1; i < 1000; i++) {
				eratos[i] = true;
			}

			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			Queue<Integer> q = new LinkedList<Integer>();
			Queue<Integer> co = new LinkedList<Integer>();
			q.add(a);
			co.add(0);
			eratos[a] = true;

			while (!q.isEmpty()) {
				int num = q.poll();
				int c = co.poll();
				// System.out.println(num + " " + c);
				if (num == b) {
					bw.write(c + "\n");
					break;
				}

				// 1의자리 변경
				int cur = (num / 10) * 10;
				for (int i = 0; i < 10; i++) {
					if (!eratos[cur + i]) {
						q.add(cur + i);
						co.add(c + 1);
						eratos[cur + i] = true;
					}
				}

				// 10의자리 변경
				cur = num % 10;
				int cur2 = (num / 100) * 100;
				cur2 += cur;
				for (int i = 0; i < 10; i++) {
					if (!eratos[cur2 + (i * 10)]) {
						q.add(cur2 + (i * 10));
						co.add(c + 1);
						eratos[cur2 + (i * 10)] = true;
					}
				}

				// 100자리 변경
				cur = num % 100;
				int cur3 = (num / 1000) * 1000;
				cur3 += cur;
				for (int i = 0; i < 10; i++) {
					if (!eratos[cur3 + (i * 100)]) {
						q.add(cur3 + (i * 100));
						co.add(c + 1);
						eratos[cur3 + (i * 100)] = true;
					}
				}

				// 1000자리
				cur = num % 1000;
				for (int i = 1; i < 10; i++) {
					if (!eratos[cur + (i * 1000)]) {
						q.add(cur + (i * 1000));
						co.add(c + 1);
						eratos[cur + (i * 1000)] = true;
					}
				}

			}
		}
		bw.flush();
	}
}
