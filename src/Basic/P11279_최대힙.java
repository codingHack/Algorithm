package Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11279_최대힙 {
	static public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int[2*N + 1];
		int last = 1;

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				if(last==1) {
					bw.write(0+"\n");
					continue;
				}
				bw.write(arr[1]+"\n");
				arr[1]=arr[last-1];
				arr[last-1]=0;
				last--;
				int temp=1;
				while(!(arr[temp]>=arr[2*temp] && arr[temp]>=arr[2*temp+1])) {
					if(arr[2*temp]>arr[2*temp+1]) {
						//swap
						int t=arr[2*temp];
						arr[2*temp]=arr[temp];
						arr[temp]=t;
						temp=temp*2;
					}else {
						//swap
						int t=arr[2*temp+1];
						arr[2*temp+1]=arr[temp];
						arr[temp]=t;
						temp=(temp*2)+1;
					}
				}
			} else {
				arr[last] = num;
				int temp = last;
				int lasst=last;
				while (temp != 1) {
					temp /= 2;
					if (arr[temp] < arr[lasst]) {
						int t = arr[temp];
						arr[temp] = arr[lasst];
						arr[lasst] = t;
					}
					lasst/=2;
				}
				last++;
			}
//			for(int j=1;j<16;j++) {
//				if(j==2 || j==4 || j==8) {
//					System.out.println();
//				}
//				System.out.print(arr[j]+" ");
//			}
		}
		System.out.println();
		bw.flush();
		
	}
}
