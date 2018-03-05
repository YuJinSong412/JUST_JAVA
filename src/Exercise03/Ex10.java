package Exercise03;
import java.util.*;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("##로그인(admin 혹은 임의 아이디)##");
		System.out.print("# 로그인 아이디:");
		String IdName = scanner.nextLine();
		if(IdName.equals("admit")) {
			System.out.println("관리자 로그인!!");
		}
		else {
		System.out.println(IdName+" 로그인!!");
		}
		
		System.out.println("##메뉴를 선택 하세요(1~2) ##");
		System.out.print("#메뉴 선택:");
		String num = scanner.nextLine();
		
		if(num.equals("1") && IdName.equals("admin")) {
			System.out.println("관리자 1번 선택함!!");
		}
		else if(num.equals("2") && IdName.equals("admin")) {
			System.out.println("관리자 2번 선택함!!");
		}
		else if(num.equals("1") && !IdName.equals("admin")) {
			System.out.println(IdName+" 1번 선택함!!");
		}
		else if(num.equals("2") && !IdName.equals("admin")) {
			System.out.println(IdName+" 2번 선택함!!");
		}
	}

}
