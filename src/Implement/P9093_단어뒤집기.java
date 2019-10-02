package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9093_단어뒤집기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String print = "";
			String in = br.readLine();

			Stack<String> s = new Stack<String>();
			for (int j = 0; j < in.length(); j++) {
				String sub = in.substring(j, j + 1);
				if (sub.equals(" ")) {
					while (!s.isEmpty()) {
						print += s.pop();
					}
					print += " ";
				} else {
					s.add(sub);
				}
			}
			while (!s.isEmpty()) {
				print += s.pop();
			}

			System.out.println(print);
		}
	}

}
