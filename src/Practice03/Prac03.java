package Practice03;
import java.util.*;

public class Prac03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H_money = 10000;
		
		while(true) {
		System.out.print("사용할 금액을 입력하세요: ");
		int U_money = scanner.nextInt();
		
		H_money -= U_money;
		System.out.println(H_money);
		if(H_money>0)
			continue;
		if(H_money<=0) { 
			System.out.println("잔액이 부족해 교통 카드를 사용할 수 없습니다!!");
		}
		break;
		}

	}

}
