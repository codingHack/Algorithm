package Brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2998_8진수 {
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s=br.readLine();
		
		if(s.length()%3==1) {
			s="00"+s;
		}
		if(s.length()%3==2) {
			s="0"+s;
		}
		
		String result="";
		for(int i=0;i<s.length()-2;i+=3) {
			String ss=s.substring(i, i+3);
			if(ss.equals("000")) {
				result+="0";
			}else if(ss.equals("001")) {
				result+="1";
			}else if(ss.equals("010")) {
				result+="2";
			}else if(ss.equals("011")) {
				result+="3";
			}else if(ss.equals("100")) {
				result+="4";
			}else if(ss.equals("101")) {
				result+="5";
			}else if(ss.equals("110")) {
				result+="6";
			}else if(ss.equals("111")) {
				result+="7";
			}
		}
		
		System.out.println(result);
	}
}
