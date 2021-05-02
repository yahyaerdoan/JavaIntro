package inheritanceWork;

public class UserManager  {
	
	public void add(Teacher teacher) {
		System.out.println(teacher.firstName +" : " + "isimli öðretmen Kaydedildi!");
	}
	public void list(Student student) {
		System.out.println(student.firstName +" : " + "ismli öðrenci Listelendi!");
	}
	
}