package Implement;

import java.util.Scanner;

public class P5597_과제안내신 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean visited[] = new boolean[31];
		for (int i = 0; i < 28; i++) {
			visited[sc.nextInt()] = true;
		}

		for (int i = 1; i < 31; i++) {
			if (!visited[i]) {
				System.out.println(i);
			}
		}
	}

}
