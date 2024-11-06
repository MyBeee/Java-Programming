package Week_10_02;

public class Task08 {

	public static void main(String[] args) {
		Imp1Class imp1 = new Imp1Class();
		
		InterfaceA_1 ia = imp1;
		ia.methodA();
		System.out.println();
		
		InterfaceB_1 ib = imp1;
		ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC_1 ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
