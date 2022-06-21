package br.com.jonasmachado;

// Textual Representation how an object will look like in the memory
// Whatever we write in class is in actual the property of object as we are describing the object
// If you want anything which should belong to class make it static!!
class Product{
	
	// Attributes (State)
	//private int pid;
	int pid;
	String name;
	int price;
	
	// Constructor 
	Product(){
		System.out.println(">> Product Object Construted");
	}
	
	// Methods (Behavior)
	// To write data in Product Object we have this Method
	void setProductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		System.out.println(">> Data Written in Product Object");
	}
	
	// To read data from Product Object
	void showProductDetails() {
		System.out.println("---------Product ID: "+pid+"---------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("-------------------------------");
	}
	
	// setter
	void setPid(int pid) {
		this.pid = pid; // this means reference to current object
		// LHS belongs to the Object and RHS belongs to method
	}
	
	// getter
	int getPid() {
		return pid;
	}
	
}

class Mobile extends Product{ // Is a relation, mobile is a product, mobile is child, product is parent
	
	// Additional attributes of Mobile other than the Product
	String os;
	int ram;
	int sdCardSize;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	// we have redefined the same method from the parent into the child with different inputs
	// we have now 2 methods in the child, 1 from parent, and 1 of child
	// both are different as in based inputs (even thought name is same)
	// Method Overloading : Same Method Name with different inputs
	void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdCardSize = sdCardSize;
		System.out.println(">> Data Written in Product Object");
	}
	
	// Let's redefine showProductDetails as well
	// But here we have same inputs
	// 2 methods, 1 from parent, 1 in child and we have same signatures
	// child methods will be executed and not the parent method
	
	// Method OVERRIDING : SAme Method Name with same inputs in Parent Child Relationship
	void showProductDetails(){
		System.out.println("---------Product ID: "+pid+"---------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("Os:\t"+os);
		System.out.println("Ram:\t"+ram);
		System.out.println("SD:\t"+sdCardSize);
		System.out.println("-------------------------------");
	}
	
}


public class inheritanceApp {

	// main is executed by JVM when my program will run!!
	public static void main(String[] args) {

		/*
		// Create an Object : Product
		Product product1 = new Product();
		// product1 is not an object its a reference variable which holds the hashCode of the object in hexadecimal notation
		// System.out.println("product1 is: "+product1); // we get 515f550a as a hashCode, so product is a reference variable not an object
		
		// writing data in Object
		product1.setProductDetails(001, "uPhoneX", 7000);
		
		// reading data from Object
		product1.showProductDetails();
		
		System.out.println();
		
		// let's write the data directly
		Product product2 = new Product();
		//product2.pid = 002; // error now since attribute marked as private cannot be accessed!!
		product2.setPid(002);
		product2.name = "uPCX";
		product2.price = 12000;
		product2.showProductDetails();
		*/
		
		
		// Requesting to get Mobile Object Constructed 
		Mobile mobile = new Mobile();
		// Product Object gets constructed before the Mobile Object. >> Rule to Inheritance (Object to Object)
		
		//mobile.setProductDetails(003, "uLEDTV", 8000);
		//mobile.showProductDetails();
		
		mobile.setProductDetails(003, "uLEDTV", 8000, "Android", 8, 128);
		mobile.showProductDetails();
		
	}

}
