package oopIntroWork;

public class KodlamaIoCourse {

	public KodlamaIoCourse(int Id, String Name, String Teacher, String Description, 
			String Ornek, String Ornek2, String kocasınSoyismi) {
		this.Id = Id;
		this.Name = Name;
		this.Teacher = Teacher;
		this.Description = Description;
		this.Ornek = Ornek;
		this.Ornek2 = Ornek2;
		this.kocasınSoyismi = kocasınSoyismi;
		
		
		//üst kısım connstructor yapsı
	}

	//field alanı nesnenin özelliklerini veriyor.
	public KodlamaIoCourse() {
		
	}
	
	int Id;
	String Name;
	String Teacher;
	String Description;
	String Ornek;
	String Ornek2;
	String kocasınSoyismi;
	

}
