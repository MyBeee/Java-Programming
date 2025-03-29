package Week_12_02;

import Week_12_02.house_2;

public class Hometask08 {

	public static void main(String[] args) {
		house_2 myHouse = new house_2();
		
		System.out.println("집 종류 : " + myHouse.kind);
		System.out.println("방 갯수 : " + myHouse.room);
		System.out.println("화장실 수 : " + myHouse.washroom);
		System.out.println("마당 유무 : " + myHouse.field);
	}

}
