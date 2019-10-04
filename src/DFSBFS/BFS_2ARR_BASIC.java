package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_2ARR_BASIC {
	static final int dx[] = { 0, 0, -1, 1 };
	static final int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int arr[][] = new int[H][W];

		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		Queue<Integer> co = new LinkedList<Integer>();

		boolean visited[][] = new boolean[H][W];

		visited[0][4] = true;

		qx.add(0);
		qy.add(4);
		co.add(0);

		int count = 1;
		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			int c = co.poll();
			bw.write(String.format("%d x: %d, y: %d length: %d \n", count++, x, y,c));
			visited[x][y] = true;
			arr[x][y]=1;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (!(nx < 0 || ny < 0 || nx >= H || ny >= W)) {
					if (!visited[nx][ny] && arr[nx][ny] == 0) {
						qx.add(nx);
						qy.add(ny);
						co.add(c+1);
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		

		System.out.println();

		for (int a[] : arr) {
			for (int b : a) {
				bw.write(b + " ");
			}
			bw.write("\n");
		}

		bw.flush();

	}

}
