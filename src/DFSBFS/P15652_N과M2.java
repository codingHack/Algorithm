package DFSBFS;

import java.util.Scanner;

public class P15652_N과M2 {
	static public int N;
	static public int M;

	public static void DFS(int v, int depth, String s) {
		if (depth == M) {
			System.out.println(s);
		} else {
			for (int i = v; i <= N; i++) {
				DFS(i, depth + 1, s + " " + i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			DFS(i, 1, "" + i);
		}

	}

}
