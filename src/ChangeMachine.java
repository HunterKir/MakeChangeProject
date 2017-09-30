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
			differenceInt = (int)(difference * 100);
			System.out.println(differenceInt);
			makeChange(differenceInt);
		}
		
		for (int i = 0; i < change.length; i++) {
			if (change[i] > 0) {
				do {
					printMoney(i);
					change[i]--;
				} while (change[i] != 0);
			}
		}
	}
	public static void printMoney(int arrIndex) {
		if (arrIndex == 0)
			System.out.print("$100 ");
		else if (arrIndex == 1)
			System.out.print("$50 ");
		else if (arrIndex == 2)
			System.out.print("$20 ");
		else if (arrIndex == 3)
			System.out.print("$10 ");
		else if (arrIndex == 4)
			System.out.print("$5 ");
		else if (arrIndex == 5)
			System.out.print("$1 ");
		else if (arrIndex == 6)
			System.out.print(".25c ");
		else if (arrIndex == 7)
			System.out.print(".10c ");
		else if (arrIndex == 8)
			System.out.print(".05c ");
		else if (arrIndex == 9)
			System.out.print(".01c ");
	}
	
	public static void makeChange(int differenceInt) {
		while (differenceInt != 0) {
			if (differenceInt - 10000 >= 0) {
				change[0]++;
				differenceInt -= 10000;
			}
			else if (differenceInt - 5000 >= 0) {
				change[1]++;
				differenceInt -= 5000;
			}
			else if (differenceInt - 2000 >= 0) {
				change[2]++;
				differenceInt -= 2000;
			}
			else if (differenceInt - 1000 >= 0) {
				change[3]++;
				differenceInt -= 1000;
			}
			else if (differenceInt - 500 >= 0) {
				change[4]++;
				differenceInt -= 500;
			}
			else if (differenceInt - 100 >= 0) {
				change[5]++;
				differenceInt -= 100;
			}
			else if (differenceInt - 25 >= 0) {
				change[6]++;
				differenceInt -= 25;
			}
			else if (differenceInt - 10 >= 0) {
				change[7]++;
				differenceInt -= 10;
			}
			else if (differenceInt - 5 >= 0) {
				change[8]++;
				differenceInt -= 5;
			}
			else {
				change[9]++;
				differenceInt--;
			}
				
		}
	}
}
