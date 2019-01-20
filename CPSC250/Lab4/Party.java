package Lab4;

import java.util.ArrayList;

public class Party {
	private ArrayList<Person> invited;
	private ArrayList<Person> rsvped;

	// Party constructor, initializes invited and rsvped ArrayLists
	public Party() {
		invited = new ArrayList<Person>();
		rsvped = new ArrayList<Person>();
	}

	// adds a deep copy of a person to invited if they havent been added before
	public void addInvited(Person person) {
		Person newPerson = new Person(person.getName());
		if (!invited.contains(newPerson)) {
			invited.add(newPerson);
		}
	}

	// returns a deep copy of the invited list
	public ArrayList<Person> getInvited() {
		Person newPerson;
		ArrayList<Person> unique = new ArrayList<Person>();
		for (int i = 0; i < invited.size(); i++) {
			newPerson = new Person(invited.get(i).getName());
			unique.add(newPerson);
		}
		return unique;
	}

	// adds a deep copy of a person to rsvped if they havent been added before
	public void addRSVP(Person person) {
		Person newPerson = new Person(person.getName());
		if (!rsvped.contains(newPerson) && invited.contains(newPerson)) {
			rsvped.add(newPerson);
		}
	}

	// returns a deep copy of the rsvped list
	public ArrayList<Person> getRSVP() {
		Person newPerson;
		ArrayList<Person> unique = new ArrayList<Person>();
		for (int i = 0; i < rsvped.size(); i++) {
			newPerson = new Person(rsvped.get(i).getName());
			unique.add(newPerson);
		}
		return unique;
	}
}
