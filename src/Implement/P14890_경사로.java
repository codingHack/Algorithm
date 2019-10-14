package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P14890_경사로 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int arr[][] = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int count = 0;

		if (L == 1) {
			for (int i = 0; i < N; i++) {
				boolean can = true;
				int cur = arr[i][0];
				for (int j = 1; j < N; j++) {
					if (!(cur == arr[i][j] || cur == arr[i][j] + 1 || cur == arr[i][j] - 1)) {
						can = false;
						break;
					} else {
						if (cur == arr[i][j] + 1 && j > 2) {
							if (cur == arr[i][j - 2] + 1) {
								can = false;
								break;
							}
						}
						cur = arr[i][j];
					}
				}
				if (can) {
					count++;
				}
			}
			for (int i = 0; i < N; i++) {
				boolean can = true;
				int cur = arr[0][i];
				for (int j = 1; j < N; j++) {
					if (!(cur == arr[j][i] || cur == arr[j][i] + 1 || cur == arr[j][i] - 1)) {
						can = false;
						break;
					} else {
						if (cur == arr[i][j] + 1 && j > 2) {
							if (cur == arr[i][j - 2] + 1) {
								can = false;
								break;
							}
						}
						cur = arr[j][i];
					}
				}
				if (can) {
					count++;
				}
			}

			System.out.println(count);
			return;
		}
		// 가로 비교.
		for (int i = 0; i < N; i++) {
			int cur = arr[i][0];
			int len = 1;
			boolean can = true;
			for (int j = 1; j < N; j++) {
				// equal
				if (cur == arr[i][j]) {
					len++;

					// up case
				} else if (cur < arr[i][j]) {
					if (cur + 1 != arr[i][j]) {
						can = false;
						break;
					}
					if (len >= L) {// set
						len = 1;
						cur = arr[i][j];
					} else {// not able
						can = false;
						break;
					}
					// down case
				} else {
					if (cur - 1 != arr[i][j]) {
						can = false;
						break;
					}
					for (int k = j; k < j + L; k++) {
						if (k >= N) {// over
							can = false;
							break;
						}
						if (arr[i][j] != arr[i][k]) {// not L
							can = false;
							break;
						}
					}

					int pre = arr[i][j];
					if (can) {
						j = j + L;
						if (j != N) {
							if (pre != arr[i][j]) {
								can = false;
								break;
							} else {
								cur = arr[i][j];
								len = 1;
							}
						}
					} else {
						break;
					}
				}
			}

			if (can) {
				count++;
				System.out.println(i + "성공 ");
			}
		}

		// 로 비교.
		for (int i = 0; i < N; i++) {
			int cur = arr[0][i];
			int len = 1;
			boolean can = true;
			for (int j = 1; j < N; j++) {
				// equal
				if (cur == arr[j][i]) {
					len++;

					// up case
				} else if (cur < arr[j][i]) {
					if (cur + 1 != arr[j][i]) {
						can = false;
						break;
					}
					if (len >= L) {// set
						len = 1;
						cur = arr[j][i];
					} else {// not able
						can = false;
						break;
					}
					// down case
				} else {
					if (cur - 1 != arr[j][i]) {
						can = false;
						break;
					}
					for (int k = j; k < j + L; k++) {
						if (k >= N) {// over
							can = false;
							break;
						}
						if (arr[j][i] != arr[j][i]) {// not L
							can = false;
							break;
						}
					}

					int pre = arr[j][i];
					if (can) {
						j = j + L;
						if (j != N) {
							if (pre != arr[j][i]) {
								can = false;
								break;
							} else {
								cur = arr[j][i];
								len = 1;
							}
						}
					} else {
						break;
					}
				}
			}

			if (can) {
				count++;
				System.out.println(i + "성공 ");
			}

		}
		System.out.println(count);

	}

}
