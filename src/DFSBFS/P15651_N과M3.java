package DFSBFS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P15651_N과M3 {
	static public int N;
	static public int M;

	public static void dfs(int depth, int v, String s) {
		if (depth == M) {
			System.out.println(s);
		} else {
			for (int i = 1; i <= N; i++) {
				dfs(depth + 1, i, s + " " + i);
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

		for (int i = 1; i <= N; i++) {
			dfs(1, i, "" + i);
		}

	}
}
