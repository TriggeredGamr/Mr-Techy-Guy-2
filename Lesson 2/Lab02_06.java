import java.util.Scanner;
import java.lang.Math.*;
public class Lab02_06 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		//Set up pi
		double pi = Math.PI;
		//Ask for radius and height
		System.out.print("Enter your radius: ");
		double radius = userInput.nextDouble();
		double radiussquared = radius * radius;
		System.out.print("Enter your height: ");
		double height = userInput.nextDouble();
		//Calculate
		double volume = pi * radiussquared * height;
		//Display answer
		System.out.print("The volume is " + " " + volume);
	}
}