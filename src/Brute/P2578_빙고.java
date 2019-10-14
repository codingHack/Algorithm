package Brute;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2578_빙고 {

	static public boolean isBingoHorizon(int arr[][], int a, int b) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[a][i];
		}
		return (sum == 0) ? true : false;
	}

	static public boolean isBingoVertical(int arr[][], int a, int b) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[i][b];
		}
		return (sum == 0) ? true : false;
	}

	static public boolean isBingoDiagnol1(int arr[][], int a, int b) {// \
		if (a != b) {
			return false;
		}

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[i][i];
		}
		return (sum == 0) ? true : false;
	}

	static public boolean isBingoDiagnol2(int arr[][], int a, int b) {// /
		if (a + b != 4) {
			return false;
		}
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[4 - i][i];
		}
		return (sum == 0) ? true : false;
	}

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int arr[][] = new int[5][5];
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int count = 0;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				int num = Integer.parseInt(st.nextToken());

				// find num
				for (int a = 0; a < 5; a++) {
					for (int b = 0; b < 5; b++) {
						if (arr[a][b] == num) {
							arr[a][b] = 0;
							// isBingo
							count += (isBingoHorizon(arr, a, b)) ? 1 : 0;
							count += (isBingoVertical(arr, a, b)) ? 1 : 0;
							count += (isBingoDiagnol1(arr, a, b)) ? 1 : 0;
							count += (isBingoDiagnol2(arr, a, b)) ? 1 : 0;
							if (count >= 3) {
								System.out.println(i * 5 + j + 1);
								return;
							}
						}
					}
				}

			}
		}

	}

}
