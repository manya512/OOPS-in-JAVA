package exercise4;

class Employee {
	 Employee(String name) {
	 System.out.println("Employee : " + name);
	 }
	}
	class Manager extends Employee {
	 Manager() {
	 super("Manya");
	 System.out.println("Manager Created");
	 }
	}
	public class Demo{
	 public static void main(String args[]) {
	 Manager m = new Manager();
	 }
	}

