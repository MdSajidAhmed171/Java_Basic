
public class Static_basic {
	
	int count = 0;
	static int check = 5;
	Static_basic(){
		 count++;
	}
	static {
	    System.out.println("Static block");
	}
	public static void main(String[] args) {
		show();
		Static_basic T = new Static_basic();
		T.print();
		System.out.println("Count: " + T.count);
		System.out.println("Check: " + check);
		Outer.hello();
		Outer.Inner.TempShow();
		
		
		Outer.Inner obj = new Outer.Inner();
		obj.show();
		
		A obj2 = new A();
		obj2.show();  // calls A.show()
		
		B obj3 = new B();
		obj3.show();  // calls B.show()
		
		A obj4 = new B();
		obj4.show();  // calls A.show()	
		 
	}
	
	void print() {
		System.out.println("Print Method");
	}

	static void show() {
		// TODO Auto-generated method stub
		System.out.println(false);
		System.out.println("Show Method");
	}
}

class Outer {
	static void hello() {
        System.out.println("Hello");
    }
     static class Inner {
        void show() {
            System.out.println("Static inner class");
        }
        static void TempShow() {
            System.out.println("Static Temp Show");
        }
    }
}

class A {
    static void show() {System.out.println("Class A");}
}

class B extends A {
    static void show() {System.out.println("Class B");} // method hiding
}

