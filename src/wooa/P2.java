package wooa;

public class P2 {
	static public int[] solution(String logs) {
		int[] answer = new int[24];
		String log[] = logs.split("\n"); // 줄 단위로 split

		for (String l : log) {
			// 로그값 길이가 고정이므로 substring 이용 +9
			int num = Integer.parseInt(l.substring(11, 13)) + 9;
			num += (num >= 24) ? -24 : 0;
			answer[num]++;
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1 }, { 2 }, { 3 }, { 4 } };
		String arrs[][] = { { "1" }, { "2" }, { "3" }, { "4" } };
		// solution(new int[5][6]);

	}
}
