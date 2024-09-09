/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * 
 */
public class Porter extends Employee {
	
	// Instance Variables

	private String site;
	
	// Constructors
	
	/**
	 * Default Constructor
	 */
	public Porter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baserate
	 * @param site
	 */
	public Porter(String firstName, String lastName, double baserate, String site) {
		super(firstName, lastName, baserate);
		this.setSite(site);
	} 
	
	// Getters and Setters
	
	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println(getBaserate() * hours);
	}
	
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Site       : " + site);
	}

}
