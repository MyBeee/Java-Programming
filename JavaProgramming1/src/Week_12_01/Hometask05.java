package Week_12_01;

import java.util.Scanner;

public class Hometask05 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("지원자 수: ");
        int numberOfApplicants = scanner.nextInt();

        int[][] scores = new int[numberOfApplicants][4];
        
        double maxAvg = 0, minAvg = 100;
        int max = 0, min = 1000;
        int maxIndex = -1, minIndex = -1;

        for (int i = 0; i < numberOfApplicants; i++) {
            int sum = 0;

            for (int j = 0; j < scores[i].length; j++) {
                String scoreType = "";
                switch (j) {
                    case 0: scoreType = "인성테스트"; break;
                    case 1: scoreType = "코딩테스트"; break;
                    case 2: scoreType = "필기"; break;
                    case 3: scoreType = "실기"; break;
                }

                System.out.printf("%d지원자의 %s 점수를 입력: ", (i + 1), scoreType);
                scores[i][j] = scanner.nextInt();
                sum += scores[i][j];
            }

            double avg = (double) sum / scores[i].length;
            System.out.printf("지원자 %d의 총합: %d\n", i + 1, sum);
            System.out.printf("지원자 %d의 평균: %.2f\n", i + 1, avg);

            if (sum > max) {
                max = sum;
                maxAvg = avg;
                maxIndex = i;
            }
            if (sum < min) {
                min = sum;
                minAvg = avg;
                minIndex = i;
            }
        }
        System.out.printf("최고 점수를 받은 지원자: %d지원자 (총합: %d)(평균: %.2f)\n", maxIndex + 1, max, maxAvg);
        System.out.printf("최소 점수를 받은 지원자: %d지원자 (총합: %d)(평균: %.2f)\n", minIndex + 1, min, minAvg);
	}

}
