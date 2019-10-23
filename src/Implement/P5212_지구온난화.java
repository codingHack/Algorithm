package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P5212_지구온난화 {
	final static int dx[] = { 1, -1, 0, 0 };
	final static int dy[] = { 0, 0, 1, -1 };

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[][] arr = new String[N][M];

		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				arr[i][j] = s[j];
			}
		}

		boolean change[][] = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int sum = 0;
				for (int k = 0; k < 4; k++) {
					int x = i + dx[k];
					int y = j + dy[k];
					if (x < 0 || y < 0 || x >= N || y >= M) {
						continue;
					} else {
						if (arr[x][y].equals(".")) {
							sum++;
						}
					}
				}
				if (sum >= 3) {
					change[i][j] = true;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (change[i][j]) {
					arr[i][j] = ".";
				}
			}
		}

		int xup = 0;
		boolean can = true;
		while (can) {
			if (xup == N - 1) {
				break;
			}
			for (int i = 0; i < M; i++) {
				if (!arr[xup][i].equals(".")) {
					can = false;
					break;
				}
				if (i == M - 1) {
					xup++;
				}
			}
		}
		can = true;

		int xdown = N - 1;

		while (can) {
			if (xdown == 0) {
				break;
			}
			for (int i = 0; i < M; i++) {
				if (!arr[xdown][i].equals(".")) {
					can = false;
					break;
				}
				if (i == M - 1) {
					xdown--;
				}
			}
		}
		can = true;

		int yleft = 0;
		while (can) {
			if (yleft == M - 1) {
				break;
			}
			for (int i = 0; i < N; i++) {
				if (!arr[i][yleft].equals(".")) {
					can = false;
					break;
				}
				if (i == N - 1) {
					yleft++;
				}
			}
		}
		can = true;

		int yright = M - 1;
		while (can) {
			if (yright == 0) {
				break;
			}
			for (int i = 0; i < N; i++) {
				if (!arr[i][yright].equals(".")) {
					can = false;
					break;
				}
				if (i == N - 1) {
					yright--;
				}
			}
		}

		for (int i = xup; i <= xdown; i++) {
			for (int j = yleft; j <= yright; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}
