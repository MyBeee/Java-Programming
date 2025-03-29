package Week_12_02;

import Week_12_02.snack_2;

public class Hometask09 {

	public static void main(String[] args) {
		snack_2 eat = new snack_2();
		
		System.out.println("과자 종류 : " + eat.kind);
		System.out.println("과자 이름 : " + eat.name);
		System.out.printf("갯수 : %d개\n", eat.number);
		System.out.printf("가격 : %d원", eat.price);
	}

}

