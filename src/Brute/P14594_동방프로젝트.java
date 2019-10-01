package Brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14594_동방프로젝트 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine());
		
		boolean bag[]=new boolean[N+1];
		for(int i=0;i<T;i++) {
			String in[]=br.readLine().split(" ");
			int a=Integer.parseInt(in[0]);
			int b=Integer.parseInt(in[1]);
			for(int j=a;j<b;j++) {
				bag[j]=true;
			}
		}
		
		int count=1;
		
		for(int i=1;i<N;i++) {
			if(!bag[i]) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
