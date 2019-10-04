package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2636_치즈 {
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		int arr[][] = new int[H][W];

		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				String s = st.nextToken();
				if (s.equals("0")) {
					arr[i][j] = 9;
				} else {
					arr[i][j] = 1;
				}

			}
		}

		int index = 0;
		int x = 0;
		int y = 0;
		while (true) {
			if (x == 1 && y == 0) {
				break;
			}
			if (arr[x][y] == 9) {
				boolean visited[][] = new boolean[H][W];
				Queue<Integer> qx = new LinkedList<Integer>();
				Queue<Integer> qy = new LinkedList<Integer>();
				qx.add(x);
				qy.add(y);
				visited[x][y] = true;

				while (!qx.isEmpty()) {
					int cx = qx.poll();
					int cy = qy.poll();
					arr[cx][cy] = 0;
					for (int i = 0; i < 4; i++) {
						int nx = cx + dx[i];
						int ny = cy + dy[i];
						if (nx < 0 || ny < 0 || nx >= H || ny >= W) {
							continue;
						} else {
							if (!visited[nx][ny] && arr[nx][ny] == 9) {
								qx.add(nx);
								qy.add(ny);
								visited[nx][ny] = true;
							}
						}
					}
				}
			}
			int nx = x + dx[index];
			int ny = y + dy[index];
			if (nx < 0 || ny < 0 || nx >= H || ny >= W) {
				index++;
			} else {
				x = nx;
				y = ny;
			}

		}

		int count = 0;
		int last=0;

		while (true) {
			
			// 0근처 1들을 모두 2로 만든
			boolean finish = true;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (arr[i][j] == 1) {
						for (int k = 0; k < 4; k++) {
							int nx = i + dx[k];
							int ny = j + dy[k];
							if (nx < 0 || ny < 0 || nx >= H || ny >= W) {
								continue;
							} else {
								if (arr[nx][ny] == 0) {
									arr[i][j] = 2;
									finish = false;
									break;
								}
							}
						}
					}
				}
			}

			// 2로 만든게 없다면 끝.
			if (finish) {
				break;
			}

			// 2-> 다 0 으로 만든다.
			last=0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (arr[i][j] == 2) {
						arr[i][j] = 0;
						last++;
						// 만약에 2 근처에 9 가 있으면 9에서 DFS해서 다 0 으로 만든다.
						for (int k = 0; k < 4; k++) {
							int nx = i + dx[k];
							int ny = j + dy[k];
							if (nx < 0 || ny < 0 || nx >= H || ny >= W) {
								continue;
							} else {
								if (arr[nx][ny] == 9) {
									// DFS
									boolean visited[][] = new boolean[H][W];
									Queue<Integer> qx = new LinkedList<Integer>();
									Queue<Integer> qy = new LinkedList<Integer>();
									qx.add(nx);
									qy.add(ny);
									visited[nx][ny] = true;

									while (!qx.isEmpty()) {
										int tx = qx.poll();
										int ty = qy.poll();
										arr[tx][ty] = 0;
										for (int t = 0; t < 4; t++) {
											int ttx = tx + dx[t];
											int tty = ty + dy[t];
											if (ttx < 0 || tty < 0 || ttx >= H || tty >= W) {
												continue;
											} else {
												if (arr[ttx][tty] == 9 && !visited[ttx][tty]) {
													qx.add(ttx);
													qy.add(tty);
													visited[ttx][tty] = true;
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
			count++;
		}

		System.out.println(count);
		System.out.println(last);
		for (int a[] : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}

}
