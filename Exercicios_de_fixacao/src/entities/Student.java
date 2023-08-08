package entities;

public class Student {
	public String Nome;
	public double N1;
	public double N2;
	public double N3;
	
	public double finalGrade() {
		return N1 + N2 + N3;
	}
	
	public String status() {
		if (finalGrade() < 60) {
			return "FAILED \n"
					+ "MISSING " + String.format("%.2f", 60 - finalGrade()) + " POINTS";
		} else {
			return "PASS";
		}
	}
	
	public String toString () {
		return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n" + status();
	}

}
