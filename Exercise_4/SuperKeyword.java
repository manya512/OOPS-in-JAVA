package exercise4;

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	void display(){
		System.out.println("Person Name: "+name);
	}
}

class Student extends Person{
	String name;
	
	Student(String name){
		super(name);
		this.name=name;
	}
	
	void displayStudent() {
		System.out.println("Student Name:"+name);
		System.out.println("Parent Name using super.name: "+super.name);
		super.display();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Student s=new Student("Manya");
		s.displayStudent();
	}

}
