package DFSBFS;

import java.util.Arrays;

import java.util.Scanner;

public class P15656_N과M7 {
	static public int N;
	static public int M;
	static public int arr[];
	static public boolean visited[];

	static public void DFS(int v, int depth, String s) {
		if (depth == M) {
			System.out.println(s);
			return;
		} else {
			for (int i = 0; i < N; i++) {
				DFS(i, depth + 1, s + " " + arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		for (int i = 0; i < N; i++) {
			visited = new boolean[N];
			DFS(arr[i], 1, "" + arr[i]);
		}

	}

}
