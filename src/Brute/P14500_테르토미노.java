package Brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14500_테르토미노 {
	public static int[][] arr;
	public static boolean[][] visited;
	public static int N;
	public static int M;
	public static int max;
	private static int dx[] = { 0, 0, 1, -1 };
	private static int dy[] = { 1, -1, 0, 0 };

	public static void DFS(int x, int y, int depth, int sum) {
		if (depth == 4) {
			max = Math.max(max, sum);
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
				continue;
			}
			if (visited[nextX][nextY]) {
				continue;
			}
			visited[nextX][nextY] = true;
			DFS(nextX, nextY, depth + 1, sum + arr[nextX][nextY]);
			visited[nextX][nextY] = false;

		}

	}

	public static void bacu(int x, int y) {
		int sum = arr[x][y];
		// ---
		// *-*
		if (!(y - 1 < 0 || y + 1 >= M || x + 1 >= N)) {
			sum += arr[x][y - 1];
			sum += arr[x][y + 1];
			sum += arr[x + 1][y];
			max = Math.max(sum, max);
		}
		sum = arr[x][y];

		// *-
		// --
		// *-
		if (!(x - 1 < 0 || x + 1 >= N || y - 1 < 0)) {
			sum += arr[x - 1][y];
			sum += arr[x + 1][y];
			sum += arr[x][y - 1];
			max = Math.max(sum, max);
		}
		sum = arr[x][y];

		// -*
		// --
		// -*
		if (!(x - 1 < 0 || x + 1 >= N || y + 1 >= M)) {
			sum += arr[x - 1][y];
			sum += arr[x + 1][y];
			sum += arr[x][y + 1];
			max = Math.max(sum, max);
		}
		sum = arr[x][y];

		// *-*
		// ---
		if (!(x - 1 < 0 || y - 1 < 0 || y + 1 >= M)) {
			sum += arr[x - 1][y];
			sum += arr[x][y - 1];
			sum += arr[x][y + 1];
			max = Math.max(sum, max);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				DFS(i, j, 0, 0);
				bacu(i, j);
			}
		}
		System.out.println(max);
	}

}
