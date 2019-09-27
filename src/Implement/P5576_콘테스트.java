package Implement;

import java.util.Scanner;

public class P5576_콘테스트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []rank=new int[3];
		for(int i=0;i<20;i++) {
			int num=sc.nextInt();
			if(num>=rank[0]) {
				rank[2]=rank[1];
				rank[1]=rank[0];
				rank[0]=num;
			}else if(num>=rank[1]) {
				rank[2]=rank[1];
				rank[1]=num;
			}else if(num>rank[2]) {
				rank[2]=num;
			}
			if(i==9 || i==19) {
				System.out.print(rank[0]+rank[1]+ rank[2]+" ");
				rank=new int[3];
			}
		}
	}

}
