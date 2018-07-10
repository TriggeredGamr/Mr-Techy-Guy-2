import java.util.Scanner;

public class Lab02_CalculatorChallenge {
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Choose the operation (Type the number): Addition(1), Subtraction(2), Multiplication(3), or Division(4): ");
		int operation = userInput.nextInt();
		if (operation <= 4 && operation >= 1) {
		System.out.print("What is your first number: ");
		double firstNumber = userInput.nextDouble();
		System.out.print("What is your second number: ");
		double secondNumber = userInput.nextDouble();
			if (operation == 1) {
				double sum = firstNumber + secondNumber;
				System.out.printf("Your answer is " + "%.4f" , sum);
			} else if (operation == 2) {
				double difference = firstNumber - secondNumber;
				System.out.printf("Your answer is " + "%.4f" , difference);
			} else if (operation == 3) {
				double product = firstNumber * secondNumber;
				System.out.printf("Your answer is " + "%.4f" , product);
			} else if (operation == 4) {
				double quotient = firstNumber / secondNumber;
				System.out.printf("Your answer is " + "%.2f" , quotient);
			}
		}
		else {
		return;
	}
}
}