package Week_02_02;

public class Task10 {

	public static void main(String[] args)
		throws Exception {
			Outter: for(char upper='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + "-" + lower);
					if(lower=='g') {
						break Outter;
					}
				}
			}
			System.out.println("프로그램 실행 종료");
		}
}
