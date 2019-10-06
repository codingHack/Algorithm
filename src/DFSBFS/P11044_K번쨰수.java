package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11044_K번쨰수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int arr[] = new int[N];
		
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int left=0;
		int right=N-1;
		int pivot=N/2;
		
		/*
		 left < pivot < right  left++  right-- 
		 left > pivot < right   right--
		 left< pivot >right    left++
		 left > pivot > right  swap
		 */
		
		while(pivot!=K) {
			
			
		}

	}

}
