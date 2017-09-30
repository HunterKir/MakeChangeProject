import java.util.Scanner;
// 100, 50, 20, 10, 5, 1, .25, .10, .05, .01
public class ChangeMachine {
	static int change[] = new int[10];
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price, payment;
		int difference;
		
		System.out.print("Enter the price of your item: ");
		price = kb.nextDouble();
		
		System.out.print("How much money will you give the machine? : ");
		payment = kb.nextDouble();
		
		if (price > payment) {
			System.out.println("That is not enough money!");
		}
		else if (price == payment) {
			System.out.println("You've given the exact amount and don't need any change!");
		}
		else {
			difference = (int)((payment - price) * 100);
			makeChange(difference);
			countChange(difference);
		}
		kb.close();
	}
	
	public static void printMoney(int arrIndex) {
		if (arrIndex == 0)
			System.out.print("\u2503$100\u2503 ");
		else if (arrIndex == 1)
			System.out.print("\u2503$ 50\u2503 ");
		else if (arrIndex == 2)
			System.out.print("\u2503$ 20\u2503 ");
		else if (arrIndex == 3)
			System.out.print("\u2503$ 10\u2503 ");
		else if (arrIndex == 4)
			System.out.print("\u2503$  5\u2503 ");
		else if (arrIndex == 5)
			System.out.print("\u2503$  1\u2503 ");
		else if (arrIndex == 6)
			System.out.print("(25\u00A2) ");
		else if (arrIndex == 7)
			System.out.print("(10\u00A2) ");
		else if (arrIndex == 8)
			System.out.print("(5\u00A2) ");
		else if (arrIndex == 9)
			System.out.print("(1\u00A2) ");
	}
	
	public static void makeChange(int difference) {
		while (difference != 0) {
			if (difference - 10000 >= 0) {
				change[0]++;
				difference -= 10000;
			}
			else if (difference - 5000 >= 0) {
				change[1]++;
				difference -= 5000;
			}
			else if (difference - 2000 >= 0) {
				change[2]++;
				difference -= 2000;
			}
			else if (difference - 1000 >= 0) {
				change[3]++;
				difference -= 1000;
			}
			else if (difference - 500 >= 0) {
				change[4]++;
				difference -= 500;
			}
			else if (difference - 100 >= 0) {
				change[5]++;
				difference -= 100;
			}
			else if (difference - 25 >= 0) {
				change[6]++;
				difference -= 25;
			}
			else if (difference - 10 >= 0) {
				change[7]++;
				difference -= 10;
			}
			else if (difference - 5 >= 0) {
				change[8]++;
				difference -= 5;
			}
			else {
				change[9]++;
				difference--;
			}
		}
	}
	
	public static void countChange(int difference) {
		System.out.println("Your change:\n--------------------");
		for (int i = 0; i < change.length; i++) {
			if (change[i] > 0) {
				do {
					printMoney(i);
					change[i]--;
				} while (change[i] != 0);
				System.out.println();
			}
		}
		System.out.println("--------------------\nTotal change: $" + ((double)(difference)) / 100);
	}
}
