package health.person.parameter;

public class BloodPressure {
	
	private int diastolic;
	private int systolic;
	
	
	public BloodPressure (int value1, int value2) {
		systolic = value1;
		diastolic = value2;
							 }
	
	public void setSystolic ( int value) {
		this.systolic = value; 
							    }
	
	public int getSystolic() {
		return systolic;
							 }
	
	public void setDiastolic ( int value) {
		this.diastolic = value; 
							    }
	
	public int getDiastolic() {
		return diastolic;
							 }
	
	public String toString() {
		String st;
		st = " Systolic pressure is: " + Integer.toString(systolic) + ", diastolic pressure is: "+ Integer.toString(diastolic) ;
		return st;
	} 

}
