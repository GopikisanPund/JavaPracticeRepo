package SimpleJavaProgram;

import java.security.PublicKey;

public class Operator {

	public static void main(String[] args) {

		// variable declarization
		int a = 100, b = 200;

		// Arithmatic opearator
		System.out.println("Addition : " + (a + b));
		System.out.println("Substaction : " + (b - a));
		System.out.println("Multiplication : " + (a * b));
		System.out.println("divide : " + (b / a));
		System.out.println("module Remider  : " + (b / a));

		// Unary Operator
		System.out.println("PostIncrements : " + (a++));
		System.out.println(a);
		System.out.println("PreIncrements " + (++a));
		System.out.println("Postdecremets : " + (a--));
		System.out.println(a);
		System.out.println(--b);

		//unary operator
		int c = 10, d = 20;
		System.out.println(c += 30);
		System.out.println(c -= 10);
		System.out.println(d *= 20);
		System.out.println(d /= 10);
		System.out.println(d / 10);
		
		//comparison Operator
		int x = 100, y = 100;
		System.out.println(x >= y);
		System.out.println(x <= y);
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x == y);
		System.out.println(x = y);
		
		
		//logical Operator
		
		int p = 50 ,q = 70,r = 40;
		System.out.println(p < q && p <  q);
		System.out.println(p < q || p <  r);
		System.out.println(p&q);
		System.out.println(p!=q);
		
		System.out.println("Gopikisan");
		
	     
		
		
	}

}
