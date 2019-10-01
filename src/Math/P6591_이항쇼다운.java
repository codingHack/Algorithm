package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P6591_이항쇼다운 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break;
			}

			if (b > a - b) {
				b = a - b;
			}

			LinkedList<Integer> l = new LinkedList<Integer>();

			for (int i = 2; i <= b; i++) {
				l.add(i);
			}

			long result = 1;

			for (int i = 0; i < b; i++) {
				result *= a--;

				int cur = 0;
				while (!l.isEmpty()) {
					int temp = l.get(cur);

					if (result % temp == 0) {
						result /= temp;
						l.remove(cur);
						cur = 0;
						continue;
					}

					if (cur == l.size() - 1) {
						break;
					} else {
						cur++;
					}
				}

			}
			while (!l.isEmpty()) {
				result /= l.get(0);
				l.remove(0);
			}

			System.out.println(result);

		}

	}

}
