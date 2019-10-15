package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class P15663_N과M9 {
	static public int N;
	static public int M;
	static public int arr[];
	static public boolean visited[];
	static public LinkedHashMap<String, Integer> m;
	
	static public void dfs(int depth, int v,String s) {
		if(depth==M) {
			m.put(s, 0);
		}else {
			visited[v]=true;
			for(int i=0;i<N;i++) {
				if(!visited[i]) {					
					dfs(depth+1,i,s+" "+arr[i]);
				}
			}
		}
		visited[v]=false;
	}
	static public void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		m=new LinkedHashMap<String, Integer>();
		arr=new int[N];
		visited=new boolean[N];
		String s[]=br.readLine().split(" ");
		for(int i=0;i<s.length;i++) {
			arr[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++) {
			dfs(1,i,""+arr[i]);
		}
		
		for(String a:m.keySet()) {
			System.out.println(a);
		}
	}
}
