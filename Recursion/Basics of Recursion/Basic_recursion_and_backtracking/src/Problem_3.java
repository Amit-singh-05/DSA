//Problem 2 => Print number from n to 1
import java.util.Scanner;

public class Problem_3 {
	
	public static void PrintNumberFromnto1(int n){
		if(n == 0) {
			return;
		}
		System.out.println(n);
		n--;
		PrintNumberFromnto1(n);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter From which number till one you want to print ");
		int n = sc.nextInt();
		
		PrintNumberFromnto1(n); 
	}
}
