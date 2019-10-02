package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5355_화성수학 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String in[] = br.readLine().split(" ");
			double num = Double.parseDouble(in[0]);
			for (int j = 1; j < in.length; j++) {
				if (in[j].equals("@")) {
					num *= 3;
				} else if (in[j].equals("%")) {
					num += 5;
				} else if (in[j].equals("#")) {
					num -= 7;
				}
			}
			System.out.printf("%.2f\n", num);
		}
	}

}
