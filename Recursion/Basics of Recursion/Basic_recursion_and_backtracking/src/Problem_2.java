//Problem 2 => Print number from 1 to n
import java.util.Scanner;

public class Problem_2 {
	static int count  = 1;
	public static void PrintNumberFrom1ton(int n){
		if(count == n) {
			System.out.println(count);
			return;
		}
		System.out.println(count);
		count++;
		PrintNumberFrom1ton(n);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter Up to which number you want to print number ");
		int n = sc.nextInt();
		
		PrintNumberFrom1ton(n); 
	}
}
