package Brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14889_스타트와링크 {
	public static int A;
	public static String sA;
	public static int B;
	public static String sB;
	public static int N;
	public static int ob;
	public static boolean visited[];

	static public void team(int here) {
		if (ob == 0) {
			System.out.println(sA);
		} else {
			ob--;
			sA += here + " ";
			for (int i = here + 1; i < N; i++) {
				team(i);
			}
		}
		ob++;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		A = 0;
		B = 0;
		sA = "";
		sB = "";
		ob = N;
		visited = new boolean[N];

		team(1);

//		int arr[][]=new int[N][N];
//		for(int i=0;i<N;i++) {
//			st = new StringTokenizer(br.readLine());
//			for(int j=0;j<N;j++) {
//				arr[i][j]=Integer.parseInt(st.nextToken());
//			}
//		}

	}

}
