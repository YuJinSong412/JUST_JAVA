/*package Practice03;

import java.util.*;

public class Prac07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int s = 1; //가위
		int r = 2; //바위
		int p = 3; //보
		int[] games = { s, p, r, s, p };
		
		if(1<p)
			

		for (int i = 0; i < games.length; i++) {
			System.out.print("가위(1), 바위(2), 보(3) 을 입력하세요: ");
			int enter = scanner.nextInt();

			System.out.println("현재 횟수: " + (i+1));
			
			if(enter==games[i])
				System.out.println("비겼습니다!");
			else if(enter<games[i])
				System.out.println("졌습니다!");
			else if(enter>games[i])
				System.out.println("이겼습니다!");
		}

	}

}
*/
