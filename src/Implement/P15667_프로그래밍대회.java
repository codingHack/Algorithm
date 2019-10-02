package Implement;

import java.util.Scanner;

public class P15667_프로그래밍대회 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int K=0;
		while(true) {
			int num=(int) (Math.pow(K, 2)+K+1);
			if((num-N)==0) {
				System.out.println(K);
				break;
			}
			K++;
		}
		
		/*
		 
		 N   =  1 +  k + k^2
		 ]
		 K^2 + K - N+ 1 = 0
		 */
	}

}
