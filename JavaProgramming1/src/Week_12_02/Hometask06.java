package Week_12_02;

import Week_12_02.person_2;

public class Hometask06 {

	public static void main(String[] args) {
		person_2 friend = new person_2();
		
		System.out.printf("이름 : %s\n", friend.name);
		System.out.printf("나이 : %d살\n", friend.age);
		System.out.printf("성별 : %s\n", friend.sex);
		System.out.printf("몸무게 : %dkg\n", friend.weight);
		System.out.printf("키 : %dcm", friend.height);
	}

}
