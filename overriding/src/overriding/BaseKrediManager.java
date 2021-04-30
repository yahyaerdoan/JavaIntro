package overriding;

public class BaseKrediManager {

	public double hesapla(double tutar) {
		return tutar * 1.18;
		
	}
}

//final sözcüðü metodun override edilmesinin önüne geçer ve override iþlemi olmaz.
//public final double þeklinde kullanýrýz.
//override nesnel yönelimli programlamanýn önemli kýsmýdýr.