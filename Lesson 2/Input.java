import java.util.Scanner;

public class Input {
	public static void main(String[] args){
		
			Scanner userInput = new Scanner(System.in);
			System.out.print("What is your first name: ");
			String firstName = userInput.nextLine();
			System.out.print("What is your favorite fruit: ");
			String fruit = userInput.nextLine();
			System.out.println("\nHello " + firstName + "," + " " + "your favorite fruit is" + " " + fruit + ". How are you doing?");
			System.out.print("What is your age: ");
			int age =  userInput.nextInt();
			System.out.println("I see " + firstName +". You are " + age + " years old.");
	}
}