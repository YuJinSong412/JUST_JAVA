package Practice003;
import java.util.*;

public class prac04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("연소득을 입력하세요: ");
		int year = scanner.nextInt();
		
		System.out.print("신용 등급을 입력하세요: ");
		String grade = scanner.next();
		
		System.out.print("신규,기존 고객 중 입력하세요: ");
		String user = scanner.next();
	
		if(year>=5000 ||((grade.equals("B"))||(grade.equals("A")))&& user.equals("기존 고객")) {
			System.out.println("발급이 가능합니다.");
		}
		else {
			System.out.println("발급이 불가능합니다.");
		}
	}

}
