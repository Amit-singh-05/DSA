
public class Basic_recursion {
	//C is the variable which will help in making base condition to stop recursive call
	static int c = 0;
	
	public static void printOne() {
		
		//***********Base condition to stop recursion ***************
		if(c==3) {
			return;
		}
		//***********************************************************
		
		System.out.println(1);
		c++;
		
		//*******Method that is responsible for recursive call ******
		printOne();
		//***********************************************************
	}
	public static void main(String[] args) {
		printOne();

	}
	
	//Video link to understand basic recursion in better way (23 minutes)
	//https://www.youtube.com/watch?v=yVdKa8dnKiE&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9

}
