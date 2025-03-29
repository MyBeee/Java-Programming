package Week_04_02;

public class Task07 {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		double p = x % y;
		
		System.out.println(z + 2); // z가 x/y이므로 5/0.0이라 값이 무한대 이므로 Infinity로 표시됨
		System.out.println(p + 2); // p가 x%y이므로 5%0.0이라 값이 나오지 않으므로 NaN(Not a Number)로 표시
		
		if(Double.isInfinite(z) || Double.isNaN(z) || Double.isInfinite(p) || Double.isNaN(p))
		{
			System.out.println("값 산출 불가"); // z와 p 모두 값이 나오지 않으므로 여기에 표현
		} else {
			System.out.println(z + 2);
		}
	}
}