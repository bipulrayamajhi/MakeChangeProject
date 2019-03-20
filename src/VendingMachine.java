import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		prompt the user to ask Item price

		System.out.println("Enter the Item price ");
		double itemPrice = sc.nextDouble();

//		prompt the user to ask the bill value

		System.out.println("What dollar bill you are giving me(your options are 1,5,10,20)");
		double billValue = sc.nextDouble();

//		Displaying  an appropriate message if the customer provided too little money or the exact amount.

		if (billValue < itemPrice) {
			System.out.println("you entered too little amount");
		} else if (billValue == itemPrice) {
			System.out.println("you entered exact amout");
		} else if (billValue > 20.0) {
			System.out.println("please enter less than $20");
		} else {

//		calculate and display the change

			double change = billValue - itemPrice;
			change *= 100;
			int dollar = 0, quater = 0, dime = 0, nickle = 0, pennies = 0;
			
           while (change>=100) {
        	   dollar +=1;
        	   change -=100;
           }
           while (change>=25) {
        	   quater += 1;
        	   change -= 25;
           }
           while (change>=10) {
        	   dime += 1;
        	   change -= 10;
           }
           while (change >= 5) {
        	   nickle += 1;
        	   change -= 5;
           }
           while (change < 5 && change >=1 ) {
        	   pennies +=1;
        	   change -= 1;
           }

			System.out.println("Here is your change money");
			if (dollar != 0) {
				System.out.println(dollar + " dollar");
			}
			if (quater != 0) {
				System.out.println(quater + " quater");
			}
			if (dime != 0) {
				System.out.println(dime + " dime");
			}
			
			if (nickle != 0) {
				System.out.println(nickle + " nickle");
			}
			if (pennies != 0) {
				System.out.println(pennies + " pennies");
			}

		}

		sc.close();
	}

}
