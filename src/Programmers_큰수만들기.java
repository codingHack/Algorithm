
public class Programmers_큰수만들기 {
	static public String solution(String number, int k) {
		String answer = "";

		while (k != 0) {
			int max = -1;
			int maxIndex = 0;
			for (int j = 0; j < number.length() - k; j++) {
				int num = number.charAt(j) - 48;
				if (num > max) {
					max = num;
					maxIndex = j;
				}
			}
			answer += max;
			k--;
			number = number.substring(maxIndex + 1);
			System.out.println(max + " " + number);
		}

		return answer;
	}

	public static void main(String[] args) {
//		String a = "09";
//		System.out.println((int) a.charAt(0)); //48
//		System.out.println((int) a.charAt(1)); //57
//		System.out.println(solution("1924", 2));
		System.out.println(solution("1231234", 3));
//		solution("1924", 2);
//		solution("1231234", 3);
//		System.out.println(solution("4177252841", 4));
	}

}
