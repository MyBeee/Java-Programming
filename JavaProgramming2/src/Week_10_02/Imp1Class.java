package Week_10_02;

public class Imp1Class implements InterfaceC_1 {
	public void methodA() {
		System.out.println("methodA() 실행");
	}
	
	public void methodB() {
		System.out.println("methodB() 실행");
	}
	
	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}
}
