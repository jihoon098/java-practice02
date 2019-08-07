package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		
		String continueGame = "y";
		while(true) {
			int tryNum = 0;
			int minNumber = 1;
			int maxNumber = 100;
			
			Random random =  new Random();
			int correctNumber = random.nextInt(maxNumber) + minNumber ; 
			System.out.println("수를 결정했습니다. 맞추어 보세요.");
			//////////////////////////
			
			while(continueGame == "y") {
				System.out.println(minNumber + "-" + maxNumber);
				++tryNum;
				System.out.print(tryNum + ">>");
				int guessNumber = scanner.nextInt();
				
				if(guessNumber < correctNumber) {
					System.out.println("더 높게");
					minNumber = guessNumber;
				}else if(guessNumber > correctNumber) {
					System.out.println("더 낮게");
					maxNumber = guessNumber;
				}else {//수를 맞췄을 때
					
					System.out.println("맞았습니다.");
					System.out.println("다시 하시겠습니까(y/n)>>");
					String check = scanner.next();
					
					if(check.equals("y")) {
						break;
					}else if(check.equals("n")){
						continueGame = check;
						System.out.println("종료");
						scanner.close();
						return;
					}
				}
				
			}
			
			
			
		}
		
	}

}