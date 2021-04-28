package oopIntroWork;

public class Main {

	public static void main(String[] args) {

		// Kurs tan�mland�

		KodlamaIoCourse ccourse = new KodlamaIoCourse();
		ccourse.Id = 1;
		ccourse.Name = "C# & Angular";
		ccourse.Teacher = "Yahya Erdo�an";
		ccourse.Description = "Nitelikli yazl�m geli�tirici yeti�tirme program�";

		KodlamaIoCourse jcourse = new KodlamaIoCourse();
		jcourse.Id = 2;
		jcourse.Name = "Java & React";
		jcourse.Teacher = "Engin Demiro�";
		jcourse.Description = "Nitelikli yazl�m geli�tirici yeti�tirme program�";

		// �� s�n�f� kodlar� yaz�ld�

		KodlamaIoManager ioManager = new KodlamaIoManager();
		ioManager.Add(ccourse);
		ioManager.Add(jcourse);

		System.out.println("---------------");

		ioManager.List(ccourse);
		ioManager.List(jcourse);

		System.out.println("                    ");

		System.out.println("----Diziye ekleyip yazd�rd�m----Kod Tekrar�n�n �n�ne ge�ildi--");

		// Nesne dizi halinde olu�turuldu ve �zellikleri yazd�ruld�.

		KodlamaIoCourse[] kodlamaIoCourse = { ccourse, jcourse };
		for (KodlamaIoCourse course : kodlamaIoCourse) {
			System.out.println(course.Name);
		}

		System.out.println("-----------------");

		// �� s�n�f� kodlar� s�s olsun diye tekrar edildi
		KodlamaIoManager iocManager = new KodlamaIoManager();
		iocManager.Add(ccourse);
		iocManager.Add(jcourse);

		System.out.println("---------------");

		iocManager.List(ccourse);
		iocManager.List(jcourse);

	}

}
