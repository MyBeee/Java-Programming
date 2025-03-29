package Week_04_02;

public class Task05 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	} // 산술 연산을 정확하게 계산하려면 실수 타입을 사용하지 않는 것이 좋음
}
