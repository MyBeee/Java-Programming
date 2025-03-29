package Week_12_02;

import Week_12_02.bread_3;

public class Hometask15 {

	public static void main(String[] args) {
		bread_3 myBread = new bread_3();
		
		System.out.println("빵 종류 : " + myBread.kind);
		System.out.printf("빵 갯수 : %d개\n", myBread.num);
		System.out.println("칼로리 : " + myBread.kcal);
		System.out.printf("가격 : %d원", myBread.price);
	}
}
