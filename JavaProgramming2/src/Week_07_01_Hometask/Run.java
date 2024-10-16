package Week_07_01_Hometask;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Student[] s = new Student[3];
		
		s[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80, 1, "경영학과");
		s[2] = new Student("강동원", 23, 167.0, 45, 4, "정보통신공학과");
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]/*.toString*/);
		}
		
		System.out.println("---------------------------------------------------");
		
		Employee[] e = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			e[count] = new Employee(name, age, height, weight, salary, dept);
			
			if(count == e.length) {
				System.out.println("최대 입력가능한 횟수는 10회 입니다.");
				break;
			}
			System.out.print("계속 추가하시겠습니까?(y/n) : ");
			char yesOrNo = sc.nextLine().charAt(0);
			
			count ++;
			
			if(yesOrNo == 'n' || yesOrNo == 'N' ) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
