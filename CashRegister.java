
import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double amount;
		double amountPaid;

		System.out.println("What is the amount of item Please ");
		amount = scanner.nextDouble();

		System.out.println("What is the amount paid by customer");
		amountPaid = scanner.nextDouble();

		double change = amountPaid - amount;

		String messageString = getChange(amount, amountPaid);
		System.out.println(messageString);

		// boolean trueofFlase = 0.01 > .009999999999999147;
		// System.out.println(trueofFlase);

		/*
		 * quarters = (change/.25); change = change % .25;
		 * System.out.println((int)quarters + " quarters " + change);
		 *
		 *
		 * quarters = (change/.25); change = change % .25;
		 * System.out.println((int)quarters + " quarters " + change);
		 *
		 *
		 * quarters = (change/.25); change = change % .25;
		 *
		 * System.out.println((int)quarters + " quarters " + change);
		 *
		 *
		 * nickels = change / .05; change = change % .05;
		 *
		 * System.out.println((int)nickels + " nickels " + change);
		 *
		 *
		 * pennies = change / .01; change = change % .01;
		 *
		 * System.out.println((int)(Math.ceil(pennies)) + " pennies " + change);
		 *
		 * //dimes = (change/.10); //change = change % .10;
		 *
		 * //System.out.println(dimes + " dimes" + change);
		 */

	}

	public static String getChange(double amount, double amountPaid) {
		double pennies, oneDollars, nickels, dimes, quarters, tenDollars, twentyDollars, fiveDollars, num;
		String changeString = " ";
		double change = amountPaid - amount;

		if (amountPaid >= amount) {
			twentyDollars = change / 20;
			if (twentyDollars >= 1) {
				change = change % 20;

				changeString += (int) twentyDollars + " Twenty Dollars, ";
			}

			tenDollars = change / 10;
			if (tenDollars >= 1) {
				change = change % 10;
				changeString += (int) tenDollars + " ten dollar bill, ";

			}

			fiveDollars = change / 5;
			if (fiveDollars >= 1) {
				change = change % 5;
				changeString += (int) fiveDollars + " five dollar bill, ";

			}

			oneDollars = change / 1;
			if (oneDollars >= 1) {
				change = change % 1;
				changeString += (int) oneDollars + " one dollar bill, ";

			}

			quarters = change / .25;
			if (quarters >= 1) {
				change = change % .25;
				changeString += (int) quarters + " quaters, ";

			}

			dimes = change / .10;
			if (dimes >= 1) {
				change = change % .10;
				changeString += (int) dimes + " dimes, ";
			}

			nickels = change / .05;
			if (nickels >= 1) {
				change = change % .05;
				changeString += (int) nickels + " nickles, ";

			}

			pennies = change / .01;
			if (pennies >= 0) {
				change = change % .01;
				changeString += (int) Math.ceil(pennies) + " pennies ";
			}
		} else {
			changeString += "Amount Tendered not enough";
		}

		return changeString;

	}

}
