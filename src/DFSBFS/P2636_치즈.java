package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2636_치즈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		int arr[][]=new int[H][W];
		
		for(int i=0;i<W;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<H;j++) {
				String s = st.nextToken();
				//if(s.equals(anObject))
				
			}
		}
		/*
		 입력 받는데 0 을 -1로 다 입력받음
		 
		 맨 외곽 부분에서BFS를 돌려서 -1을 0으로 만듬
		 
		for
		 치즈를 탐색하면서 주변에 0 이 있다면 2(c)	로 표시함.
		 
		 시간을 증가시키고 c를 모두 0 으로 바꿈 만약c 근처에 -1이 있다면
		 
		 그지점에서 BFS 를 돌려서 모두 0으로 만듬
		 
		 
		 
		 
		 
		 
		 */
	}

}
