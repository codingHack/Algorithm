package Brute;

import java.util.Scanner;

public class P2744_대소문자_바꾸기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ('A' <= c && c <= 'Z') {
				System.out.print((char) (c + 32));
			} else if ('a' <= c && c <= 'z') {
				System.out.print((char) (c - 32));
			}
		}

	}

}
