package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P14889_스타트와링크 {
	static public int N;
	static public int min;
	static public int arr[][];

	public static void cal(String s) {
		boolean visited[] = new boolean[N];
		String spa[] = s.split(" ");
		int span[] = new int[spa.length];

		for (int i = 0; i < spa.length; i++) {
			span[i] = Integer.parseInt(spa[i]);
			visited[span[i]] = true;
		}

		int spbn[] = new int[spa.length];
		int start = 0;

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				spbn[start++] = i;
			}
		}

		int asum = 0;
		int bsum = 0;

		for (int i = 0; i < N / 2 - 1; i++) {
			for (int j = i + 1; j < N / 2; j++) {
				asum += arr[span[i]][span[j]];
				asum += arr[span[j]][span[i]];
				bsum += arr[spbn[i]][spbn[j]];
				bsum += arr[spbn[j]][spbn[i]];
			}
		}

		min = Math.min(Math.abs(asum - bsum), min);

//		
//		System.out.println("-------------");
//		for(int a:span) {
//			System.out.print(a+" ");
//		}
//		System.out.println();
//		for(int a:spbn) {
//			System.out.print(a+" ");
//		}
//		System.out.println("");
//		System.out.println(asum+" "+bsum+" "+min);
//		System.out.println();
//		
//		

	}

	public static void dfs(int depth, int v, String s) {
		if (depth == N / 2) {
			cal(s);
		} else {
			for (int i = v + 1; i < N; i++) {
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
		arr = new int[N][N];
		min = 10000000;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			dfs(1, i, "" + i);
		}

		System.out.println(min);

	}
}
