package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7600_문자몇갤까 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			boolean arr[] = new boolean[27];
			String s = br.readLine().toUpperCase();
			if (s.equals("#")) {
				break;
			}

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c >= 'A' && c <= 'Z') {
					arr[c - 65] = true;
				}
			}

			int sum = 0;
			for (int i = 0; i < 27; i++) {
				if (arr[i])
					sum++;
			}
			System.out.println(sum);
		}
	}
}
