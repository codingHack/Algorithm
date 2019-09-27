package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16927_배열돌리기2 {
	final static int dx[] = { 0, 1, 0, -1 };
	final static int dy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());// 높이
		int W = Integer.parseInt(st.nextToken());// 너비
		int R = Integer.parseInt(st.nextToken());// 회전수

		int arr[][] = new int[H][W];

		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int min = Math.min(H, W) / 2;

		int rotate[] = new int[min];

		for (int i = 0; i < min; i++) {
			rotate[i] = (2 * (H - (2 * i))) + (2 * (W - (2 * i))) - 4;
		}

		for (int i = 0; i < min; i++) {

			int curR = R % rotate[i];
			for (int r = 0; r < curR; r++) {

				int x = i;
				int y = i;
				int temp = arr[i][i];
				int index = 0;

				while (index < 4) {
					int nx = x + dx[index];
					int ny = y + dy[index];
					if (nx < i || ny < i || nx >= H - i || ny >= W - i) {
						index++;
					} else {
						arr[x][y] = arr[nx][ny];
						x = nx;
						y = ny;
					}

				}
				arr[i + 1][i] = temp;
			}
		}

		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}

}
