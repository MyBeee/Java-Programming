package Week_07_01_package2;

import Week_07_01_package1.A;

public class D extends A {
	public D() {
		super();
	}
	
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	public void method2() {
		//A a = new A(); //x
		//a.field = "value"; //x
		//a.method(); //x
	}
}
