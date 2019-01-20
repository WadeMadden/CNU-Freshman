package Assignment3;

import java.util.ArrayList;

//ResistanceArmy creates an arraylist of droids, troopers, pilots, and Jedi 
//with blasters, xwings, and lightsabers
public class ResistanceArmy {
	private ArrayList<Resistance> resistance;

	// constructor creates a new resistance arraylist
	public ResistanceArmy() {
		resistance = new ArrayList<Resistance>();
	}

	// adds a member to the resistance
	public void addSoldier(Resistance member) {
		resistance.add(member);
	}

	// accesses the resistance arraylist
	public ArrayList<Resistance> getArmy() {
		return resistance;
	}
}
