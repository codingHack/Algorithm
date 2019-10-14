package Brute;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P3943_헤일스톰 {
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<N;i++) {
			int num=Integer.parseInt(br.readLine());
			int max=num;
			
			while(true) {
				if(num==1) {
					break;
				}
				if(num%2==0) {
					num/=2;
				}else {
					num*=3;
					num+=1;
				}
				if(num>max) {
					max=num;
				}
			}
			System.out.println(max);
			
		}
	}
}
