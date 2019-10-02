package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1032_명령프롬프트 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String [][]arr= new String[N][];
		
		for(int i=0;i<N;i++) {
			arr[i]=br.readLine().split("");
		}
		String result="";
		
		
		for(int i=0;i<arr[0].length;i++) {
			String first=arr[0][i];
			boolean same=true;
			for(int j=1;j<N;j++) {
				if(!first.equals(arr[j][i])) {
					same=false;
					break;
				}
			}
			if(same) {
				result+=first;
			}else {
				result+="?";
			}
		}
		System.out.println(result);
	}

}
