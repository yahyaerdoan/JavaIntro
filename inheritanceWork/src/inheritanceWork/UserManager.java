package inheritanceWork;

public class UserManager  {
	
	public void add(User user) {
		System.out.println(user.firstName +" : " + "isimli ��retmen Kaydedildi!");
	}
	public void list(User user) {
		System.out.println(user.firstName +" : " + "ismli ��renci Listelendi!");
	}
	
}