package overriding;

public class BaseKrediManager {

	public double hesapla(double tutar) {
		return tutar * 1.18;
		
	}
}

//final s�zc��� metodun override edilmesinin �n�ne ge�er ve override i�lemi olmaz.
//public final double �eklinde kullan�r�z.
//override nesnel y�nelimli programlaman�n �nemli k�sm�d�r.