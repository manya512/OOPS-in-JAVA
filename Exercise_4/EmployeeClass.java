package exercise4;

class Employee{
	String empName;
	int empId;
	String address;
	String mailId;
	long mobileNumber;
	
	void displaySalary(float basicPay) {
		float DA = 0.40f * basicPay;
		float HRA = 0.10f * basicPay;
		float PF = 0.20f * basicPay;
		float staffClubFund = 0.005f * basicPay;

		float grossSalary = basicPay + DA + HRA;
		float netSalary = grossSalary - PF - staffClubFund;

		System.out.println("\n----- PAY SLIP -----");
		System.out.println("Name: " + empName);
		System.out.println("Employee ID: " + empId);
		System.out.println("Address: " + address);
		System.out.println("Mail ID: " + mailId);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("DA: " + DA);
		System.out.println("HRA: " + HRA);
		System.out.println("PF: " + PF);
		System.out.println("Staff Club Fund: " + staffClubFund);
		System.out.println("Gross Salary: " + grossSalary);
		System.out.println("Net Salary: " + netSalary);
	}
}

class Programmer extends Employee{
	float basicPay=50000;
}

class AssistantProfessor extends Employee{
	float basicPay=60000;
}

class AssociateProfessor extends Employee{
	float basicPay=70000;
}

class Professor extends Employee{
	float basicPay=90000;
}
public class EmployeeClass {
	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.empName="Manya";
		p.empId=215;
		p.address="Chennai";
		p.mailId="manya@gmail.com";
		p.mobileNumber=9840796392;
		p.displaySalary(p.basicPay);
		
		AssistantProfessor ap=new AssistantProfessor();
		ap.empName="Loid";
		ap.empId=512;
		ap.address="Japan";
		ap.mailId="loid@gmail.com";
		ap.mobileNumber=9847866392L;
		ap.displaySalary(ap.basicPay);
		
		AssociateProfessor asp=new AssociateProfessor();
		asp.empName="Alya";
		asp.empId=123;
		asp.address="Russia";
		asp.mailId="Alya@gmail.com";
		asp.mobileNumber=9847866512L;
		asp.displaySalary(asp.basicPay);
		
		Professor pr=new Professor();
		pr.empName="Gorou";
		pr.empId=321;
		pr.address="Inazuma";
		pr.mailId="Gorou@gmail.com";
		pr.mobileNumber=9832166512L;
		pr.displaySalary(pr.basicPay);
			
}

}
