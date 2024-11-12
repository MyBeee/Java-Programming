package Week_11_01;

public class A_8 {
	String field = "A-field";
	
	void method() {
		System.out.println("A-method");
	}
	
	class B {
		String field = "B-field";
		
		void method() {
			System.out.println("B-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A_8.this.field);
			A_8.this.method();
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
}
