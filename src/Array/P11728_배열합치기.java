package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11728_배열합치기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		Queue<Integer> arr1 = new LinkedList<Integer>();
		Queue<Integer> arr2 = new LinkedList<Integer>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr1.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr2.add(Integer.parseInt(st.nextToken()));
		}

		ArrayList<Integer> arr3 = new ArrayList<Integer>();

		while (!(arr1.isEmpty() && arr2.isEmpty())) {
			if (arr1.isEmpty()) {
				arr3.add(arr2.poll());
			} else if (arr2.isEmpty()) {
				arr3.add(arr1.poll());
			} else {
				if (arr1.peek() >= arr2.peek()) {
					arr3.add(arr2.poll());
				} else {
					arr3.add(arr1.poll());
				}
			}
		}

		for (int a : arr3) {
			bw.write(a + " ");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
