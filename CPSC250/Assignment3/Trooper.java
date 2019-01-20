package Assignment3;

//creates a trooper with a name and blaster. And has accessor and setter methods and the equals method
public class Trooper extends Resistance {
	private Blaster blaster;

	// constructor that sets the name and a default blaster to a trooper
	public Trooper(String name) {
		super(name);
		this.blaster = new Blaster(25);
	}

	// another constructor that does the same and also takes in a blaster
	public Trooper(String name, Blaster blaster) {
		super(name);
		this.blaster = blaster;
	}

	// accesses the blaster of a trooper
	public Blaster getBlaster() {
		return blaster;
	}

	// overrides the super equals. Two troopers are equal if their blasters are
	// equal and if the super equals returns true
	@Override
	public boolean equals(Object other) {
		if (other instanceof Trooper) {
			Trooper otherTrooper = (Trooper) other;
			if (super.equals(otherTrooper)) {
				if (this.blaster.equals(otherTrooper.getBlaster())) {
					return true;
				}
			}
		}
		return false;
	}
}
