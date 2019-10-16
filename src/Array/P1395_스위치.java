package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1395_스위치 {
	static public int arr[];
	
	public static int sum(int index, int start, int end, int left, int right) {
		 if (left > end || right < start)
		        return 0;
		 
		    if (left <= start && end <= right)
		        return arr[index];
		 
		    int mid = (start + end) / 2;
		    return sum(index * 2, start, mid, left, right) + sum(index*2+1, mid+1, end, left, right);

	}
	
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int L=0;
		for(L=2;L<N;L*=2) {}
		
		arr=new int[2*L+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==0) {
				for(int j=b-1;j<c;j++) {
					int start=L+j;
					if(arr[L+j]==1) {
						arr[L+j]=0;
						while(start!=0) {
							start/=2;
							arr[start]-=1;
						}
					}else {
						arr[L+j]=1;
						while(start!=0) {
							start/=2;
							arr[start]+=1;
						}
					}
				}
//				System.out.println();
//				for(int k=1;k<L*2;k++) {
//					if(k==2 || k==4 || k==8 || k==16) {
//						System.out.println();
//					}
//					System.out.print(arr[k]+" ");
//				}
//				System.out.println();
			}else {
				System.out.println();
				/*
				 1 -> 1~N
				 1*2  1~N/2 N/2+1~N
				 
				 */
			}
		}
		
	}
}
