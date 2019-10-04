package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11066_파일합치기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		


	}

}
