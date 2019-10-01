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

class NodeMST {
	public int s, e, v;

	public NodeMST(int s, int e, int v) {
		super();
		this.s = s;
		this.e = e;
		this.v = v;
	}
}
class P1197_MST {

	public static int V;
	public static int length;
	public static ArrayList<NodeMST> arr[];
	public static boolean visited[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		length = 0;
		V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());

		arr = new ArrayList[V + 1];
		for (int i = 0; i < V + 1; i++) {
			arr[i] = new ArrayList<NodeMST>();
		}
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[a].add(new NodeMST(a, b, c));
			arr[b].add(new NodeMST(b, a, c));
		}

		MST();
		System.out.println(length);

	}

	static public void MST() {
		Queue<Integer> q = new LinkedList<Integer>();
		PriorityQueue<NodeMST> pq = new PriorityQueue<NodeMST>(new Comparator<NodeMST>() {
			@Override
			public int compare(NodeMST o1, NodeMST o2) {
				return Integer.compare(o1.v, o2.v);
			}
		});

		visited = new boolean[V + 1];

		q.add(1);

		while (!q.isEmpty()) {
			int num = q.poll();
			visited[num] = true;
			for (NodeMST n : arr[num]) {
				if (!visited[n.e]) {
					pq.add(n);
				}
			}
			while (!pq.isEmpty()) {
				NodeMST n = pq.poll();
				if (!visited[n.e]) {
					visited[n.e] = true;
					q.add(n.e);
					length += n.v;
					break;
				}
			}

		}
	}

}
