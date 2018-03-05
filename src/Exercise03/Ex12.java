package Exercise03;

public class Ex12 {

	public static void main(String[] args) {
		String memberLevel = "YOUNG";
		String msg;
		
		switch(memberLevel) {
		case "VIP":
			msg = "VIP 고객 해택 적용";
			break;
		case "NEW":
			msg = "신규 고객 해택 적용";
			break;
		case "YOUNG":
			msg = "청소년 고객 해택 적용";
			break;
			default:
				msg = "등급없음";
		}
		
		System.out.println(msg);

	}

}
