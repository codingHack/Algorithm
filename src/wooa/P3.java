package wooa;

import java.util.Arrays;
import java.util.Comparator;

public class P3 {
	static public int solution(int[] prices, int[] discounts) {
		int answer = 0;
		

		//Integer 배열로 만든 후 내림차순 정
		Integer[] integerPrices=Arrays.stream(prices).boxed().toArray(Integer[]::new);
		Arrays.sort(integerPrices,Comparator.reverseOrder());
		
		Integer[] integerDiscount=Arrays.stream(discounts).boxed().toArray(Integer[]::new);
		Arrays.sort(integerDiscount,Comparator.reverseOrder());
		
		for(int a:integerPrices) {
			System.out.println(a);
		}
		
		for(int i=0;i<integerPrices.length;i++) {
			//할인 받을게 없다면 가격을 그냥 더함.
			if(i>=discounts.length) {
				answer+=integerPrices[i];
				continue;
			}
			
			answer+=(integerPrices[i]*(100-integerDiscount[i])/100);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {

		int p[]= {13000,88000,10000};
		int d[]= {30,20};
		
		System.out.println(solution(p, d));
	}
}
