package Week_12_01;

public class Hometask04 {

	public static void main(String[] args) {
		int[] scores = {100, 60, 80, 50, 40, 20};
		int sum = 0;
		int max = 0;
		int min = 100;
		
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
			if (max < scores[i]) {
				max = scores[i];
			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}
		double avg = (double) sum / scores.length;
		System.out.println("주어진 배열의 총합: " + sum);
		System.out.println("주어진 배열의 평균값: " + avg);
		System.out.println("주어진 배열의 최고점수: " + max);
		System.out.println("주어진 배열의 최저점수: " + min);
	}

}
