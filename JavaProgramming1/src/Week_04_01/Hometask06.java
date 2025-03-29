package Week_04_01;

import java.util.Scanner;

public class Hometask06 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     int price1 = 4500;
	     int price2 = 5500;
	     int price3 = 3000;

	     System.out.println("아메리카노: " + price1);
	     System.out.println("에스프레소: " + price3);
	     System.out.println("바닐라 라떼: " + price2);
	     System.out.println("카라멜 마끼아또: " + price2);
	     System.out.println("돌체 라떼: " + price3);
	     
	     System.out.print("몇잔의 아메리카노를 주문하시겠습니까? ");
	     int americano = scanner.nextInt();
	     int americano_price = price1 * americano;
	    
	     System.out.print("몇잔의 에스프로스를 주문하시겠습니까? ");
	     int espresso = scanner.nextInt();
	     int espresso_price = espresso * price3;
	    
	     System.out.print("몇잔의 바닐라 라떼를 주문하시겠습니까? ");
	     int vanilla = scanner.nextInt();
	     int vanilla_price = vanilla * price2;
	    
	     System.out.print("몇잔의 카라멜 마끼아또를 주문하시겠습니까? ");
	     int caramel = scanner.nextInt();
	     int caramel_price = caramel * price2;
	    
	     System.out.print("몇잔의 돌체 라떼를 주문하시겠습니까? ");
	     int latte = scanner.nextInt();
	     int latte_price = latte * price3;
	    
	     int total = americano_price + espresso_price + vanilla_price + caramel_price + latte_price;
	    
	     System.out.print("얼마를 지불하시겠습니까? ");
	     int money = scanner.nextInt();
	    
	     int change = money - total;
	    
	     System.out.printf("거스름돈은 %d원 입니다.", change);
	     
	     /**
	     System.out.print("무엇을 주문하시겠습니까?: ");
	     String order = scanner.next();
	     if ("아메리카노".equals(order)){
	         System.out.printf("금액은 %s 입니다 \n", price1);
	         System.out.print("얼마를 지불하시겠습니까? : ");
	         int total = scanner.nextInt();
	         System.out.printf("거스름돈은 %s 입니다.", (total-price1));
	     } else if ("에스프레소".equals(order)){
	         System.out.printf("금액은 %s 입니다. \n", price3);
	         System.out.print("지불 금액: ");
	         int total = scanner.nextInt();
	         System.out.printf("거스름돈은 %s 입니다", (total-price3));
	     } else if ("바닐라라떼".equals(order)) {
	         System.out.printf("금액은 %s 입니다. \n", price2);
	         System.out.print("지불 금액: ");
	         int total = scanner.nextInt();
	         System.out.printf("거스름돈은 %s 입니다", (total-price2));
	     } else if ("카라멜마끼아또".equals(order)) {
	         System.out.printf("금액은 %s 입니다. \n", price2);
	         System.out.print("지불 금액: ");
	         int total = scanner.nextInt();
	         System.out.printf("거스름돈은 %s 입니다", (total-price2));
	     } else if ("돌체라떼".equals(order)) {
	         System.out.printf("금액은 %s 입니다. \n", price1);
	         System.out.print("지불 금액: ");
	         int total = scanner.nextInt();
	         System.out.printf("거스름돈은 %s 입니다", (total-price1));
	     } else {
	         System.out.println("올바르게 입력 후, 주문해주세요.");
	     }
	     
	     **/
	}
}
