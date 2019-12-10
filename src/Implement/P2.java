package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P2 {
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		
		int DP[][]=new int[n+1][];

		DP[1]=new int[1];
		for(int i=2;i<n+1;i++) {
			DP[i]=new int[DP[i-1].length*2+1];
		}
		
		LinkedList<Integer> arr1=new LinkedList<Integer>();
		LinkedList<Integer> arr2=new LinkedList<Integer>();
		
		arr1.add(0);
		
		for(int i=0;i<n;i++) {
			if(arr1.isEmpty()) {
				for(int a:arr2) {
					arr1.add(a);
				}
				while(!arr2.isEmpty()) {
					arr1.add(arr2.poll());
				}
				arr1.add(1);
			}else {
				for(int a:arr1) {
					arr2.add(a);
				}
				while(!arr1.isEmpty()) {
					arr2.add(arr1.poll());
				}
				arr2.add(1);
			}
		}
		if(arr1.isEmpty()) {
			Integer[] a=arr2.toArray(new Integer[arr1.size()]);
		}else {
			Integer[] a=arr1.toArray(new Integer[arr1.size()]);
		}
	}
}
