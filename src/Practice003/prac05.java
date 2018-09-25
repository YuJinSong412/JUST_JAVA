package Practice003;
import java.util.*;

public class prac05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pass = scanner.nextInt();
		
		int encPwd = pass <<2;
		
		System.out.println(encPwd);
	}

}
