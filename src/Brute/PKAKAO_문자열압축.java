package Brute;

public class PKAKAO_문자열압축 {

	static public int solution(String s) {

		int len = s.length();
		
		int min=Integer.MAX_VALUE;
		
		for(int i=1;i<=len/2;i++) {
			
			String compare = "";
			String result = "";
			String sub = "";
			boolean muliti = false;
			int j=0;
			
			for (j = 0; j + i <= s.length(); j += i) { // j = 위치.
				if (compare.equals("")) {
					compare = s.substring(j, j + i);
					result += compare;
				} else {
					sub = s.substring(j, j + i);
					if (sub.equals(compare)) {
						muliti = true;
					} else {
						if (muliti) {
							result += "1";
						}
						result += sub;
						muliti = false;
						compare = sub;
					}
				}
			}		
			if (muliti) {
				result += "1";
			}
			result+=s.substring(j,s.length());
			
			int curLen=result.length();			
			if(min>curLen){
				min=curLen;
			}
			System.out.println(i+" "+min+" "+result);
		}
				


		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solution("abbbccdde");
		solution("abbcdedefggg");

	}

}
