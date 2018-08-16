package StackusingSingleQueue;


public class DriverClass {

	public static void main(String[] args) {
		
		Runner obj = new Runner();
		
		
		obj.push(20);
		obj.push(21);
		obj.push(22);
		obj.push(23);
		obj.push(24);
		obj.push(25);
		obj.push(26);

		obj.pop();
		obj.push(27);
		obj.pop();
		 obj.show();
		System.out.println("\ntop element is:" + obj.top());
		
	}

}
