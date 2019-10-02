package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2960_에라토스테네스 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		boolean arr[] = new boolean[N + 1];

		boolean find = false;

		int count = 0;
		for (int i = 2; i < N + 1; i++) {
			if (!arr[i]) {
				for (int j = 1; j * i < N + 1; j++) {
					if (!arr[j * i]) {
						count++;
						arr[j * i] = true;
						// System.out.println(count+" "+j*i);
					}
					if (count == K) {
						System.out.println(j * i);
						find = true;
						break;
					}
				}
			}
			if (find) {
				break;
			}
//			for(boolean b:arr) {
//				System.out.print(b+" ");
//			}
		}
	}

}
