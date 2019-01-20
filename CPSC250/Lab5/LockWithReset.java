package Lab5;

import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

//allows a user to reset the combo of a lock. checks for exceptions
public class LockWithReset extends Lock {
	// creates a lock with a limit and combo
	public LockWithReset(int upperLimit, Combination combo) {
		super(upperLimit, combo);
	}

	// helper method to check if user input is an integer
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// asks a user to input a new combo for the lock and throws exception if
	// values are illegal
	public int[] resetNaive() {
		String primCombo = JOptionPane.showInputDialog("Type a new combination");
		// checks if cancel button is pressed
		if (primCombo != null) {
			// separates all values inputed
			String[] values = primCombo.split(" ");
			int[] iValues = new int[values.length];
			for (int i = 0; i < iValues.length; i++) {
				if (isInteger(values[i])) {
					iValues[i] = Integer.parseInt(values[i].trim());
				} else {
					throw new NoSuchElementException();
				}
			}
			if (iValues.length < 3) {
				throw new NoSuchElementException();
			}
			for (int i = 0; i < iValues.length; i++) {
				if (iValues[i] <= getDialLimit()) {
					continue;
				} else {
					throw new InvalidLockCombinationException();
				}
			}
			combo = new Combination(iValues[0], iValues[1], iValues[2]);
		}
		return combo.getNumbers();
	}

	// handles thrown exceptions and loops until values inputed are legal
	public void resetRetry() {
		boolean value = true;
		while (value) {
			try {
				resetNaive();
				value = false;
			} catch (NoSuchElementException e) {
				JOptionPane.showMessageDialog(null, "Type 3 integers separated by spaces");
			} catch (InvalidLockCombinationException e) {
				JOptionPane.showMessageDialog(null, "Type 3 integers in the range [0.." + getDialLimit() + "]");
			}
		}
	}

	// main method to help with testing
	public static void main(String[] args) {
		Combination c = new Combination(1, 2, 3);
		LockWithReset lock = new LockWithReset(5, c);
		lock.resetRetry();
	}
}
