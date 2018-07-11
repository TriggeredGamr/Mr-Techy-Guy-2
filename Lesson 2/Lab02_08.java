import java.util.Scanner;

public class Lab02_08 {
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
			double heightsquared = height * height;
			double BMI = weight / heightsquared * METRIC_TO_US;
			//Tell them their BMI
			System.out.printf(name + "," + " " + "your BMI is " + "%.2f\n", BMI);
			//Find and tell them if they are obese underweght normal weight or over weight
		if (BMI < 18.5) {
			System.out.print("You are underweight.");
		} else if (BMI <= 18.5 && BMI >= 24.9) {
			System.out.print("You are normal weight.");
		} else if (BMI <= 25 && BMI >= 29.9) {
			System.out.print("You are over weight.");
		} else {
			System.out.print("You are obese.");
		}
	}
}