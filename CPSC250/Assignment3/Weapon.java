package Assignment3;

//creates a weapon and allows for the strength to be change. Compares two weapons to see if they are equal
public abstract class Weapon {
	private int strength;

	// constructor that sets the strength of a weapon
	public Weapon(int strength) {
		this.strength = strength;
	}

	// accesses the strenght of a weapon
	public int getStrength() {
		return strength;
	}

	// adds to the strength of the weapon if the total strength is greater than
	// zero
	public void changeStrength(int change) {
		int tempStrength = this.strength;
		int total = tempStrength + change;
		if (total > 0) {
			this.strength += change;
		}
		if (total < 0) {
			this.strength = 0;
		}
	}

	// overrides the super equals. Two weapons are equal if their strength is
	// the same.
	@Override
	public boolean equals(Object other) {
		if (other instanceof Weapon) {
			Weapon otherWeapon = (Weapon) other;
			if (this.strength == (otherWeapon.getStrength())) {
				return true;
			}
		}
		return false;
	}
}
