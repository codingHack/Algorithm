package Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11722_가장_긴_감소하는_부분_수열 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String s[] = br.readLine().split(" ");
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int dp[] = new int[N + 1];

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					if (dp[j] + 1 > dp[i]) {
						dp[i] = dp[j] + 1;
					}
				}
			}
		}

		int max = dp[0];
		for (int i = 1; i < N; i++) {
			if (max < dp[i]) {
				max = dp[i];
			}
		}

		System.out.println(max + 1);

	}

}
