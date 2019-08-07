package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {

		int view_money;
		int nanugi = 5;
		int switch1 = 1;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		int money = sc.nextInt();
		
		System.out.println( "금액: " + money);
		System.out.println();
		
		
		
		for(int a= 50000; a>=1; a = a/nanugi) {
			
			if(money/a >= 1) {
				view_money = money/a;
				System.out.println(a + "원: " + view_money + "개");
				money = money%a;
			}else {
				System.out.println(a + "원: " + 0 + "개");
			}
			
			
			if(switch1 == 1) {
				switch1 = 2;
				nanugi = 5; 
			}else {
				switch1 = 1;
				nanugi = 2;
			}
			
		}
		
		
		sc.close();
 	}
}