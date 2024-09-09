/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * Interface regarding who is allowed to Administer Drugs
 */
public interface AdministerDrugs {
	
	public boolean adminControlledDrug();
	
	public boolean adminNonControlledDrug();

}
