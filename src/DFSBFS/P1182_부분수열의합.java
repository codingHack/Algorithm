package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1182_부분수열의합 {
	static public int arr[];
	static public int N;
	static public int S;
	static public int count;

	public static void DFS(int v, int depth, int sum) {
		if (depth == N) {
			if(sum==S) {
				count++;
			}
		}else {
			if(sum==S) {
				count++;
			}
			for(int i=v+1;i<N;i++) {
				DFS(i,depth+1,sum+arr[i]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		count=0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			DFS(i, 1, arr[i]);
		}
		
		System.out.println(count);

	}

}
