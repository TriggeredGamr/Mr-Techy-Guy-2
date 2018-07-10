import java.util.Scanner;
import java.lang.Math.*;
public class Lab02_07 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		double pi = Math.PI;
		System.out.print("Enter your radius: ");
		double radius = userInput.nextDouble();
		double radiussquared = radius * radius;
		System.out.print("Enter your height: ");
		double height = userInput.nextDouble();
		double surfacearea1 = 2 * pi * radius * height;
		double surfacearea = surfacearea1 + 2 * pi * radiussquared;
		System.out.print("The surface area is " + " " + surfacearea);
	}
}