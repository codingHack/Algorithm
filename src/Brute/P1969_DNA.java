package Brute;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1969_DNA {
	static public int N;
	static public int M;
	static public String[] dna = { "A", "C", "G", "T" };
	static public String[] arr;

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		String s = "";
		int result = 0;

		for (int i = 0; i < M; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = 0;
			for (int j = 0; j < 4; j++) {
				int sum = 0;
				for (int k = 0; k < N; k++) {
					if (!arr[k].substring(i, i + 1).equals(dna[j])) {
						sum++;
					}
				}
				if (sum < min) {
					min = sum;
					minIndex = j;
				} else if (sum == min) {
					minIndex = Math.min(minIndex, j);
				}
			}
			s += dna[minIndex];
			result += min;
		}
		System.out.println(s);
		System.out.println(result);

	}
}
