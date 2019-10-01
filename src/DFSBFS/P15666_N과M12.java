package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class P15666_N과M12 {
	static public int N;
	static public int M;
	static public int[] arr;
	public static Map<String, Integer> m;

	public static void DFS(int v, int depth, String s) {
		if (depth == M) {
			m.put(s, 0);
			return;
		} else {
			for (int i = v; i < N; i++) {
				DFS(i, depth + 1, s + " " + arr[i]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		;
		m = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			DFS(i, 1, "" + arr[i]);
		}
		Set<String> s = m.keySet();

		for (String a : s) {
			System.out.println(a);
		}

	}

}
