package Day3;

public class Instructor extends User{
	private int numberOfStudents;
	private String givenCourseName;
	
	
	
	public Instructor(int id, String firstName, String lastName, String email, String password, int numberOfStudents,
			String givenCourseName) {
		super(id, firstName, lastName, email, password);
		this.numberOfStudents = numberOfStudents;
		this.givenCourseName = givenCourseName;
	}



	public int getNumberOfStudents() {
		return numberOfStudents;
	}



	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}



	public String getGivenCourseName() {
		return givenCourseName;
	}



	public void setGivenCourseName(String givenCourseName) {
		this.givenCourseName = givenCourseName;
	}
	
	
	
	

}
