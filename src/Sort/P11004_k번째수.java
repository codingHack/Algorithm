package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class P11004_k번째수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		if (1 > N || N > 5000000)
			return;
		if (1 > K || K > N)
			return;

		int[] array = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int idx = 0; idx < N; idx++) {
			array[idx] = Integer.parseInt(st.nextToken());
		}

		System.out.println(quickSelect(array, 0, array.length - 1, K - 1));

	}

	public static int quickSelect(final int[] array, int start, int end, int K) { // K는 찾고자하는 수의 인덱스.
		if (start <= end) {
			int pivot = partition(array, start, end);

			if (pivot == K)
				return array[K];
			else if (pivot > K) // K가 피벗보다 작은 값이라면
				return quickSelect(array, start, pivot - 1, K); // 왼쪽 탐색.
			else
				return quickSelect(array, pivot + 1, end, K); // K가 더 크면 오른쪽 탐색.
		}

		return Integer.MIN_VALUE;
	}

	// 퀵 정렬의 partition과 동일한 기능.
	public static int partition(final int[] array, int start, int end) {
		int pivot = start + new Random().nextInt(end - start + 1); // start에서 end까지를 범위로 하는 난수 생성.
		swap(array, end, pivot); // 피벗은 배열의 마지막 원소로 한다.

		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (array[j] < array[end]) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, end);
		return i + 1;

	}

	// final로 선언하면 call by reference 가능.
	public static void swap(final int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}