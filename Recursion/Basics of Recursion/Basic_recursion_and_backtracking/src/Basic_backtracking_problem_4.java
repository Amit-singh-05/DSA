//Problem 4 => Print number from 1 to n
import java.util.Scanner;

public class Basic_backtracking_problem_4 {

	
	public static void PrintNumberFrom1ton(int count,int n){
		
		if(count < 1) {
			return;
		}
		System.out.println(count+"**");
		PrintNumberFrom1ton(count-1,n);
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter Up to which number you want to print number ");
		int n = sc.nextInt();
		int count  = n;
		PrintNumberFrom1ton(count,n); 
	}

}
