/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * 
 */
public class Pharmacist extends Employee implements AdministerDrugs {
	
	// Instance Variables
	
	private int grade;
	private double bonus;

	/**
	 * Default constructor
	 */
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baserate
	 * @param grade
	 * @param bonus
	 */
	public Pharmacist(String firstName, String lastName, double baserate, int grade, double bonus) {
		super(firstName, lastName, baserate);
		this.setGrade(grade);
		this.setBonus(bonus);
	} 
	
	// Getters and Setters
	
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	// Methods
	
	@Override
	public boolean adminControlledDrug() {
		return true;
	}

	@Override
	public boolean adminNonControlledDrug() {
		return true;
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println(getBaserate() * hours + bonus);
	}
	
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Grade      : " + grade);
		System.out.println("Bonus      : " + bonus);
	}

}
