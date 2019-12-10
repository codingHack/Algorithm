package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1981_배열에서이동 {
	static final int dx[] = { 0, 1, 0, -1 };
	static final int dy[] = { 1, 0, -1, 0 };
	static int arr[][];
	static boolean visited[][];
	static int N;
	static int allMin = Integer.MAX_VALUE;
	static int count = 0;

	static public void DFS(int x, int y, int max, int min) {

		if (allMin <= max - min) {
			return;
		}
		if (x == N - 1 && y == N - 1) {
			allMin = Math.min(allMin, max - min);
			count++;

//			for(boolean []a:visited) {
//				for(boolean b:a) {
//					if(b) {
//						System.out.print(1+" ");
//					}else {
//						System.out.print(0+" ");
//					}
//				}
//				System.out.println();
//			}
//			System.out.println();

			return;
		} else {
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (!(nx < 0 || ny < 0 || nx >= N || ny >= N)) {
					if (!visited[nx][ny]) {
						visited[nx][ny] = true;
						DFS(nx, ny, Math.max(max, arr[nx][ny]), Math.min(min, arr[nx][ny]));
						visited[nx][ny] = false;
					}
				}
			}
		}
	}

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());

		arr = new int[N][N];
		visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		visited[0][0] = true;
		DFS(0, 0, 0, Integer.MAX_VALUE);

		System.out.println(allMin);

	}
}
