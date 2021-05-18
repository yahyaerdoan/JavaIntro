package business.concretes;

import java.util.Random;

import business.abstracts.EmailService;

public class EmailManager implements EmailService{
	
	@Override
	public String sendMail(String email) {
		Random rnd = new Random();
		int confirmCode = rnd.nextInt(999999);
		System.out.println("Hesap onay kodu : " + confirmCode);
		return String.valueOf(confirmCode);
	}

	@Override
	public boolean verify(String email, String confirmCode) {
		return false;
	}
}