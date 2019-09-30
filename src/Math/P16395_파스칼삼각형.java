package Math;

import java.util.Scanner;

public class P16395_파스칼삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int total=0;
		
		for(int i=1;i<=n;i++) {
			total+=i;
		}
		
		int arr[][]=new int[n+1][];

		for(int i=1;i<=n;i++) {
			arr[i]=new int[i+1];
			arr[i][1]=1;
			arr[i][i]=1;
			for(int j=2;j<i;j++) {
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		
		
		System.out.println(arr[n][k]);
	}
	
	/*        0  1  2   3   4   5   
	 *    1      1
	 *    2      1  1 
	 *    3      1  2   1
	 *    4      1  3   3   1
	 *           
	 */

}
