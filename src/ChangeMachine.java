import java.util.Scanner;
// 100, 50, 20, 10, 5, 1, .25, .10, .05, .01
public class ChangeMachine {
	static int change[] = new int[10];
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price, payment, difference;
		int differenceInt;
		
		System.out.print("Enter the price of your item: ");
		price = kb.nextDouble();
		
		System.out.print("How much money will you give the cashier? : ");
		payment = kb.nextDouble();
		
		if (price > payment) {
			System.out.println("That is not enough money!");
		}
		else if (price == payment) {
			System.out.println("You've given the exact amount and don't need any change!");
		}
		else {
			difference = payment - price;
			differenceInt = (int)difference * 100;
		}
	}
	
	public static void makeChange(int differenceInt) {
		while (differenceInt != 0) {
			if (differenceInt % 10000 == 0) {
				change[0]++;
				break;
			}
			else if (differenceInt % 5000 == 0) {
				change[1]++;
				break;
			}
			else if (differenceInt % 2000 == 0) {
				change[2]++;
				break;
			}
			else if (differenceInt % 1000 == 0) {
				change[3]++;
				break;
			}
			else if (differenceInt % 500 == 0) {
				change[4]++;
				break;
			}
			else if (differenceInt % 100 == 0) {
				change[5]++;
				break;
			}
			else if (differenceInt % 25 == 0) {
				change[6]++;
				break;
			}
			else if (differenceInt % 10 == 0) {
				change[7]++;
				break;
			}
			else if (differenceInt % 5 == 0) {
				change[8]++;
				break;
			}
			else {
				change[9]++;
			}
				
		}
	}
}
