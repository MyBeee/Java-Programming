package Week_11_01;

public class A_2 {
	static class B {}
	
	B field1 = new B();
	
	static B field2 = new B();
	
	A_2() {
		B b = new B();
	}
	
	void method1() {
		B b = new B();
	}
	
	static void method2() {
		B b = new B();
	}
}
