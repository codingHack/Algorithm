package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15649_N과M1 {
	public static int M;
	public static int N;
	public static boolean visited[];

	public static void DFS(int v, int depth, String s) {
		if (depth == M) {
			System.out.println(s);
		} else {
			visited[v] = true;
			for (int i = 1; i <= N; i++) {
				if (!visited[i]) {
					DFS(i, depth + 1, s + " " + i);
				}
			}
		}
		visited[v] = false;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= N; i++) {
			visited = new boolean[N + 1];
			DFS(i, 1, "" + i);
		}
	}

}
