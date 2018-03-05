package Exercise03;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("##메뉴 선택##");
		System.out.println("[1]구매자 [2]판매자");
		System.out.print("##메뉴를 선택 하세요->");
		
		int num = scanner.nextInt();
		if(num==1) {
			System.out.println("환영합니다! 구매자로 로그인하셨습니다.");
		}
		else {
			System.out.println("환영합니다! 판매자로 로그인하셨습니다.");
		}


	}

}
