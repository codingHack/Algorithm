package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P3055_탈출 {
	static public int dx[] = { 1, -1, 0, 0 };
	static public int dy[] = { 0, 0, 1, -1 };

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		final int BE_CUR = 9;
		final int GO_CUR = 8;
		final int WATER = 1;
		final int ROCK = 2;
		final int CAN = 0;

		LinkedList<Integer> wx1 = new LinkedList<Integer>();
		LinkedList<Integer> wy1 = new LinkedList<Integer>();
		LinkedList<Integer> wx2 = new LinkedList<Integer>();
		LinkedList<Integer> wy2 = new LinkedList<Integer>();

		LinkedList<Integer> qx1 = new LinkedList<Integer>();
		LinkedList<Integer> qy1 = new LinkedList<Integer>();
		LinkedList<Integer> qx2 = new LinkedList<Integer>();
		LinkedList<Integer> qy2 = new LinkedList<Integer>();
		LinkedList<Integer> co = new LinkedList<Integer>();

		boolean visited[][] = new boolean[H][W];

		int arr[][] = new int[H][W];

		for (int i = 0; i < H; i++) {
			String in[] = br.readLine().split("");
			for (int j = 0; j < W; j++) {
				if (in[j].equals(".")) {
					arr[i][j] = CAN;
				} else if (in[j].equals("D")) {
					arr[i][j] = BE_CUR;
				} else if (in[j].equals("S")) {
					visited[i][j] = true;
					qx1.add(i);
					qy1.add(j);
					co.add(0);
					arr[i][j] = GO_CUR;
				} else if (in[j].equals("*")) {
					wx1.add(i);
					wy1.add(j);
					arr[i][j] = WATER;
				} else if (in[j].equals("X")) {
					arr[i][j] = ROCK;
				}
			}
		}
		int length = -1;

		loop: while (!(qx1.isEmpty() && qx2.isEmpty())) {
			// 물 확장
			while (!wx1.isEmpty()) {
				int x = wx1.poll();
				int y = wy1.poll();
				for (int k = 0; k < 4; k++) {
					int nx = x + dx[k];
					int ny = y + dy[k];
					if (nx < 0 || ny < 0 || nx >= H || ny >= W) {
						continue;
					} else {
						if (arr[nx][ny] != ROCK && arr[nx][ny] != BE_CUR && arr[nx][ny] != WATER) {
							arr[nx][ny] = WATER;
							wx2.add(nx);
							wy2.add(ny);
						}
					}
				}
			}

			while (!wx2.isEmpty()) {
				wx1.add(0, wx2.poll());
				wy1.add(0, wy2.poll());
			}

			// 비버 이동.
			while (!qx1.isEmpty()) {
				int x = qx1.poll();
				int y = qy1.poll();
//				System.out.println(x + " " + y);
				int c = co.poll();
				if (arr[x][y] == BE_CUR) {
					length = c;
					break loop;
				}
				for (int k = 0; k < 4; k++) {
					int nx = x + dx[k];
					int ny = y + dy[k];
					if (nx < 0 || ny < 0 || nx >= H || ny >= W) {
						continue;
					} else {
						if (arr[nx][ny] != ROCK && arr[nx][ny] != WATER && !visited[nx][ny]) {
							visited[nx][ny] = true;
							qx2.add(nx);
							qy2.add(ny);
							co.add(c + 1);
						}
					}
				}
			}
//			System.out.println();

			while (!qx2.isEmpty()) {
				qx1.add(0, qx2.poll());
				qy1.add(0, qy2.poll());
			}

		}

		System.out.println((length == -1) ? "KAKTUS" : length);

//		for (int[] a : arr) {
//			for (int b : a) {
//				System.out.print(b + " ");
//			}
//			System.out.println();
//		}
	}
}
