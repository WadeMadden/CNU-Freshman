package Assignment3;

//class creates a Jedi member with a name and saber. Also sets their force level
public class Jedi extends Resistance implements Force {
	private Lightsaber saber;
	private int force;

	// constructor that sets the name and saber. Sets force to a default 10
	public Jedi(String name, Lightsaber saber) {
		super(name);
		setForce(10);
		this.saber = saber;
	}

	// allows force to be set if greater than 0
	public void setForce(int force) {
		if (force > 0) {
			this.force = force;
		}
	}

	// accesses the force of a jedi
	public int getForce() {
		return force;
	}

	// accesses the lightsaber of a jedi
	public Lightsaber getLightsaber() {
		return saber;
	}

	@Override
	// overrides the equals super class. Two jedi are equal if their forces are
	// equal, if their sabers are equal and if the super equals return true
	public boolean equals(Object other) {
		if (other instanceof Jedi) {
			Jedi otherJedi = (Jedi) other;
			if (force == otherJedi.getForce()) {
				if (this.saber.equals(otherJedi.getLightsaber())) {
					if (super.equals(otherJedi)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public int compareTo(Force otherJedi) {
		int diff = force - otherJedi.getForce();

		return diff;
	}
}
