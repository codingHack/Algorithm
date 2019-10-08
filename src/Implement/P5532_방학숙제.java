package Implement;

import java.util.Scanner;

public class P5532_방학숙제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();

		int one = (int) Math.ceil(A / C);
		int two = (int) Math.ceil(B / D);

		System.out.println(L - Math.max(one, two));
	}

}
