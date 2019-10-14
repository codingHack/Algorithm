package Brute;

public class P이자 {
	static public void main(String[] args) {
		double money = 213000;

		boolean dead=false;
		for (int i = 1; i < 2000; i++) {
			money *= 103;
			money /= 100;
			
			dead = (i==1000) ? true:false;
			
			if(dead) {
				System.out.println(String.format("임대건이 뒤졌습니다. 총비용은 %.0f원 입니다.", money));
				break;
			}else {
				
				System.out.println(String.format("%d 달이 지났습니다 이자는 %d 총비용은 %.0f입니다.", i, 3, money));
			}
		}

	}
}
