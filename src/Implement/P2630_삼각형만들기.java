package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2630_삼각형만들기 {
	private static int arr[][];
	private static int N;
	private static int countBlue;
	private static int countWhite;
	
	public static void recursion(int x, int y,int N) {		
		
		//종료조건1 종크기가 1
		if(N==1) {
			if(arr[x][y]==1) {				
				countBlue++;
			}else {
				countWhite++;
			}
			return;
		}
		
		//종료조건 모두 1일
		int sum=0;
		for(int i=x;i<x+N;i++) {
			for(int j=y;j<y+N;j++) {
				//System.out.println(i+" "+j);
				if(arr[i][j]==1) {
					sum++;
				}
			}
		}
		
		if(sum==N*N) {
			countBlue++;
			return;
		}else if(sum==0){
			countWhite++;
			return;
		}else{
		
			recursion(x, y, N/2);
			recursion(x+(N/2), y, N/2);
			recursion(x, y+(N/2), N/2);
			recursion(x+(N/2), y+(N/2), N/2);
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		countBlue=0;
		
		arr=new int[N][N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		recursion(0, 0, N);
		
		System.out.println(countWhite);
		System.out.println(countBlue);
		
		
	}

}
