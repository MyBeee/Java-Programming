package Week_12_02;

import Week_12_02.pet_2;

public class Hometask07 {

	public static void main(String[] args) {
		pet_2 myPet = new pet_2();
		
		System.out.printf("종 : %s\n", myPet.animal);
		System.out.printf("이름 : %s\n", myPet.name);
		System.out.printf("나이 : %d살\n", myPet.age);
		System.out.printf("몸무게 : %dkg\n", myPet.weight);
		System.out.printf("키 : %dcm", myPet.height);
	}

}
