package Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P3058_짝수 {
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<N;i++) {
			String s[]=br.readLine().split(" ");
			int sum=0;
			int min=1000;
			for(int j=0;j<s.length;j++) {
				int num=Integer.parseInt(s[j]);
				if(num%2==0) {
					sum+=num;
					min=Math.min(min, num);
				}
			}
			System.out.println(sum+" "+min);
		}
	}
}
