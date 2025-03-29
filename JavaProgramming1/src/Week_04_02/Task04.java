package Week_04_02;

public class Task04 {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			System.out.println("var1: " + var1);
		} // 127 이상의 값이 되면 오버플로우가 발생되어 최소값인 -128으로 바뀌게된다.
		System.out.println("---------------------------------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		} // -128 이하의 값이 되면 언더플로우가 발생되어 최대값인 127로 바뀌게된다.
	}
}
