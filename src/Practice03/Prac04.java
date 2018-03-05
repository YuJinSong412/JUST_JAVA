package Practice03;
import java.util.*;

public class Prac04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연소득을 입력하세요: ");
		int A_Income = scanner.nextInt();
		
		System.out.print("신용등급을 입력하세요: ");
		String C_Rating = scanner.next();
		
		System.out.print("신규.기존 고객 여부를 입력하세요:");
		String Customers = scanner.next();
		
		if(Customers.equals("기존")&&((A_Income>5000)||(C_Rating.equals("A")||(C_Rating.equals("B"))))) {
			System.out.println("발급 가능합니다!");
		}
		else
			System.out.println("발급이 가능하지 않습니다!");

	}

}
