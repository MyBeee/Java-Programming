package Week_05_02;

import java.util.Scanner;

public class Hometask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("@@기업의 점수를 입력한 뒤 합격 여부를 확인하세요.");
		
		System.out.print("면접 시험의 결과가 어떻게 되십니까? ");
		int result1 = scanner.nextInt();
		System.out.print("코딩 테스트의 점수가 어떻게 되십니까? ");
		int result2 = scanner.nextInt();
		System.out.print("인성 시험의 결과가 어떻게 되십니까? ");
		int result3 = scanner.nextInt();
		
		if(result1 >= 80) {
			if(result2 >= 80 && result3 >= 80) {
				System.out.println("@@기업에 최종 합격하셨습니다!! 축하드립니다.");
			}
			else if (result2 < 80 && result3 < 80) {
				System.out.println("코딩 테스트 점수와 인성 시험 점수가 미달되어 불합격 되었습니다. 귀하의 미래를 응원합니다.");
			}
			else if(result2 >= 80 && result3 < 80) {
				System.out.println("인성 시험의 점수가 미달되어 불합격 되셨습니다. 귀하의 미래를 응원합니다.");
			}
			else{
				System.out.println("코딩 테스트의 점수가 미달되어 불합격 되셨습니다. 귀하의 미래를 응원합니다.");
			}
		}
		else if(result2 >= 80) {
			if(result1 < 80 && result3 >= 80) {
				System.out.println("면접 시험의 점수가 미달되어 불합격 되셨습니다. 귀하의 미래를 응원합니다.");
			}
			else {
				System.out.println("면접 시험 점수와 인성 시험 점수가 미달되어 불합격 되었습니다. 귀하의 미래를 응원합니다.");
			}
		}
		else if(result3 >= 80 && result1 < 80 && result2 < 80) {
				System.out.println("면접 시험과 코딩 테스트의 점수가 미달되어 불합격 되었습니다. 귀하의 미래를 응원합니다.");
		}
		else {
			System.out.println("불합격 되었습니다. 귀하의 미래를 응원합니다.");
		}
	}
}
