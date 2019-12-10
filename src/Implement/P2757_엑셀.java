package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2757_엑셀 {
	
	static public void main(String []args) throws IOException {
		//System.out.println((int)'A');//65
		//System.out.println((int)'Z');//90
		System.out.println(26*26);
		System.out.println(26*26*26);
		System.out.println(25*25*25);
		System.out.println(25*25*26);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		while(true) {
			String s=br.readLine();
			s=s.substring(1,s.length());
			
			int i=0;
			for(;i<s.length();i++) {
				if(s.substring(i, i+1).equals("C")) {
					break;
				}
			}
			
			int r=Integer.parseInt(s.substring(0,i));
			int c=Integer.parseInt(s.substring(i+1,s.length()));
			
			String result="A"; //->1  Z->26
						//AA     ->27   AZ->52   BZ->77 ZZ->
			
			while(c==0) {
				if(c-26>0) {
					
				}
			}
			
			System.out.println(result);
			
		
			
			
			
		}
	}
}
