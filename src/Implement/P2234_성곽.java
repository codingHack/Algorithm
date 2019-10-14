package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2234_성곽 {
	final static int dx[] = { 1, 0, -1, 0 };
	final static int dy[] = { 0, 1, 0, -1 };
	static public int arr[][];
	static public int N;
	static public int M;
	static public boolean visited[][];

	public static int dfs(int i, int j) {
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		int co = 1;

		qx.add(i);
		qy.add(j);

		visited[i][j] = true;

		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			int num = arr[x][y];
			boolean dir[] = { true, true, true, true };
			if (num >= 8) {
				num -= 8;
				dir[0] = false;
			}
			if (num >= 4) {
				num -= 4;
				dir[1] = false;
			}
			if (num >= 2) {
				num -= 2;
				dir[2] = false;
			}
			if (num == 1) {
				dir[3] = false;
			}

			for (int k = 0; k < 4; k++) {
				if (dir[k]) {
					int nx = x + dx[k];
					int ny = y + dy[k];
					if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
						continue;
					} else {
						if (!visited[nx][ny]) {
							qx.add(nx);
							qy.add(ny);
							co++;
							visited[nx][ny] = true;
						}
					}
				}
			}
		}
		return co;
	}

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		arr = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int max = -1;
		int count = 0;
		
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visited[i][j]) {
					count++;

					int co = dfs(i, j);

					if (co > max) {
						max = co;
					}
				}
			}
		}

		System.out.println(count);
		System.out.println(max);

		int dir[] = { 8, 4, 2, 1 };
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < M; b++) {
				for (int k = 0; k < 4; k++) {
					if (arr[a][b] >= dir[k]) {
						arr[a][b] -= dir[k];
						
						visited = new boolean[N][M];
						for (int i = 0; i < N; i++) {
							for (int j = 0; j < M; j++) {
								if (!visited[i][j]) {
									count++;

									int co = dfs(i, j);

									if (co > max) {
										max = co;
									}
								}
							}
						}
						
						arr[a][b] += dir[k];
					}
				}
			}
		}
		System.out.println(max);

	}
}
