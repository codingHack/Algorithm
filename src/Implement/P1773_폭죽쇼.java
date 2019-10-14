package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1773_폭죽쇼 {
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		
		boolean p[]=new boolean[S+1];
		
		for(int i=0;i<N;i++) {
			int num=Integer.parseInt(br.readLine());
			for(int j=1;j*num<=S;j++) {
				p[j*num]=true;
			}
		}
		
		int count=0;
		for(boolean a:p) {
			count+= (a==true) ? 1:0;
		}
		
		System.out.println(count);
		
	}
}
