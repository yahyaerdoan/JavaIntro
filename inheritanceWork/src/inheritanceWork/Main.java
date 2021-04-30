package inheritanceWork;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		
		Teacher teacher = new Teacher();
		
		student.firstName ="Yahya";
		teacher.firstName ="Engin";
		
		UserManager manager = new UserManager();
		manager.add(teacher);
		manager.list(student);

	}

}
