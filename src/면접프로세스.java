import java.util.Scanner;

public class 면접프로세스 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int y= sc.nextInt();
		
		String tti[] = { "자.", "축.", "인.", "묘.", "진.", "사.", 
				"오.", "미.", "신.", "유.", "술.", "해." };
		String chungan[]= {"갑.","을.","병.","정.","무.","기.","경.","신.","임.","계."};
	
		
		int curChunGan=8;
		int curTti=9;
		
		int ttiL = y%tti.length;
		ttiL+=curTti;
		if(ttiL>=tti.length) {
			ttiL=ttiL%tti.length;
		}
		
		
		System.out.println("띠:"+tti[ttiL]+", 천간:"+chungan[(curChunGan+y)%chungan.length]);

	}

}
