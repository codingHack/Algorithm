package Backtracking;

import java.util.Scanner;

public class P9663_NQueen {
	private static int cols[];
	private static int N;
	private static int count;

	static boolean isPosible(int level) {
		for (int i = 0; i < level; i++) {
			if (cols[i] == cols[level] || Math.abs(cols[i] - cols[level]) == Math.abs(i - level)) {
				return false;
			}
		}
		return true;
	}

	static public boolean dfs(int level) {
		if (level == N) {
			for (int i = 0; i < N; i++) {
				System.out.println(cols[i]);
			}
			return true;
		} else {
			for (int i = 0; i < N; i++) {
				cols[level] = i;
				if (isPosible(level)) {
					if(dfs(level + 1)) {
						break;
					}
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		cols = new int[N];
		dfs(0);

	}

}
