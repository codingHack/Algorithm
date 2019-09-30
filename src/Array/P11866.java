package Array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class P11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		LinkedList<Integer> l = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			l.add(i);
		}

		int cur = K - 1;
		String s = "<";

		while (!l.isEmpty()) {
			s += l.remove(cur) + ", ";
			cur += K - 1;
			if (cur >= l.size() && l.size() != 0) {
				cur = cur % l.size();
			}
		}

		s = s.substring(0, s.length() - 2);
		System.out.println(s + ">");
	}

}
