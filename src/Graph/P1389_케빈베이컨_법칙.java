package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1389_케빈베이컨_법칙 {
	static final int MAX_VALUE = 100000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int arr[][] = new int[N][N];

		for (int i = 0; i < N; i++) {
			Arrays.fill(arr[i], MAX_VALUE);
			arr[i][i] = 0;
		}

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a - 1][b - 1] = 1;
			arr[b - 1][a - 1] = 1;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (arr[j][k] > arr[j][i] + arr[i][k]) {
						arr[j][k] = arr[j][i] + arr[i][k];
					}

				}
			}
		}

		int min = MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 0; j < N; j++) {
				if (arr[i][j] != MAX_VALUE) {
					count += arr[i][j];
				}
			}
			if (count < min) {
				min = count;
				minIndex = i;
			}
		}

		System.out.println(minIndex + 1);

	}

}
