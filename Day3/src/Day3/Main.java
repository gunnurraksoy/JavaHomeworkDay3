package Day3;

public class Main {

	public static void main(String[] args) {
		
		Student student= new Student(1,"G�nnur", "Aksoy", "g@gmail.com", "12345", 2);
		Instructor �nstructor= new Instructor(1,"Engin","Demiro�","e@gmail.com","123456",20000,"Java");
		UserManager userManager = new UserManager();
		userManager.add(�nstructor);
		userManager.delete(student);
		userManager.login(�nstructor);
		userManager.register(student);
		
		InstructorManager �nstructorManager= new InstructorManager();
		�nstructorManager.login(�nstructor);
		�nstructorManager.List(�nstructor);
		
		StudentManager studentManager= new StudentManager();
		studentManager.login(student);
		studentManager.Comment(student);
		
	}

}
