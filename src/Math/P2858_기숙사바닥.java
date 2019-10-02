package Math;

import java.util.Scanner;

public class P2858_기숙사바닥 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		solve();
	}

	static int l, w;

	static private void solve() {
		l = sc.nextInt();
		w = sc.nextInt();

		int sum = l + w;
		int sqrt = (int) Math.sqrt(sum);

		for (int a = 3; a <= sqrt; a++) {
			int b = sum / a;

			if (b <= 2) {
				continue;
			}

			if (a * b == sum) {
				if (isSatify(a, b)) {
					if (a > b) {
						System.out.println(a + " " + b);
					} else {
						System.out.println(b + " " + a);
					}

					return;
				}
			}
		}
	}

	static public boolean isSatify(int a, int b) {
		int brown = b - 2;
		int red = a * b;

		brown = (a - 2) * brown;
		red -= brown;

		if (red == l && brown == w) {
			return true;
		}

		return false;
	}

}
