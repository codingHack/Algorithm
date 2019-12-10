package wooa;

public class P5 {
	
	final static int recipeSize=5;//레시피 크기.
	final static int gochuIndex=4;//고추가 들어있는 인덱스.
	
	static public int[] solution(String[] historys) {
        int[] answer = new int[historys.length];
        
        int recipe[]= {4,50,10,10,4};
        int price[]= {10000,3000,1000,2000,1000};
        int weight[]= {10,100,30,50,10};
        int cur[]= {5,100,10,5,2};
        int index=0;
        
        boolean isGirl=false;//애인이 먹는지
        
        for(String history:historys) {
        	double inbun=0;
        	int sum=0;
        	
        	if(history.equals("1.0")) {
        		inbun=1;
        	}
        	if(history.equals("1.5")) {
        		inbun=1.5;
        		isGirl=true;
        	}
        	if(history.equals("2.0")) {
        		inbun=2;
        	}
        	if(history.equals("2.5")) {
        		inbun=2.5;
        		isGirl=true;
        	}
        	
        	//불가능한 경우에는 -1을 리
        	if(inbun==0) {
	        	int r[]= {-1};
	        	return r;
        	}
        	
        	for(int i=0;i<recipeSize;i++) {
        		//제작시 필요한 양.
        		double need = inbun*(recipe[i]);
        		
        		//애인있다면 고추만 반으로 줄인다.
        		if(i==gochuIndex&&isGirl) {
        			need/=2;
        		}
        		
        		//적다면 구매한다. 
        		if((double)cur[i]<need){
        			sum+=price[i];
        			cur[i]+=weight[i];
        		}
        		
        		//냉장고에서 레시피만큼 제거.
        		cur[i]-=need;
        		
        	}
        	
        	answer[index++]=sum;
        	
        }
        return answer;
    }

	public static void main(String[] args) {
		String []s= {"1.0","2.0","1.5"};
		solution(s);
	}
}
