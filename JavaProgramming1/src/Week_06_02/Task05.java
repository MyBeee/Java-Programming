package Week_06_02;

public class Task05 {

	public static void main(String[] args) {
		float x;
		int i = 0;
		for(x=0.1f; x<=1.0f; x+=0.1f) {
			i=i+1;
			System.out.println(x+"i="+i);
		}
		System.out.println("for문 나온 X: "+x+"i= "+i);
	}

}
