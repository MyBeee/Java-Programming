package Week_03_01;

public class Hometask09 {

	public static void main(String[] args) {
		double PV = 100000;
		double r = 3.5;
		double n = 2;
		double dan = PV * (1 + r) * n;
		double bouk = PV * (1 + r) * (1 + n);
		
		System.out.println("원금이 " + PV + "이고 이자율이 " + r + "기간이 " + n + "일 때, 단리로 계산하면" + dan + "이 된다.");
		System.out.println("원금이 " + PV + "이고 이자율이 " + r + "기간이 " + n + "일 때, 복리로 계산하면" + bouk + "이 된다.");
	}

}
