package Day3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("kullan�c� eklendi: "+user.getFirstName());
		
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: "+user.getFirstName());
	}
	
	public void register(User user) {
		System.out.println("Kullan�c� kay�t oldu: "+user.getFirstName());
	}
	
	public void login(User user) {
		System.out.println("Kullan�c� giri� yapt�: "+user.getFirstName() );
	}

}
