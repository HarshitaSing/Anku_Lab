package LinkedListImpl;

public class DriverClass {

	public static void main(String[] args) {

		LinkedList obj = new LinkedList();
		
		obj.insert(27);
		obj.insert(21);
		obj.insert(15);
		obj.insert(78);
		obj.insert(17);
		obj.insert(55);
		obj.insert(85);

		obj.show();
		obj.count();
		obj.mid();
	}

}
