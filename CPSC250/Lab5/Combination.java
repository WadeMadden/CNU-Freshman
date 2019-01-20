package Lab5;

import Lab5.Combination;

//class that creates combinations and contains methods to help combinations
public class Combination {
	private int[] array;

	// constructor that creates new combo with three int parameters
	public Combination(int combo1, int combo2, int combo3) {
		this.array = new int[3];
		array[0] = combo1;
		array[1] = combo2;
		array[2] = combo3;
	}

	// accesses combo numbers
	public int[] getNumbers() {
		return this.array;
	}

	// checks that the numbers are within the range
	public boolean isWithinRange(int upperLimit) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0 && array[i] <= upperLimit) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	// overrides super equals to check if two combos are equal
	@Override
	public boolean equals(Object other) {
		if (other instanceof Combination) {
			Combination otherCombo = (Combination) other;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == otherCombo.getNumbers()[i]) {
					continue;
				} else {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
