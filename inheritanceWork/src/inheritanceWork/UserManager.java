package inheritanceWork;

public class UserManager  {
	
	public void add(User user) {
		System.out.println(user.firstName +" : " + "isimli öðretmen Kaydedildi!");
	}
	public void list(User user) {
		System.out.println(user.firstName +" : " + "ismli öðrenci Listelendi!");
	}
	
}