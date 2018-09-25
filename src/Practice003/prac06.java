package Practice003;
import java.util.*;

public class prac06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum=0;
		while(true) {
			System.out.print("상품 가격을 입력하세요: ");
			String price = scanner.next();
			if(price.equals("q")) {
				break;
			}
			int c_price = Integer.parseInt(price);
			sum += c_price;
		}
		System.out.println(sum);
	}

}
