package Practice003;
import java.util.*;

public class prac07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] computer = {1,3,2,3,1};
		
		for(int i=0;i<computer.length;i++) {
			System.out.println("현재 횟수 / 총 횟수 : "+(i+1)+" / "+computer.length);
			System.out.print("가위,바위,보(1,2,3)을 입력해주세요: ");
			int use = scanner.nextInt();
			switch(computer[i]) {
			case 1:
				if(use==1) {
					System.out.println("비겼습니다.");
				}
				else if(use==2) {
					System.out.println("이겼습니다");
				}
				else if(use==3) {
					System.out.println("졌습니다.");
				}
				break;
			case 2:
				if(use==2) {
					System.out.println("비겼습니다.");
				}
				else if(use==3) {
					System.out.println("이겼습니다");
				}
				else if(use==1) {
					System.out.println("졌습니다.");
				}
				break;
			case 3:
				if(use==3) {
					System.out.println("비겼습니다.");
				}
				else if(use==1) {
					System.out.println("이겼습니다");
				}
				else if(use==2) {
					System.out.println("졌습니다.");
				}
				break;
			}
		}
	}
}
