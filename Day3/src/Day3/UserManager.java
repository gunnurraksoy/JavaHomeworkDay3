package Day3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("kullanýcý eklendi: "+user.getFirstName());
		
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: "+user.getFirstName());
	}
	
	public void register(User user) {
		System.out.println("Kullanýcý kayýt oldu: "+user.getFirstName());
	}
	
	public void login(User user) {
		System.out.println("Kullanýcý giriþ yaptý: "+user.getFirstName() );
	}

}
