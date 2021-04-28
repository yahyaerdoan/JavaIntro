package oopIntroWork;

public class KodlamaIoManager {

	public void Add(KodlamaIoCourse kodlamaIoCourse) {
		System.out.println("Kurs Eklendi : " + kodlamaIoCourse.Name);
	}

	public void List(KodlamaIoCourse kodlamaIoCourse) {
		System.out.println(
				"Kurs Listelendi :" + " " + 
	kodlamaIoCourse.Name + " / " + 
	kodlamaIoCourse.Teacher + " / "+ 
	kodlamaIoCourse.Description);
	}
}
