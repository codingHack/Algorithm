package Brute;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2979_주차 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int arr[] = new int[101];
		System.out.println();
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int j = a; j < b; j++) {
				arr[j]++;
			}
		}
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (arr[i] == 1) {
				sum += A;
			} else if (arr[i] == 2) {
				sum += 2 * B;
			} else if (arr[i] == 3) {
				sum += 3 * C;
			}
		}
		System.out.println(sum);

	}
}
