package Implement;

import java.util.Scanner;

public class P17502_팰린드롬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		String word[] = sc.nextLine().split("");

		int start = 0;
		int end = len - 1;
		while (start <= end) {
			if (word[start].equals("?") && word[end].equals("?")) {
				word[start] = "a";
				word[end] = "a";
			} else if (word[start].equals("?")) {
				word[start] = word[end];
			} else {
				word[end] = word[start];
			}
			start++;
			end--;
		}
		for (String s : word) {
			System.out.print(s);
		}

	}

}
