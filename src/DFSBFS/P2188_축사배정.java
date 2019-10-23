package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2188_축사배정 {
	static public int N;
	static public int M;
	static public int max;
	static public ArrayList<Integer> arr[];
	static public boolean visited[];

	static public void dfs(int depth) {
		/*
		 * 1선택, 2선택,.. 선택x
		 */
		int sum = 0;
		for (int i = 1; i < visited.length; i++) {
			sum += (visited[i]) ? 1 : 0;
			// System.out.print((visited[i])?1+" ":0+" ");
		}
		// System.out.println();
		max = Math.max(max, sum);
		for (int a : arr[depth]) {
			if (!visited[a]) {
				visited[a] = true;
				dfs(depth + 1);
				visited[a] = false;
			}
		}
	}

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		max = -1;

		arr = new ArrayList[N + 1];
		visited = new boolean[M + 1];

		for (int i = 0; i < N + 1; i++) {
			arr[i] = new ArrayList<Integer>();
		}

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			for (int j = 0; j < T; j++) {
				arr[i].add(Integer.parseInt(st.nextToken()));
			}
		}

		dfs(1);

		System.out.println(max);

	}
}
