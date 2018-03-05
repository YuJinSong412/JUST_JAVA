package Practice03;
import java.util.*;

public class Prac05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String orange ="1000";
		String banana = "2000";
		String apple = "3000";

		int total=0;
		while(true) {
			System.out.print("상품 금액을 입력하여라:");
			String choose = scanner.nextLine();
			if(choose.equals("q")) {
				System.out.println(total);
				break;
			}
			
			if(choose.equals(banana))
				total += 2000;
			else if(choose.equals(apple))
				total +=3000;
			else if(choose.equals(orange))
				total += 1000;
			else
				System.out.println("물건이 없습니다.");
				
		}
	}

}
