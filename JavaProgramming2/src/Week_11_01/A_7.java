package Week_11_01;

public class A_7 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void mthod() {
			field2 = 10;
			method2();
		}
	}
}
