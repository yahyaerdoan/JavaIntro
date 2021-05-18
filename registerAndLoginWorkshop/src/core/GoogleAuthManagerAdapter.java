package core;

import google.GoogleAuthenticationManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService{

	@Override
	public void login(String email) {
		GoogleAuthenticationManager googleAuthManager = new GoogleAuthenticationManager();
		googleAuthManager.login(email);
		
	}

}
