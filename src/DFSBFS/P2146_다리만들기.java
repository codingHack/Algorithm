package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2146_다리만들기 {
	static final int dx[] = { 1, -1, 0, 0 };
	static final int dy[] = { 0, 0, 1, -1 };
	static public boolean visited[][];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		int arr[][] = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int count = 2;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1) {
					// DFS -> count 값으로만
					Queue<Integer> qx = new LinkedList<Integer>();
					Queue<Integer> qy = new LinkedList<Integer>();
					visited = new boolean[N][N];

					qx.add(i);
					qy.add(j);
					visited[i][j] = true;
					while (!qx.isEmpty()) {
						int x = qx.poll();
						int y = qy.poll();
						arr[x][y] = count;
						for (int k = 0; k < 4; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
								continue;
							} else {
								if (arr[nx][ny] == 1 && !visited[nx][ny]) {
									visited[nx][ny] = true;
									qx.add(nx);
									qy.add(ny);
								}
							}
						}

					}
					count++;
				}
			}
		}
		int min = 1000000000;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] != 0) {
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
							continue;
						} else {
							if (arr[nx][ny] == 0) {
								// DFS i, j에서 해봐서 내숫자 말고 다른숫자로 갈때 가장 적은 거리
								int my = arr[i][j];
								Queue<Integer> qx = new LinkedList<Integer>();
								Queue<Integer> qy = new LinkedList<Integer>();
								Queue<Integer> co = new LinkedList<Integer>();

								qx.add(i);
								qy.add(j);
								co.add(0);
								visited = new boolean[N][N];
								visited[i][j] = true;

								while (!qx.isEmpty()) {
									int x = qx.poll();
									int y = qy.poll();
									int c = co.poll();
									if (arr[x][y] != my && arr[x][y] != 0) {
										if (c < min) {
											// System.out.println("i:" + i + ", j:" + j + " x:" + x + " y:" + y + "
											// len:"
											// + c + " " + arr[x][y]);
											min = c;
										}
										break;
									}
									for (int o = 0; o < 4; o++) {
										int tx = x + dx[o];
										int ty = y + dy[o];
										if (tx < 0 || ty < 0 || tx >= N || ty >= N) {
											continue;
										} else {
											if (arr[tx][ty] != my && !visited[tx][ty]) {
												visited[tx][ty] = true;
												qx.add(tx);
												qy.add(ty);
												co.add(c + 1);
											}
										}
									}

								}

							}
						}
					}
				}
			}
		}

		System.out.println(min - 1);

	}

}
