package Rig;


import java.util.Scanner;

public class Factorialscannner {
public void m1() {
	
	for(int j=0;j<1;) {
	System.out.println("Enter your Number");
	Scanner scanner=new Scanner(System.in);
	int n =scanner.nextInt();
	//int n=5;
	long factorial =1;
	for (int i=1; i<=n;i++) {
		factorial=i*factorial;
	}
	System.out.println("Your Factorial is " +factorial);
}}
public static void main(String[] args) {
	Factorialscannner obj =new Factorialscannner();
	
	obj.m1();
}
}
