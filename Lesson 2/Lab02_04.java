import java.util.Scanner;

public class Lab02_04 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		//Ask for numbers
			System.out.print("What is your first number: ");
			double first = userInput.nextDouble();
			System.out.print("What is your second number: ");
			double second = userInput.nextDouble();
			System.out.print("Calculating...\n");
			double quotient = first / second;
			//Display answer
			System.out.println("The answer is " + " " + quotient + "."); 
	}
}