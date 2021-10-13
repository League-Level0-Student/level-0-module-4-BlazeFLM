package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String ask = JOptionPane.showInputDialog("What is your test score out of 100, up to the decimal?");
		double askDouble = Double.parseDouble(ask);
		if (askDouble < 60) {
			JOptionPane.showMessageDialog(null, "An F? Step up your game.");
		} else if (askDouble < 70 && askDouble > 59.9) {
			JOptionPane.showMessageDialog(null, "A D? Not much better than an F.");
		} else if (askDouble < 80 && askDouble > 69.9) {
			JOptionPane.showMessageDialog(null, "A C? Wouldn't hold up in most Asian houses.");
		} else if (askDouble < 90 && askDouble > 79.9) {
			JOptionPane.showMessageDialog(null, "A B? You should only have one of these, preferably none.");
		} else if (askDouble < 100.1 && askDouble > 89.9) {
			JOptionPane.showMessageDialog(null, "An A? This is the only grade I accept.");
		}
	}
}
