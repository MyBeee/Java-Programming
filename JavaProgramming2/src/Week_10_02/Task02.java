package Week_10_02;

public class Task02 {

	public static void main(String[] args) {
		InterfaceCImplements imp1 = new InterfaceCImplements();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
