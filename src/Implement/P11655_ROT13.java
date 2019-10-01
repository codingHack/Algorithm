package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11655_ROT13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split("");

		for (int i = 0; i < s.length; i++) {
			char c = s[i].charAt(0);
			if (c >= 'a' && c <= 'z') {
				c += 13;
				if (c > 122) {
					c = (char) ('a' + (c - 123));
				}
			}
			if (c >= 'A' && c <= 'Z') {
				c += 13;
				if (c > 90) {
					c = (char) ('A' + (c - 91));
				}
			}
			System.out.print(c);
		}
	}

}
