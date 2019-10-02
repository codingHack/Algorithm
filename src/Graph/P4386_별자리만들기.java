package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Node4386 {
	public int s, e;
	public double v;

	public Node4386(int s, int e, double v) {
		super();
		this.s = s;
		this.e = e;
		this.v = v;
	}
}

public class P4386_별자리만들기 {
	public static ArrayList<Node4386> arr[];
	public static boolean visited[];
	public static int N;
	public static double count;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		count = 0;
		arr = new ArrayList[N + 1];
		for (int i = 0; i < N + 1; i++) {
			arr[i] = new ArrayList<Node4386>();
		}

		double x[] = new double[N + 1];
		double y[] = new double[N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Double.parseDouble(st.nextToken());
			y[i] = Double.parseDouble(st.nextToken());
		}

		for (int i = 1; i < N; i++) {
			for (int j = i + 1; j < N + 1; j++) {
				double length = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
				arr[i].add(new Node4386(i, j, Math.round(length * 1000.0) / 1000.0));
				arr[j].add(new Node4386(j, i, Math.round(length * 1000.0) / 1000.0));

			}
		}

		MST();
		System.out.println(Math.round(count * 10000) / 10000.0);

	}

	public static void MST() {
		Queue<Integer> q = new LinkedList<Integer>();
		PriorityQueue<Node4386> pq = new PriorityQueue<Node4386>(new Comparator<Node4386>() {
			@Override
			public int compare(Node4386 o1, Node4386 o2) {
				return Double.compare(o1.v, o2.v);
			}
		});

		q.add(1);
		visited = new boolean[N + 1];

		while (!q.isEmpty()) {
			int num = q.poll();
			visited[num] = true;
			for (Node4386 n : arr[num]) {
				if (!visited[n.e]) {
					pq.add(n);
				}
			}
			while (!pq.isEmpty()) {
				Node4386 n = pq.poll();
				if (!visited[n.e]) {
					visited[n.e] = true;
					q.add(n.e);
					count += n.v;
					break;
				}
			}
		}

	}

}
