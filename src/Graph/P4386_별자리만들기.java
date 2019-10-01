package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4386_별자리만들기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		
		double x[]=new double[N];
		double y[]=new double[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			x[i]=Double.parseDouble(st.nextToken());
			y[i]=Double.parseDouble(st.nextToken());
		}
		
		double length[][]=new double[N][N];
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				
				length[i][j]=1;
			}
		}
		
		
	}

}
