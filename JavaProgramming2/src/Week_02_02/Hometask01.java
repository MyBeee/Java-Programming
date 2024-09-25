package Week_02_02;

public class Hometask01 {

	public static void main(String[] args) {
		// X^2-9X+14=0의 해를 구하고 구한 후에 멈추는 코드 작성
		int result = 0;
		int x;
		for(x = 0; x<=100; x++) {
			result = x*x - 9 * x + 14;
			
			if(result == 0) {
				break;
			}
		}
		System.out.println("X^2-9X+14의 해가 0이 되기 위한 X의 값은 " + x + "입니다.");
	};
}
