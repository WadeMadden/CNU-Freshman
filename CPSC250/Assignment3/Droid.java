package Assignment3;

//creates a resistance member of type Droid
public class Droid extends Resistance {
	// constructor accesses the super constructor to set the name
	public Droid(String name) {
		super(name);
	}

	// Overrides the super equals method to determine if two droids are equal
	@Override
	public boolean equals(Object other) {
		if (other instanceof Droid) {
			return super.equals(other);
		}
		return false;
	}
}
