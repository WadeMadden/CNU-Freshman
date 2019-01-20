package Assignment5;

public class JosephusList<T> {
	public Node<T> first;
	public Node<T> last;
	public int size;
	// Creates a linked list of objects
	// Contains methods for adding, removing, copying, and rotating said objects
	// runs a game that continuously removes the kth object until one remains
	// returns the final object

	// constructor sets the first and last item of the list to zero
	// sets the size to zero
	public JosephusList() {
		first = null;
		last = null;
		size = 0;
	}

	// method the add objects to the linked list from the back
	public void add(T val) {
		// create a node with the sent parameter
		Node<T> node = new Node<T>(val);
		// sets the node as first and last if the size is zero
		if (size == 0) {
			last = node;
			first = node;
		}
		// if the listed isn't empty create new node that gets last
		// new node is now last and all objects are linked
		else {
			Node<T> tail = last;
			tail.next = node;
			node.next = first;
			last = node;
		}
		// increment size
		size++;
	}

	// method removes objects from the front of the list
	public T remove() {
		// create a copy of first
		Node<T> copy = first;
		// return null is list is empty
		if (size == 0) {
			return null;
		}
		// if list has one item last is null and removes first item
		else if (size == 1) {
			last = null;
			first = first.next;
		}
		// is size is 2 remove first and remove the link
		else if (size == 2) {
			first = first.next;
			first.next = null;
		}
		// handle the links and remove the item
		else {
			last.next = first.next;
			first = first.next;
		}
		// get the first value
		T val = copy.value;
		// decrement size
		size--;
		// return removed item
		return val;
	}

	// method that rotates the list by one
	public void rotate() {
		// makes sure list isn't empty or contains one item
		if (size != 0 && size != 1) {
			last = first;
			first = first.next;
		}
	}

	public JosephusList<T> copy() {
		// create a new list
		JosephusList<T> list = new JosephusList<T>();
		// checks if size is greater than one
		// technically don't need this step because this is taken care of in the
		// run problem method but just to be safe
		if (size >= 1) {
			// loops until i equals the size of the current list
			for (int i = 0; i < this.size; i++) {
				// set val to the removed value from the current list
				// then add to list and original list
				// done so the original list isn't changed
				T val = this.remove();
				list.add(val);
				this.add(val);
			}
			return list;
		}
		return list;
	}

	public T runProblem(int num) {
		// make a copy so the original list isn't altered
		JosephusList<T> copy = new JosephusList<T>();
		copy = copy();
		// check that copy contains values
		if (copy.size == 0) {
			return null;
		}
		// loops until one item remains
		while (copy.size > 1) {
			// rotates to the selected position
			// rotates by amount of links between numbers rather than the num
			// itself thus n-1
			for (int i = 0; i < num - 1; i++) {
				copy.rotate();
			}
			copy.remove();
		}
		// return the remaining value
		T val = copy.first.value;
		return val;
	}
}
