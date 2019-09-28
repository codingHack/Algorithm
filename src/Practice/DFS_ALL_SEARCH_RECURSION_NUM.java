package Practice;

public class DFS_ALL_SEARCH_RECURSION_NUM {
	public static int depth;
	public static boolean visited[];
	public static int N;

	static public void DFS(int v, String s, int depth) {
		if (depth == 3) {
			System.out.println(s);
		} else {
			visited[v] = true;
			for (int i = 0; i < N; i++) {
				if (!visited[i]) {
					DFS(i, s+i, depth + 1);
				}
			}
		}
		visited[v] = false;

	}

	public static void main(String[] args) {
		N = 5;
		visited = new boolean[N];
		DFS(0, "", 0);

	}

}
