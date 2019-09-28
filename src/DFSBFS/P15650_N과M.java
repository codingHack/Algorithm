package DFSBFS;

import java.util.Scanner;

public class P15650_N과M {
	static public int N;
	static public boolean visited[];
	static public int M;

	static public void DFS(int v, int depth, String s) {
		if (depth == M) {
			System.out.println(s);
		} else {
			visited[v] = true;
			for (int i = v + 1; i <= N; i++) {
				if (!visited[i]) {
					DFS(i, depth + 1, s + " " + i);
				}
			}
			visited[v] = false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		visited = new boolean[N + 1];
		for(int i=1;i<=N;i++) {			
			DFS(i, 1, i+"");
		}
	}

}
