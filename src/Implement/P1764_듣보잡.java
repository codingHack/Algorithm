package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1764_듣보잡 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			m.put(s, 1);
		}

		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (m.containsKey(s)) {
				arr.add(s);
			}
		}

		Collections.sort(arr);

		System.out.println(arr.size());
		for (String s : arr) {
			System.out.println(s);
		}

	}

}
