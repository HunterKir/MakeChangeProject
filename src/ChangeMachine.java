import java.util.Scanner;
// 100, 50, 20, 10, 5, 1, .25, .10, .05, .01
public class ChangeMachine {
	static int change[] = new int[10];
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price, payment;
		
		System.out.print("Enter the price of your item: ");
		price = kb.nextDouble();
		
		System.out.print("How much money will you give the cashier? : ");
		payment = kb.nextDouble();
		
		if (price > payment) {
			System.out.println("That is not enough money!");
		}
		if (price == payment) {
			System.out.println("You've given the exact amount and don't need any change!");
		}
	}
	
	public static void makeChange(double payment) {
		
	}

}
