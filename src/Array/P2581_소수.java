package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2581_소수 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());

		boolean eratos[] = new boolean[M + 1];
		eratos[1] = true;

		for (int i = 2; i <= M / 2; i++) {
			if (!eratos[i]) {
				for (int j = 2; j * i <= M; j++) {
					eratos[j * i] = true;
				}
			}
		}

		int sum = 0;
		int min = M + 1;

		for (int i = N; i <= M; i++) {
			if (!eratos[i]) {
				sum += i;
				min = Math.min(min, i);
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
