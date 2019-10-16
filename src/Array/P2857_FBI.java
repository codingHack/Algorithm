package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2857_FBI {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			String s = br.readLine();
			for (int j = 0; j < s.length() - 2; j++) {
				if (s.charAt(j) == 'F' && s.charAt(j + 1) == 'B' && s.charAt(j + 2) == 'I') {
					sum++;
					bw.write(i + 1 + " ");
					break;
				}
			}

		}
		if (sum == 0) {
			bw.write("HE GOT AWAY!\n");
		}

		bw.flush();
	}
}
