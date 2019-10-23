package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2160_그림비교 {
	static public int comparePicture(int arr1[][], int arr2[][]) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr1[i][j] != arr2[i][j]) {
					count++;
				}
			}
		}

		return count;
	}

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		int arr[][][] = new int[N][5][7];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				String in[] = br.readLine().split("");
				for (int k = 0; k < 7; k++) {
					if (in[k].equals(".")) {
						arr[i][j][k] = 0;
					} else {
						arr[i][j][k] = 1;
					}
				}
			}
		}
		int min = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int num = comparePicture(arr[i], arr[j]);
				// System.out.println(i+" "+j+" "+num);
				if (num < min) {
					min = num;
					a = i;
					b = j;
				}
			}
		}

		System.out.println((a + 1) + " " + (b + 1));

	}
}
