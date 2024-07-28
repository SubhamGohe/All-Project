package Rig;

import java.security.DomainCombiner;

public class Facyorial__Of_5 {
public void Factorial() {
	int factorial =1;
	int n=5;
	for (int i=1;i<=n;i++) {
		//factorial *=i;
		factorial=i*factorial;
		
		System.out.println(i);
		System.out.println(factorial);
	}
System.out.println(factorial);
}
public static void main(String[] args) {
	Facyorial__Of_5 obj = new Facyorial__Of_5();
	obj.Factorial();
}
}
