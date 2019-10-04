package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14910_오르막 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in[] = br.readLine().split(" ");

		int cur = -1;
		for (int i = 0; i < in.length; i++) {
			int num=Integer.parseInt(in[i]);
			if (num< cur) {
				System.out.println("Bad");
				return;
			}
			cur=num;
		}
		System.out.println("Good");

	}

}
