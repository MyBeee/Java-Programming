package Week_11_01;

public class A_6 {
	public void method1(int arg) {
		int var = 1;
		
		class B {
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
			}
		}
		B b = new B();
		b.method2();
	}
}
