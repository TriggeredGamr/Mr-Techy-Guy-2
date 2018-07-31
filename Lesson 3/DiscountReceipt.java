import java.util.Scanner;
public class DiscountReceipt {
public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	Item[] shoppingList = new Item[4];
	for (int i = 0; i < shoppingList.length; i++){
	System.out.print("Enter the name of the item you are buying: ");
    String Object = userInput.nextLine();
	System.out.print("Enter the price of "  + Object + ": ");
    double price = userInput.nextDouble(); userInput.nextLine();
	int ID = 100000 + (int)((Math.random()*999999));
	shoppingList[i] = new Item(Object, price, ID);
	}
	printReceipt(shoppingList);
}
	public static Boolean calcDiscount(double price){
		if (price > 2000){
		return true;
		} else {
		return false;
		}
	}
	public static void printReceipt(Item[] shoppingList){
		double subtotal = 0;
		for (int i = 0; i < shoppingList.length; i++){
		subtotal += shoppingList[i].getPrice();
		}
		System.out.println("=================================================");
		System.out.println("==================R E C E I P T==================");
		System.out.println("=================================================");
		System.out.println(shoppingList[0].toString());
		System.out.println(shoppingList[1].toString());
		System.out.println(shoppingList[2].toString());
		System.out.println(shoppingList[3].toString());
		System.out.println("Subtotal....." + subtotal);
		if (calcDiscount(subtotal)){
			subtotal *= 0.85;
			System.out.println("Discount(15%)..... " + subtotal);
		}
		double tax = subtotal * 0.0725;
		System.out.printf("Tax(7.25%%)..... " + "%.2f\n", tax);
		double total = subtotal + tax;
		System.out.printf("Total..... " + "%.2f\n", total);
		System.out.println("=================================================");
		System.out.println("==================R E C E I P T==================");
		System.out.println("=================================================");
	}
}