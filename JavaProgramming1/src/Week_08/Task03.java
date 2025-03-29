package Week_08;

public class Task03 {
	public static void main(String[] args) {
		int i=2; 
		
		do {
			int j = 1; // 곱하기 초기값 설정
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			} while (j<=9);
			i++;
			System.out.println();
		} while (i<=9);
	}
}
