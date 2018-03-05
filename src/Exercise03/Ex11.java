package Exercise03;
import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("##아이디를 입력하세요: ");
		String Id = scanner.nextLine();
		
		if(Id.equals("hong")) {
		System.out.print("#비밀번호를 입력하세요: ");
		String Pw = scanner.nextLine();
		
		if(Pw.equals("1234")) {
			System.out.println("비밀번호 인증 확인!!-> 로그인 성공");
		}
		else
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else
			System.out.println("아이디가 틀렸습니다!");
	}

}
