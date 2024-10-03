package assignment6;

class A {
	 public static void print() {
	     System.out.println("Parent");
	 }
	}

	class B extends A {
	 public static void print() {
	     System.out.println("Child");
	 }
	}

	public class StaticMethodTest {

	 public static void main(String[] args) {
	     A aObj = new A();
	     aObj.print();
	     B bObj = new B();
	     bObj.print(); 

	     A obj = new B();
	     obj.print(); 

	     A.print();
	     B.print();
	 }
	}