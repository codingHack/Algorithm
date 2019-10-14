package Brute;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1748_수이어쓰기1 {
	static int numberCount(int num) {
		int count=0;
		while(true) {
			if(num!=0) {
				num/=10;
				count++;
			}else {
				break;
			}
		}
		return count;
	}
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		
		int count=0;
		
		for(int i=1;i<=N;i++) {
			count+=numberCount(i);
		}
		System.out.println(count);
	}
}
