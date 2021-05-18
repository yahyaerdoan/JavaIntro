package registerAndLoginWorkshop;

import business.abstracts.AuthService;
import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.abstracts.VerifyService;
import business.concretes.AuthManager;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import business.concretes.VerifyManager;
import core.GoogleAuthManagerAdapter;
import dataAccess.concretes.InMemoryUserDao;
import dataAccess.concretes.InMemoryVerifyDao;
import entities.concretes.User;
import entities.concretes.Verify;

public class Main {

	public static void main(String[] args) {
		
				// yeni kullanýcý
				User user = new User(1, "Yahya", "Erdoðan", "test@test.com", "123456", false);

				// onay kodu mail yolu ile gönderiliyor
				EmailService emailService = new EmailManager();
				String confirmCode = emailService.sendMail(user.getEmail());

				// onay kodu fake veritabanýna ekleniyor
				Verify verify = new Verify(user.getEmail(), confirmCode);
				VerifyService verifyService = new VerifyManager(new InMemoryVerifyDao());
				verifyService.add(verify);

				UserService userService = new UserManager(new InMemoryUserDao());
				AuthService authService = new AuthManager(userService, verifyService, new GoogleAuthManagerAdapter());
				authService.signUp(user); // yeni kullanýcý kayýt oluyor

				// yeni kullanýcý onay kodunu giriyor
				authService.mailConfirmation(user.getEmail(), confirmCode);

				authService.signIn(user); // sisteme giriþ yapýyor
				authService.signOut(user); // sistemden çýkýþ yapýyor

				// google kullanýcýsý
				User googleUser = new User(2, "google", "user", "googleuser@gmail.com", "", false);

				// google hesabý ile sisteme giriþ yapýyor
				authService.signInByGoogle(googleUser);
	}

}
