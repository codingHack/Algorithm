package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1956_운동 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in[] = br.readLine().split(" ");
		final int MAX_VALUE = 100000;
		int V = Integer.parseInt(in[0]);
		int T = Integer.parseInt(in[1]);
		int arr[][] = new int[V][V];

		for (int i = 0; i < V; i++) {
			Arrays.fill(arr[i], MAX_VALUE);
		}

		for (int i = 0; i < T; i++) {
			in = br.readLine().split(" ");
			int a = Integer.parseInt(in[0]);
			int b = Integer.parseInt(in[1]);
			int c = Integer.parseInt(in[2]);
			arr[a - 1][b - 1] = c;
		}

		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				for (int k = 0; k < V; k++) {
					if (arr[j][k] > arr[j][i] + arr[i][k]) {
						arr[j][k] = arr[j][i] + arr[i][k];
					}
				}
			}
		}
		int min = MAX_VALUE;
		for (int i = 0; i < V; i++) {
			if (arr[i][i] < min) {
				min = arr[i][i];
			}
		}
		if (min == MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
	}

}
