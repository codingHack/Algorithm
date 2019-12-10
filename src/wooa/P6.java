package wooa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class P6 {
	static public String[] solution(String[][] forms) {
		
		HashMap<String, String> name=new HashMap<String, String>();//2글자의 이름이 저장될 해쉬
		HashSet<String> email = new HashSet<String>();//이메일을 보낼 사람
		
		for(String []form:forms) {
			
			for(int i=0;i<form[1].length()-1;i++) {	
				//두글자씩 자름.
				String twoName=form[1].substring(i,i+2);
				
				if(name.containsKey(twoName)) {
					//이미 그 글자가 있는경우 value(이메일), 현재 메일을 set에 넣음(중복방지)
					email.add(form[0]);
					email.add(name.get(twoName));
				}else {
					//없는 경우는 새로 생성.
					name.put(twoName,form[0]);
				}
			}
		}
		
		//이메일을 정렬.
		String result[] = email.toArray(new String[email.size()]);
		Arrays.sort(result);
		
        return result;
		
    }

	public static void main(String[] args) {
		String arrs[][]= {{"jm@email.com", "제이엠구"}, {"jason@email.com", "제이슨"},{ "woniee@email.com", "워니"},{ "mj@email.com", "엠제이"}, {"nowm@email.com", "이제엠"}};
		String r[]=solution(arrs);
		
		for(String s:r) {
			System.out.println(s);
		}

	}
}
