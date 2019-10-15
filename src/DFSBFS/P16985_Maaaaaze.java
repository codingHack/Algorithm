package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P16985_Maaaaaze {
	static public int arr[][][];
	static public int newArr[][][];
	static int result = 1000;

	static public int rx[] = { 0, 1, 0, -1 };
	static public int ry[] = { 1, 0, -1, 0 };
	static public int dx[] = { 1, 0, 0, -1, 0, 0 };
	static public int dy[] = { 0, 1, 0, 0, -1, 0 };
	static public int dz[] = { 0, 0, 1, 0, 0, -1 };

	static public void rotateNum(int depth, int v, String s) {
		if (depth == 5) {
			System.out.println(s);
			String ss[]=s.split("");
			for(int i=0;i<5;i++) {
				rotate(i, Integer.parseInt(ss[i]));
			}
			dfs();
		} else {
			for (int i = 0; i < 4; i++) {
				rotateNum(depth + 1, i, s + i);
			}
		}
	}

	static public void rotate(int a, int num) {
		int temp[][] = arr[a];
		int change[][] = new int[5][5];
		if (num != 0) {
			// 회전.
			for (int k = 0; k < num; k++) {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						change[j][4 - i] = temp[i][j];
					}
				}
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						temp[i][j] = change[i][j];
					}
				}
			}
		} else {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					change[i][j] = temp[i][j];
				}
			}
		}

		newArr[a] = change;
	}

	static public void dfs() {
		// 000->444
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		Queue<Integer> qz = new LinkedList<Integer>();
		Queue<Integer> co = new LinkedList<Integer>();

		boolean visited[][][] = new boolean[5][5][5];

		qx.add(0);
		qy.add(0);
		qz.add(0);
		co.add(0);
		visited[0][0][0] = true;

		int min = 10000;

		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			int z = qz.poll();
			int c = co.poll();

			if (x == 4 && y == 4 && z == 4) {
				min = (c < min) ? c : min;
			}

			for (int k = 0; k < 6; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				int nz = z + dz[k];
				if (nx < 0 || ny < 0 || nz < 0 || nx >= 5 || ny >= 5 || nz >= 5) {
					continue;
				} else {
					if (!visited[nx][ny][nz] && (newArr[nx][ny][nz] == 1)) {
						qx.add(nx);
						qy.add(ny);
						qz.add(nz);
						co.add(c + 1);
						visited[nx][ny][nz] = true;
					}
				}
			}
		}
		
		System.out.println(min);
		System.out.println();

		if (min < result) {
			result = min;
		}
	}

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		arr = new int[5][5][5];
		newArr = new int[5][5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < 5; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			rotateNum(1, i, "" + i);
		}
		System.out.println(result);
	}
}
