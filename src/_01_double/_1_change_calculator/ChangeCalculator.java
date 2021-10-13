package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
			String askNickel = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
			int askIntNickel = Integer.parseInt(askNickel);
		// Ask the user how many dimes they have, and convert their answer
			String askDime = JOptionPane.showInputDialog("How many dimes do you have?");
			int askIntDime = Integer.parseInt(askDime);
		// Ask the user how many quarters they have, and convert their answer
			String askQ = JOptionPane.showInputDialog("How many quarters do you have?");
			int askIntQ = Integer.parseInt(askQ);
		// Calculate how much money the user has.  Hint: Use a double variable 
			double total = (askIntNickel * 0.05 + askIntDime * 0.10 + askIntQ * 0.25);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
			JOptionPane.showMessageDialog(null, "$" + total);
	}
}

