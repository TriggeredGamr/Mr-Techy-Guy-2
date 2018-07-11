import java.util.Scanner;

public class Lab02_03 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		//Ask for number
			System.out.print("What is your first number: ");
			int first = userInput.nextInt();
			System.out.print("What is your second number: ");
			int second = userInput.nextInt();
			System.out.print("Calculating...\n");
			int product = first * second;
			//Display answer
			System.out.println("The answer is " + " " + product + "."); 
	}
}