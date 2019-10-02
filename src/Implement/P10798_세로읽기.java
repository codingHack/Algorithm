package Implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P10798_세로읽기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String arr[][] = new String[5][15];

		for (int i = 0; i < 5; i++) {
			Arrays.fill(arr[i], "-1");
			String in[] = br.readLine().split("");
			for (int j = 0; j < in.length; j++) {
				arr[i][j] = in[j];
			}
		}

		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if (!arr[i][j].equals("-1")) {
					bw.write(arr[i][j]);
				}
			}
		}

		bw.flush();
	}

}
