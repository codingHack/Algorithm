package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P10866_DEQUE {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < T; i++) {
			String[] s = br.readLine().split(" ");
			switch (s[0]) {
			case "push_front":
				l.addFirst(Integer.parseInt(s[1]));
				break;
			case "push_back":
				l.addLast(Integer.parseInt(s[1]));
				break;
			case "pop_front":
				if (l.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(l.pollFirst());
				}
				break;
			case "pop_back":
				if (l.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(l.pollLast());
				}
				break;
			case "size":
				System.out.println(l.size());
				break;
			case "empty":
				if (l.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (l.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(l.peekFirst());
				}
				break;
			case "back":
				if (l.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(l.peekLast());
				}
				break;
			default:
				break;
			}
		}
	}

}
