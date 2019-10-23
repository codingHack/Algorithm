package Implement;

import java.io.*;

public class P10707_수도요금 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());

		System.out.println(Math.min(P * A, (P < C) ? B : B + (P - C) * D));

	}
}
