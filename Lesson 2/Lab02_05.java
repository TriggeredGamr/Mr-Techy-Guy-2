import java.util.Scanner;

public class Lab02_05 {
	public static void main(String[] args){
			Scanner userInput = new Scanner(System.in);
			final double METRIC_TO_US = 703;
			//Ask for name weight and height
			System.out.print("What is your name: ");
			String name = userInput.nextLine();
			System.out.print("What is your weight (In pounds): ");
			double weight = userInput.nextDouble();
			System.out.print("What is your height (In inches): ");
			double height =  userInput.nextDouble();
			//Calculation
			double heightsquared = height * height;
			double BMI = weight / heightsquared * METRIC_TO_US;
			//Display answer
			System.out.printf(name + "," + " " + "your BMI is " + "%.2f\n", BMI);
	}
}