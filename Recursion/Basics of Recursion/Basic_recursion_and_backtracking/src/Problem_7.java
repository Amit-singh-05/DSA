//Problem 7 => Print product of first n numbers

//Sollution 1

//import java.util.Scanner;
//
//public class Problem_7 {
//	public static int PrintProductOfFirstnNumbers(int n) {
//		if(n==1) {
//			return 1;
//		}else {
//			return n*PrintProductOfFirstnNumbers(n-1);
//		}
//		
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("please enter the number up to which you want the product");
//		int n = sc.nextInt();
//		
//		System.out.println(PrintProductOfFirstnNumbers(n)); 
//
//	}
//
//}



//Sollution 2

import java.util.Scanner;

public class Problem_7 {
	public static int PrintProductOfFirstnNumbers(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*PrintProductOfFirstnNumbers(n-1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number up to which you want the product");
		int n = sc.nextInt();
		
		System.out.println(PrintProductOfFirstnNumbers(n)); 

	}

}