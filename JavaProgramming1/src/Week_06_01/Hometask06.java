package Week_06_01;

import java.util.Scanner;

public class Hometask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("별자리를 알고싶은 달을 입력해주세요. ");
		int month = scanner.nextInt();
		System.out.print("별자리를 알고싶은 일을 입력해주세요. ");
		int day = scanner.nextInt();
		
		switch (month) {
			case 1:
				if(day <= 19) {
					System.out.printf("%d월 %d일은 염소자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 물병자리입니다.", month, day);
				}
				break;
			case 2:
				if(day <= 18) {
					System.out.printf("%d월 %d일은 물병자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 물고기자리입니다.", month, day);
				}
				break;
			case 3:
				if(day <= 20) {
					System.out.printf("%d월 %d일은 물고기자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 양자리입니다.", month, day);
				}
				break;
			case 4:
				if(day <= 19) {
					System.out.printf("%d월 %d일은 양자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 황소자리입니다.", month, day);
				}
				break;
			case 5:
				if(day <= 20) {
					System.out.printf("%d월 %d일은 황소자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 쌍둥이자리입니다.", month, day);
				}
				break;
			case 6:
				if(day <= 20) {
					System.out.printf("%d월 %d일은 쌍둥이자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 게자리입니다.", month, day);
				}
				break;
			case 7:
				if(day <= 22) {
					System.out.printf("%d월 %d일은 게자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 사자자리입니다.", month, day);
				}
				break;
			case 8:
				if(day <= 22) {
					System.out.printf("%d월 %d일은 사자자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 처녀자리입니다.", month, day);
				}
				break;
			case 9:
				if(day <= 22) {
					System.out.printf("%d월 %d일은 처녀자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 천칭자리입니다.", month, day);
				}
				break;
			case 10:
				if(day <= 22) {
					System.out.printf("%d월 %d일은 천칭자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 전갈자리입니다.", month, day);
				}
				break;
			case 11:
				if(day <= 21) {
					System.out.printf("%d월 %d일은 전갈자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 사수자리입니다.", month, day);
				}
				break;
			case 12:
				if(day <= 21) {
					System.out.printf("%d월 %d일은 사수자리입니다.", month, day);
				}
				else {
					System.out.printf("%d월 %d일은 염소자리입니다.", month, day);
				}
				break;
			default:
				System.out.println("해당되지않는 월/일 입니다.");
		}
	}
}
