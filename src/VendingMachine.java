import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		prompt the user to ask Item price

		System.out.println("Enter the Item price in pennies");
		int itemPrice = sc.nextInt();

//		prompt the user to ask the bill value

		System.out.println("What dollar bill you are giving me(your options are 1,5,10,20)");
		int billValue = sc.nextInt();

//		Displaying  an appropriate message if the customer provided too little money or the exact amount.

		if (billValue * 100 < itemPrice) {
			System.out.println("you entered too little amoutn");
		} else if (billValue == itemPrice) {
			System.out.println("you entered exact amout");
		}

		else {

//		calculate and display the change

			int change = billValue * 100 - itemPrice;
			int dollar = 0, quater = 0, dime = 0, nickle = 0, pennies = 0;
			while (change >= 100) {
				dollar += 1;
				change = change - 100;
			}
			System.out.println("Here is your change money:");
			System.out.println(dollar + "dollar");

			while (change >= 25) {
				quater += 1;
				change = change - 25;
			}
			System.out.println(quater + "quater");

			while (change >= 10) {

				dime += 1;
				change = change - 10;
			}
			System.out.println(dime + "dimes");

			while (change >= 5) {

				nickle += 1;

				change = change - 5;
			}
			System.out.println(nickle + "nickle");

			while (change < 5 && change > 0) {

				pennies += 1;
				change = change - 1;
			}
			System.out.println(pennies + "pennies");

			System.out.println("Thank you for shopping with us");

		}

		sc.close();
	}

}
