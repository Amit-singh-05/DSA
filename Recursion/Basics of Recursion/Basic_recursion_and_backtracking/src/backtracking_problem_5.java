
//Problem 5 => Print number from n to 1
import java.util.Scanner;

public class backtracking_problem_5 {

	
	public static void PrintNumberFrom1ton(int count,int n){
		
		if(count > n) {
			return;
		}
		
		System.out.println(count+"**");
		PrintNumberFrom1ton(count+1,n);
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter Up to which number you want to print number ");
		int n = sc.nextInt();
		int count  = 1;
		PrintNumberFrom1ton(count,n); 
	}

}
