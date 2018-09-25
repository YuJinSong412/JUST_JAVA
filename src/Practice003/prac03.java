package Practice003;
import java.util.*;

public class prac03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String N_money="10000";
		int money = Integer.parseInt(N_money);
		while(money>0) {
			System.out.print("사용할 금액을 입력하세요: ");
			String use = scanner.next();
			int useMoney = Integer.parseInt(use);
			
			money -= useMoney;
			if(money<=0) {
				System.out.println("잔액이 부족해 교통 카드를 사용할 수 없습니다!!");
				break;
			}
		}

	}

}
