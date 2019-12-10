package wooa;

import java.util.HashMap;

public class P4 {
	static public boolean[] solution(String[] infos, String[] actions) {
		
		HashMap<String, String> userInfo=new HashMap<String, String>();
		
		for(String info:infos) {
			String infoS[]=info.split(" ");
			userInfo.put(infoS[0], infoS[1]);
		}
		
        boolean[] answer = new boolean[actions.length];
        boolean isLogin=false;
        boolean isAdd=false;
        int index=0;
        
        for(String action:actions) {
        	String actS[]=action.split(" ");
        	if(actS[0].equals("LOGIN")) {
        		//이미 로그인된 경우.
        		if(isLogin) {
        			answer[index++]=false;
        			continue;
        		}
        		
        		//로그인 안된 경우.
        		if((userInfo.get(actS[1])).equals(actS[2])){
        			// 비번 일치.
        			answer[index++]=true;
        			isLogin=true;
        			continue;
        		}else {
        			//비번 틀림.
        			answer[index++]=false;
        			continue;
        		}
        	}
        	
        	if(actS[0].equals("ADD")) {
        		//로그인이 안된 경우.
        		if(!isLogin) {
        			answer[index++]=false;
        			continue;
        		}else {//된 경우에는 추가.
        			isAdd=true;
        			answer[index++]=true;
        			continue;
        		}
        	}
        	
        	//주문.
        	if(actS[0].equals("ORDER")) {
        		//로그인 안된경우.
        		if(!isLogin) {
        			answer[index++]=false;
        			continue;
        		}
        		
        		//장바구니 빔.
        		if(!isAdd) {
        			answer[index++]=false;
        			continue;
        		}
        		
        		//주문.
        		isAdd=false;
        		answer[index++]=true;
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		
	}
}
