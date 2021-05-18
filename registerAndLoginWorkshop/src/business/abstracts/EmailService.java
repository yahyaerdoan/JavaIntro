package business.abstracts;

public interface EmailService {
	
	public String sendMail(String email);

	public boolean verify(String email, String confirmCode);
}