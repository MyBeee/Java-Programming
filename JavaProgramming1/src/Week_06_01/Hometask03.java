package Week_06_01;

import java.util.Scanner;

public class Hometask03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------메 뉴 판--------");
		System.out.println("아메리카노      : 2500원");
		System.out.println("아이스티       : 2500원");
		System.out.println("돌체라떼       : 5000원");
		System.out.println("바닐라라떼      : 5500원");
		System.out.println("카라멜마끼아또   : 6000원");
		System.out.println("자바칩프라푸치노 : 6500원");
		
		System.out.print("아메리카노는 1번, 아이스티는 2번, 돌체라떼는 3번, 바닐라라떼는 4번, 카라멜마끼아또는 5번, 자바칩프라푸치노는 6번 중에 원하는 메뉴를 선택해주세요. ");
		int menu = scanner.nextInt();
		
		switch (menu) {
		case 1:
			System.out.print("아메리카노 몇 잔을 주문하시겠습니까? ");
			int result1 = scanner.nextInt();
			int price1 = result1 * 2500;
			System.out.printf("아메리카노를 %d잔 주문하면 총 %d원 지불하셔야됩니다.", result1, price1);
			break;
		case 2: 
			System.out.print("아이스티 몇 잔을 주문하시겠습니까? ");
			int result2 = scanner.nextInt();
			int price2 = result2 * 2500;
			System.out.printf("아이스티를 %d잔 주문하면 총 %d원 지불하셔야됩니다.", result2, price2);
			break;
		case 3: 
			System.out.print("돌체라떼 몇 잔을 주문하시겠습니까? ");
			int result3 = scanner.nextInt();
			int price3 = result3 * 5000;
			System.out.printf("돌체라떼를 %d잔 주문하면 총 %d원 지불하셔야됩니다.", result3, price3);
			break;
		case 4: 
			System.out.print("바닐라라떼 몇 잔을 주문하시겠습니까? ");
			int result4 = scanner.nextInt();
			int price4 = result4 * 5500;
			System.out.printf("바닐라라떼를 %d잔 주문하면 총 %d원 지불하셔야됩니다.", result4, price4);
			break;
		case 5: 
			System.out.print("카라멜마끼아또 몇 잔을 주문하시겠습니까? ");
			int result5 = scanner.nextInt();
			int price5 = result5 * 6000;
			System.out.printf("카라멜마끼아또를 %d잔 주문하면 총 %d원 지불하셔야됩니다.", result5, price5);
			break;
		case 6: 
			System.out.print("자바칩프라푸치노 몇 잔을 주문하시겠습니까? ");
			int result6 = scanner.nextInt();
			int price6 = result6 * 6500;
			System.out.printf("자바칩프라푸치노를 %d잔 주문하면 총 %d원 지불하셔야됩니다.", result6, price6);
			break;
		default:
			System.out.printf("%d번은 해당되지 않는 메뉴입니다.", menu);
		}
	}
}
