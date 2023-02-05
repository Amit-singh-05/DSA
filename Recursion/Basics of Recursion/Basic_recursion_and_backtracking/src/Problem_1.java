//Problem 1 => print your name n times 

//**solution 1**************************


//import java.util.Scanner;
//
//public class Problem_1 {
//	static int count  = 0;
//	public static void PrintYourNamenTimes(int n) {
//		if(count == n) {
//			return;
//		}
//		System.out.println("Amit");
//		count++;
//		PrintYourNamenTimes(n);
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter value how many times you want to print your name ");
//		int n = sc.nextInt();
//		
//		PrintYourNamenTimes(n); 
//	}
//
//}

////**solution 2**************************
//
//
//import java.util.Scanner;
//
//public class Problem_1 {
//	public static void PrintYourNamenTimes(int n) {
//		if(n<=0) {
//			return;
//		}
//		System.out.println("Amit");
//		n--;
//		PrintYourNamenTimes(n);
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter value how many times you want to print your name ");
//		int n = sc.nextInt();
//		
//		PrintYourNamenTimes(n); 
//	}
//
//}

//**solution 3**************************


import java.util.Scanner;

public class Problem_1 {

	public static void PrintYourNamenTimes(int count,int n) {
		if(count == n) {
			return;
		}
		System.out.println("Amit");
		PrintYourNamenTimes(count+1,n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value how many times you want to print your name ");
		int n = sc.nextInt();
	    int count  = 0;
		PrintYourNamenTimes(count,n); 
	}

}