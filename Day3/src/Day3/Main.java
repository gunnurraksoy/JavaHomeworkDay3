package Day3;

public class Main {

	public static void main(String[] args) {
		
		Student student= new Student(1,"Günnur", "Aksoy", "g@gmail.com", "12345", 2);
		Instructor ınstructor= new Instructor(1,"Engin","Demiroğ","e@gmail.com","123456",20000,"Java");
		UserManager userManager = new UserManager();
		userManager.add(ınstructor);
		userManager.delete(student);
		userManager.login(ınstructor);
		userManager.register(student);
		
		InstructorManager ınstructorManager= new InstructorManager();
		ınstructorManager.login(ınstructor);
		ınstructorManager.List(ınstructor);
		
		StudentManager studentManager= new StudentManager();
		studentManager.login(student);
		studentManager.Comment(student);
		
	}

}
