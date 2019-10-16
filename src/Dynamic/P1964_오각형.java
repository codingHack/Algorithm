package Dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1964_오각형 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		int arr[] = new int[N + 1];
		arr[1] = 5;
		int a = 3;
		for (int i = 2; i <= N; i++) {
			arr[i] = (arr[i - 1] + (a * 3) - 2) % 45678;
			a++;
		}
		System.out.println(arr[N] % 45678);

	}
}
