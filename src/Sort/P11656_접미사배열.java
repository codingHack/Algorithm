package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P11656_접미사배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0;i<s.length();i++) {
			arr.add(s.substring(i,s.length()));
		}
		
		Collections.sort(arr);
		
		for(String a:arr) {
			System.out.println(a);
		}
	}

}
