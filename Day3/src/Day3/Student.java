package Day3;

public class Student extends User{
	private int numberOfCourse ;

	public Student(int id, String firstName, String lastName, String email, String password, int  numberOfCourse) {
		super(id, firstName, lastName, email, password);
		this.numberOfCourse = numberOfCourse;
	}

	public int getNumberOfCourse() {
		return numberOfCourse;
	}

	public void setNumberOfCourse(int numberOfCourse) {
		this.numberOfCourse = numberOfCourse;
	}
	
	
	

}
