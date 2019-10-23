package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1526_금민수 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		/*
		 * 4 7 44 47 74 77 444 447 474 477 744 747 777
		 * 
		 */

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(4);
		q.add(7);

		int last = 4;

		while (true) {
			int p = q.poll();
			if (p > N) {
				break;
			} else {
				q.add(p * 10 + 4);
				q.add(p * 10 + 7);
				last = p;
			}
		}

		System.out.println(last);
	}
}
