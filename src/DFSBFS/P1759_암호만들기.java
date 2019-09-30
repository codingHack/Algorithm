package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1759_암호만들기 {
	static private int L;
	static private int C;
	static private String in[];

	static public void DFS(int v, int depth, String s) {
		if (depth == L) {
			// a e i o u
			String arr[] = s.split("");
			int a = 0;
			int b = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o")
						|| arr[i].equals("u")) {
					a++;
				} else {
					b++;
				}
			}
			if (a >= 1 && b >= 2) {
				System.out.println(s);
			}
		} else {
			for (int i = v + 1; i < C; i++) {
				DFS(i, depth + 1, s + in[i]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		in = br.readLine().split(" ");
		L = Integer.parseInt(in[0]);
		C = Integer.parseInt(in[1]);

		in = br.readLine().split(" ");

		Arrays.sort(in);

		for (int i = 0; i < C; i++) {
			DFS(i, 1, "" + in[i]);
		}

	}

}
