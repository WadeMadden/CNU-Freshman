package Assignment3;

//acts as a super class for all resistance members
public class Resistance extends ResistanceArmy {
	private String name;

	// constructor that sets the name of the member
	public Resistance(String name) {
		this.name = name;
	}

	// accesses the name of the member
	public String getName() {
		return name;
	}

	// overrides equals from object. Determines resistance are equal if they
	// have the same name
	@Override
	public boolean equals(Object other) {
		if (other instanceof Resistance) {
			Resistance otherName = (Resistance) other;
			if (name.equals(otherName.getName())) {
				return true;
			}
		}
		return false;
	}

}
