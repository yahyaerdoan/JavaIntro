package oopIntroWork;

public class KodlamaIoCourse {

	public KodlamaIoCourse(int Id, String Name, String Teacher, String Description, 
			String Ornek, String Ornek2, String kocas�nSoyismi) {
		this.Id = Id;
		this.Name = Name;
		this.Teacher = Teacher;
		this.Description = Description;
		this.Ornek = Ornek;
		this.Ornek2 = Ornek2;
		this.kocas�nSoyismi = kocas�nSoyismi;
		
		
		//�st k�s�m connstructor yaps�
	}

	//field alan� nesnenin �zelliklerini veriyor.
	public KodlamaIoCourse() {
		
	}
	
	int Id;
	String Name;
	String Teacher;
	String Description;
	String Ornek;
	String Ornek2;
	String kocas�nSoyismi;
	

}
