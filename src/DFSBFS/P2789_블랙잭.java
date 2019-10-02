package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2789_블랙잭 {
	public static int N;
	public static int M;
	public static int max;
	public static int arr[];

	static public void DFS(int v, int depth, int sum) {
		if (depth == 3) {
			if (sum > M) {
				return;
			}
			if (M - max > M - sum) {
				max = sum;
			}
		} else {
			for (int i = v + 1; i < N; i++) {
				DFS(i, depth + 1, sum + arr[i]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		max = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			DFS(i, 1, arr[i]);
		}

		System.out.println(max);
	}

}
