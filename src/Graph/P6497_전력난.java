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

class Node6497 {
	public int s, e, l;

	public Node6497(int s, int e, int l) {
		super();
		this.s = s;
		this.e = e;
		this.l = l;
	}
}

public class P6497_전력난 {

	public static int numHouse;
	public static int numLen;
	public static int length;
	public static int sum;
	public static ArrayList<Node6497> arr[];

	static public void MST() {
		Queue<Integer> q = new LinkedList<Integer>();
		PriorityQueue<Node6497> pq = new PriorityQueue<Node6497>(new Comparator<Node6497>() {
			@Override
			public int compare(Node6497 o1, Node6497 o2) {
				return Integer.compare(o1.l, o2.l);
			}
		});
		boolean visited[] = new boolean[numHouse];

		q.add(0);
		visited[0] = true;

		while (!q.isEmpty()) {
			int v = q.poll();
			visited[v]=true;
			for (Node6497 n : arr[v]) {
				if (!visited[n.e]) {
					pq.add(n);
				}
			}
			
			while (!pq.isEmpty()) {
				Node6497 n = pq.poll();
				if (!visited[n.e]) {
					visited[n.e] = true;
					q.add(n.e);
					length += n.l;
					break;
				}
			}

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		//st = new StringTokenizer(br.readLine());

		while (true) {
			st = new StringTokenizer(br.readLine());
			numHouse = Integer.parseInt(st.nextToken());
			numLen = Integer.parseInt(st.nextToken());
			if (numHouse == 0 && numLen == 0) {
				break;
			}
			arr = new ArrayList[numHouse];

			for (int i = 0; i < numHouse; i++) {
				arr[i] = new ArrayList<Node6497>();
			}
			length=0;
			sum=0;

			for (int i = 0; i < numLen; i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				int length = Integer.parseInt(st.nextToken());
				sum+=length;

				arr[start].add(new Node6497(start, end, length));
				arr[end].add(new Node6497(end, start, length));
			}

			MST();
			
			//System.out.println(sum);
			System.out.println(sum-length);
			

		}
	}

}
