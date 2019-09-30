package Math;

import java.util.Scanner;

public class P1037_약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int arr[] = new int[T];

		int min = Integer.MAX_VALUE;
		int max = -1;
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println(max * min);
	}
}
