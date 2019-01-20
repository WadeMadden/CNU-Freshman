package Lab4;

@SuppressWarnings("rawtypes")
public class Person implements Comparable {
	private String name;

	// Person constructor with name parameter
	public Person(String name) {
		this.name = name;
	}

	// access name
	public String getName() {
		return name;
	}

	// mutator for name
	public void setName(String name) {
		this.name = name;
	}

	// overriden equals method - determines if two Persons are equal
	@Override
	public boolean equals(Object other) {
		if (other instanceof Person) {
			Person otherPerson = (Person) other;
			String personName = otherPerson.getName();
			if (name.equals(personName)) {
				return true;
			}
		}
		return false;
	}

	// Compares to persons alphabetically. returns neg num, 0 or pos num
	// depending on the relation between two persons
	public int compareTo(Object other) {
		int num = 0;
		Person otherPerson = (Person) other;
		if (other instanceof Person) {
			String otherName = otherPerson.getName();
			num = this.name.compareTo(otherName);
			return num;
		}
		return num;
	}
}
