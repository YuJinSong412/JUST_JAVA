package Exercise03;

public class Ex14 {

	public static void main(String[] args) {
		int num=20;
		
		while(num>10) {
			System.out.println(num--);
		}
		boolean flag =true;
		
		while(flag) {
			num--;
			if(num==3) {
				flag = false;
				System.out.println("num=3 종료!!");
			}
		}
	}

}
/*
 	int num=20;
		
		boolean flag = true;
		
		while(flag) {
			System.out.println(num--);
			if(num==10) {
				flag = false;
				System.out.println("num=3 종료!!");
			}
		}
		*/
