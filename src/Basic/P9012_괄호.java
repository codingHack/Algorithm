package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9012_괄호 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String in[] = br.readLine().split("");
			int stackTop = 0;
			for (int t = 0; t < in.length; t++) {
				if (in[t].equals("(")) {
					stackTop++;
				} else {
					stackTop--;
				}
				if (stackTop < 0) {
					break;
				}
			}
			if (stackTop != 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");

			}

		}
	}

}
