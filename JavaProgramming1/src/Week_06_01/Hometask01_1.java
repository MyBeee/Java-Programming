package Week_06_01;

import java.util.Scanner;

public class Hometask01_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1(일) ~ 5(오)까지 번호를 골라 해당되는 벌칙을 수행하세요.\n");
		System.out.print("몇 번을 고르시겠습니까? ");
		String num = scanner.next();
		
		switch(num) {
			case "1", "일" -> {
				System.out.println("1번에 해당되는 벌칙은 런지 입니다.");
				break;
			}
			case "2", "이" -> {
				System.out.println("2번에 해당되는 벌칙은 PT8번 입니다.");
				break;
			}
			case "3", "삼" -> {
				System.out.println("3번에 해당되는 벌칙은 스쿼트 입니다.");
				break;
			}
			case "4", "사" -> {
				System.out.println("4번에 해당되는 벌칙은 팔벌려뛰기 입니다.");
				break;
			}
			case "5", "오" -> {
				System.out.println("5번에 해당되는 벌칙은 플랭크 입니다.");
				break;
			}
			default -> {
				System.out.println("해당되는 번호가 아닙니다. 다른 번호를 골라주세요.");
			}
		}
	}
}
