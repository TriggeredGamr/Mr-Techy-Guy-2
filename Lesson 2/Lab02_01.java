import java.util.Scanner;

public class Lab02_01 {
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
			System.out.print("What is your first number: ");
			int first = userInput.nextInt();
			System.out.print("What is your second number: ");
			int second = userInput.nextInt();
			System.out.print("Calculating...\n");
			int sum = first + second;
			System.out.println("The answer is " + " " + sum + "."); 
	}
}