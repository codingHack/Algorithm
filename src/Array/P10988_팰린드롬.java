package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10988_팰린드롬 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();

		int start = 0;
		int end = s.length() - 1;

		boolean can = true;
		while (true) {
			if (start >= end) {
				break;
			} else {
				if (!(s.substring(start, start + 1).equals(s.substring(end, end + 1)))) {
					can = false;
					break;
				}
			}
			start++;
			end--;
		}
		
		System.out.println(can?1:0);
	}
}
