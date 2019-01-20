package Assignment3;

//class that creates a lightsaber object with a strength and force level
public class Lightsaber extends Weapon implements Force {
	private int force;

	// constructor that sets the strength and the force of a saber
	public Lightsaber(int strength, int force) {
		super(strength);
		this.force = force;
	}

	// accessor that returns the force level of a saber
	public int getForce() {
		return force;
	}

	@Override
	// overrides super equals. Two sabers are true if their forces are equal and
	// the super equals returns true
	public boolean equals(Object other) {
		if (other instanceof Lightsaber) {
			Lightsaber otherSaber = (Lightsaber) other;
			if (super.equals(otherSaber)) {
				if (force == otherSaber.getForce()) {
					return true;
				}
			}
		}
		return false;
	}

	// overrides comparable to compare the difference of the forces
	@Override
	public int compareTo(Force otherSaber) {
		int diff = force - otherSaber.getForce();
		return diff;
	}

}
