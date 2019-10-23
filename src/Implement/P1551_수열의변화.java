package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1551_수열의변화 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		String s[] = br.readLine().split(",");
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		while (K != 0) {
			K--;
			int nArr[] = new int[N - 1];
			for (int i = 0; i < N - 1; i++) {
				nArr[i] = arr[i + 1] - arr[i];
			}
			arr = nArr;
			N--;
		}
		String out = "";
		for (int a : arr) {
			out += a + ",";
		}
		System.out.println(out.substring(0, out.length() - 1));

	}
}
