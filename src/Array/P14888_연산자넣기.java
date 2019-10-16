package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P14888_연산자넣기 {
	static public int N;
	static public int num[];
	static public int oper[];
	static public int max;
	static public int min;

	static public void calculate(String s) {
		String sp[] = s.split("");
		int result = num[0];
		for (int i = 1; i < N; i++) {
			if (sp[i - 1].equals("0")) {
				result += num[i];
			} else if (sp[i - 1].equals("1")) {
				result -= num[i];
			} else if (sp[i - 1].equals("2")) {
				result *= num[i];
			} else if (sp[i - 1].equals("3")) {
				result /= num[i];
			}
		}
		max = Math.max(max, result);
		min = Math.min(min, result);
	}

	public static void dfs(int depth, int v, String s) {
		if (depth == N - 1) {
			// System.out.println(s);
			calculate(s);
		} else {
			oper[v]--;
			for (int i = 0; i < 4; i++) {
				if (oper[i] >= 1) {
					dfs(depth + 1, i, s + i);
				}
			}
			oper[v]++;
		}
	}

	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		num = new int[N];
		oper = new int[4];
		max = -Integer.MAX_VALUE;
		min = Integer.MAX_VALUE;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < 4; i++) {
			if (oper[i] >= 1) {
				dfs(1, i, "" + i);
			}
		}
		System.out.println(max);
		System.out.println(min);

	}
}
