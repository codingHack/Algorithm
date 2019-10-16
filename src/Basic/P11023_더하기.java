package Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11023_더하기 {
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int  sum=0;
		
		String s[]=br.readLine().split(" ");
		for(int i=0;i<s.length;i++) {
			sum+=Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}
}
