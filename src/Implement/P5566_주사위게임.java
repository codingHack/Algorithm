package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P5566_주사위게임 {
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int arr[]=new int[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int cur=1;
		int time=0;
		
		while(true) {
			time++;
			int num=Integer.parseInt(br.readLine());
			cur+=num;
			if(cur+arr[cur]>=N) {
				System.out.println(time);
				break;
			}else {
				cur+=arr[cur];
			}
		}
	}
}
