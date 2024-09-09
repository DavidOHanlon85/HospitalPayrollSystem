/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * This is the Employee class
 */
public abstract class Employee {
	
	// Instance Variables
	
	private String firstName;
	private String lastName;
	private double baserate; 
	
	// Constructors
	
	/**
	 * This is the default constructor
	 */
	
	public Employee() {
		
	}
	
	
	
	/**
	 * Constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baserate
	 */
	public Employee(String firstName, String lastName, double baserate) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBaserate(baserate);
	}

	// Getters and Setters
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the baserate
	 */
	public double getBaserate() {
		return baserate;
	}
	/**
	 * @param baserate the baserate to set
	 */
	public void setBaserate(double baserate) {
		this.baserate = baserate;
	}
	
	// Methods
	
	public abstract void calculateWeeklySalary(double hours);
	
	public void printAll() {
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name  : " + lastName);
		System.out.println("Base Rate  : " + baserate);
	}
	
	
	

}
