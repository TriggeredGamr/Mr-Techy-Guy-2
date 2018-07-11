import java.util.Scanner;

public class Lab02_02 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		//Ask for numbers
			System.out.print("What is your first number: ");
			int first = userInput.nextInt();
			System.out.print("What is your second number: ");
			int second = userInput.nextInt();
			System.out.print("Calculating...\n");
			int difference = first - second;
			//Display answer
			System.out.println("The answer is " + " " + difference + "."); 
	}
}
		