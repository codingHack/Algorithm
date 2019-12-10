import java.io.IOException;

public class Psk3 {
	static int[] answer;
	static boolean[] visited;
	static int N;
	static long K;
	static int count;

	public static void dfs(int depth, int v, String s) {
		if (depth == N) {
			if (count == K) {
				System.out.println(s);
				String in[] = s.split(" ");
				for (int i = 0; i < in.length; i++) {
					answer[i] = Integer.parseInt(in[i]);
				}
			}
			count++;
			return;
		} else {
			visited[v] = true;
			for (int i = 1; i <= N; i++) {
				if (!visited[i]) {
					dfs(depth + 1, i, s + " " + i);
				}
			}
			visited[v] = false;
		}
	}

	static public int[] solution(int n, long k) {
		N = n;
		K = k;
		count = 1;
		answer = new int[n];
		visited = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			dfs(1, i, "" + i);
		}
		return answer;
	}

	static public void main(String[] args) throws IOException {
		solution(3, 5);
	}
}
