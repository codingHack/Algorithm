package Math;

import java.util.Scanner;

public class P2475_검증수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			count += num * num;
		}
		System.out.println(count % 10);

	}

}
