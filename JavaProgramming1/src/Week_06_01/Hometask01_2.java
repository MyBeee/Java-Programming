package Week_06_01;

public class Hometask01_2 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		
		System.out.println("1 ~ 5까지 번호를 골라 해당되는 벌칙을 수행하세요. " + num + " 번을 선택하셨습니다!");
		
		switch(num) {
			case 1 -> {
				System.out.println("1번에 해당되는 벌칙은 런지 입니다.");
				break;
			}
			case 2 -> {
				System.out.println("2번에 해당되는 벌칙은 PT8번 입니다.");
				break;
			}
			case 3 -> {
				System.out.println("3번에 해당되는 벌칙은 스쿼트 입니다.");
				break;
			}
			case 4 -> {
				System.out.println("4번에 해당되는 벌칙은 팔벌려뛰기 입니다.");
				break;
			}
			case 5 -> {
				System.out.println("5번에 해당되는 벌칙은 플랭크 입니다.");
				break;
			}
			default -> {
				System.out.println("해당되는 번호가 아닙니다. 다른 번호를 골라주세요.");
			}
		}
	}
}
