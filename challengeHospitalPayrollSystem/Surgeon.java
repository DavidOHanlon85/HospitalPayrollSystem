/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * This is the Surgeon class
 */
public class Surgeon extends Employee implements AdministerDrugs {
	
	// Instance Variables
	
	private String specialistArea;
	private double consultationFee;

	/**
	 * Default constructor
	 */
	public Surgeon() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baserate
	 * @param specialistArea
	 * @param consultationFee
	 */
	public Surgeon(String firstName, String lastName, double baserate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baserate);
		this.setSpecialistArea(specialistArea);
		this.setConsultationFee(consultationFee);
		} 
	
	// Getters and Setters

	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	
	// Methods

	@Override
	public boolean adminControlledDrug() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminNonControlledDrug() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println(getBaserate() * hours + consultationFee);
	}
	
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("SpecArea   : " + specialistArea);
		System.out.println("ConsultFee : " + consultationFee);
	}

}
