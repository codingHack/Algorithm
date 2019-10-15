package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2529_부등호 {
	static public int N;
	static public long max;
	static public long min;
	static public String[] inequal;
	static public boolean visited[];
	static public boolean firstZeroMin = false;
	static public boolean firstZeroMax = false;

	public static void dfs(int depth, int v, String s) {
		if (depth == N + 1) {
			if(min>Long.parseLong(s)) {
				min=Long.parseLong(s);
				firstZeroMin= (s.substring(0,1).equals("0"))? true:false;
			}
			if(max<Long.parseLong(s)) {
				max=Long.parseLong(s);
				firstZeroMax= (s.substring(0,1).equals("0"))? true:false;
			}
		} else {
			for (int i = 0; i < 10; i++) {
				if (!visited[i]) {
					int last = Integer.parseInt(s.substring(s.length() - 1));
					if (last == i)
						continue;
					if (inequal[depth - 1].equals("<")) {
						if (last > i)
							continue;
					} else {
						if (last < i)
							continue;
					}
					visited[v] = true;
					dfs(depth + 1, i, s + i);
				}
			}
			visited[v] = false;
		}
	}

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		max = 1;
		min = Long.MAX_VALUE;

		N = Integer.parseInt(br.readLine());
		visited = new boolean[10];

		inequal = br.readLine().split(" ");
		for (int i = 0; i < 10; i++) {
			dfs(1, i, "" + i);
		}

		System.out.println((firstZeroMax) ? "0" + max : max);
		System.out.println((firstZeroMin) ? "0" + min : min);

	}
}
