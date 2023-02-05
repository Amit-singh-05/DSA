//Problem 6 => Print sum of first n numbers

//Solution 1

//import java.util.Scanner;
//
//public class Problem_6 {
//	public static int PrintSumOfFirstnNumbers(int n) {
//		if(n==1) {
//			return 1;
//		}else {
//			return n+PrintSumOfFirstnNumbers(n-1);
//		}
//		
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("please enter the number up to which you want the sum");
//		int n = sc.nextInt();
//		
//		System.out.println(PrintSumOfFirstnNumbers(n)); 
//
//	}
//
//}

//Solution 2

import java.util.Scanner;

public class Problem_6 {
	public static int PrintSumOfFirstnNumbers(int n) {
		if(n==0) {
			return 0;
		}else {
			return n+PrintSumOfFirstnNumbers(n-1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number up to which you want the sum");
		int n = sc.nextInt();
		
		System.out.println(PrintSumOfFirstnNumbers(n)); 

	}

}
