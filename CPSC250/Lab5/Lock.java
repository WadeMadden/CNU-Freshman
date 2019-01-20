package Lab5;

import Lab5.Combination;
import Lab5.InvalidLockCombinationException;

//class that creates a lock with a combo and will open or close the lock
public class Lock {
	protected Combination combo;
	private int upperLimit;
	private boolean openClosed;

	// constructor that creates a lock with a limit and combo
	public Lock(int upperLimit, Combination combo) {
		this.openClosed = true;
		if (combo.isWithinRange(upperLimit)) {
			this.combo = combo;
			this.upperLimit = upperLimit;
		} else {
			throw new InvalidLockCombinationException();
		}
	}

	// returns the dial upper limit
	public int getDialLimit() {
		return upperLimit;
	}

	// opens the lock if the combo given equals the combo of the lock
	public boolean open(Combination combo) {
		int[] newCombo = combo.getNumbers();
		int[] lockUnlock = this.combo.getNumbers();
		if (openClosed) {
			return openClosed;
		}
		for (int i = 0; i < lockUnlock.length; i++) {
			if (newCombo[i] == lockUnlock[i]) {
				if (i == lockUnlock.length - 1) {
					return this.openClosed = true;
				}
				continue;
			} else {
				break;
			}
		}
		return this.openClosed = false;
	}

	// closes the lock
	public boolean close() {
		return this.openClosed = false;
	}

	// checks if the lock is open
	public boolean isOpen() {
		boolean ans = openClosed;
		return ans;
	}

}
