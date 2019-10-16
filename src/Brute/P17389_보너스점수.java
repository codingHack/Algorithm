package Brute;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P17389_보너스점수 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		String s[] = br.readLine().split("");

		int result = 0;
		int bonus = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("O")) {
				result += i + 1;
				result += bonus;
				bonus++;
			} else {
				bonus = 0;
			}
		}
		System.out.println(result);

	}
}
