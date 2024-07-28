package Rig;

public class B {
 public void factorialMethods() {
	 int factorial=1;
	 int n=4;
	 for(int i=1;i<=n;i++) {
		 factorial =factorial*i;
		// System.out.println( i);
		// System.out.println(factorial);
	 }
	 System.out.println(factorial);
	 
 }
 
 public static void main(String[] args) {
	B obj =new B();
	obj.factorialMethods();
}
}
