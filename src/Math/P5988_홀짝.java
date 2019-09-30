package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5988_홀짝 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String s = br.readLine();
			String last = s.substring(s.length() - 1);

			if (Integer.parseInt(last) % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}

}
