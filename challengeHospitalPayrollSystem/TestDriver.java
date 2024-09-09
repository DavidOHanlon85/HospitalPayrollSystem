package challengeHospitalPayrollSystem;

public class TestDriver {

	public static void main(String[] args) {

		Porter p1 = new Porter("John", "Peterson", 25.0, "RVH");
		Pharmacist phar1 = new Pharmacist("Karen", "Kerr", 40, 4, 600);
		Surgeon s1 = new Surgeon("David", "O'Hanlon", 200, "Ortho", 800);
		
		System.out.println("Porter");
		p1.printAll();
		
		System.out.print("Salary     : "); p1.calculateWeeklySalary(32.5);
		
		System.out.println();
		System.out.println("Pharmacist");
		phar1.printAll();
		System.out.print("Salary     : "); phar1.calculateWeeklySalary(32.5);
		System.out.println("Control    : "+ phar1.adminControlledDrug());
		System.out.println("Uncontrol  : "+ phar1.adminNonControlledDrug());
		
		System.out.println();
		System.out.println("Surgeon");
		s1.printAll();
		System.out.print("Salary     : "); s1.calculateWeeklySalary(32.5);
		System.out.println("Control    : "+ s1.adminControlledDrug());
		System.out.println("Uncontrol  : "+ s1.adminNonControlledDrug());
		
	}

}
