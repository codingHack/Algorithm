package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5063_TGN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String in[] = br.readLine().split(" ");
			int r = Integer.parseInt(in[0]);
			int e = Integer.parseInt(in[1]);
			int c = Integer.parseInt(in[2]);

			if (e - c > r) {
				System.out.println("advertise");
			} else if (e - c == r) {
				System.out.println("does not matter");
			} else {
				System.out.println("do not advertise");
			}
		}
	}

}
