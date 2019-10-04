package Implement;

import java.util.Scanner;

public class P11006_닭장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int num = b * 2 - a;
			System.out.println(num + " " + (b - num));
		}
	}

}
