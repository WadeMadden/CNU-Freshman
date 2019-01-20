package Assignment3;

//creates a pilot that has a name and assigns an xwing to them
public class Pilot extends Trooper {
	private XWing xwing;

	// sets the name and xwing to a pilot
	public Pilot(String name, XWing xwing) {
		super(name);
		this.xwing = xwing;
	}

	// accesses to the xwing of a pilot
	public XWing getXWing() {
		return xwing;
	}

	// overrides super equals. Two pilots are equal if their xwing are equal and
	// if the super equals returns true
	public boolean equals(Object other) {
		if (other instanceof Pilot) {
			Pilot otherPilot = (Pilot) other;
			if (this.xwing.equals(otherPilot.getXWing())) {
				if (super.equals(otherPilot)) {
					return true;
				}
			}
		}
		return false;
	}
}
