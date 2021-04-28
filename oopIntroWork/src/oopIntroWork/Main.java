package oopIntroWork;

public class Main {

	public static void main(String[] args) {

		// Kurs tanýmlandý

		KodlamaIoCourse ccourse = new KodlamaIoCourse();
		ccourse.Id = 1;
		ccourse.Name = "C# & Angular";
		ccourse.Teacher = "Yahya Erdoðan";
		ccourse.Description = "Nitelikli yazlým geliþtirici yetiþtirme programý";

		KodlamaIoCourse jcourse = new KodlamaIoCourse(2, "Java & React", "Engin Demiroð", "Nitelikli yazlým geliþtirici yetiþtirme programý" );
		
		/*
		jcourse.Id = 2;
		jcourse.Name = "Java & React";
		jcourse.Teacher = "Engin Demiroð";
		jcourse.Description = "Nitelikli yazlým geliþtirici yetiþtirme programý";
		 */
		
		// Ýþ sýnýfý kodlarý yazýldý

		KodlamaIoManager ioManager = new KodlamaIoManager();
		ioManager.Add(ccourse);
		ioManager.Add(jcourse);

		System.out.println("---------------");

		ioManager.List(ccourse);
		ioManager.List(jcourse);

		System.out.println("                    ");

		System.out.println("----Diziye ekleyip yazdýrdým----Kod Tekrarýnýn önüne geçildi--");

		// Nesne dizi halinde oluþturuldu ve özellikleri yazdýruldý.

		KodlamaIoCourse[] kodlamaIoCourse = { ccourse, jcourse };
		for (KodlamaIoCourse course : kodlamaIoCourse) {
			System.out.println(course.Name);
		}

		System.out.println("-----------------");

		// Ýþ sýnýfý kodlarý süs olsun diye tekrar edildi
		KodlamaIoManager iocManager = new KodlamaIoManager();
		iocManager.Add(ccourse);
		iocManager.Add(jcourse);

		System.out.println("---------------");

		iocManager.List(ccourse);
		iocManager.List(jcourse);

	}

}
