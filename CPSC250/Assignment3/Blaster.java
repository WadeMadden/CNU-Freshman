package Assignment3;

//class that creates blaster objects with certain strengths
public class Blaster extends Weapon {
	// constructor takes in a strength int and sets the strength of the blaster
	// to that int
	public Blaster(int strength) {
		super(strength);
	}

	// overrides the super equals method to check if two blasters are equal
	@Override
	public boolean equals(Object other) {
		if (other instanceof Blaster) {
			Blaster otherBlaster = (Blaster) other;
			return super.equals(otherBlaster);
		}
		return false;
	}
}
