package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		System.out.println("Kullan�c� eklendi : " + user.getFirstName() + " " + user.getLastName() + " - "
				+ user.getEmail() + " - Do�rulama : " + (user.isVerified() == true ? "Evet" : "Hay�r"));
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		System.out.println("Kullan�c� g�ncellendi : " + user.getFirstName() + " " + user.getLastName() + " - "
				+ user.getEmail() + " - Do�rulama : " + (user.isVerified() == true ? "Evet" : "Hay�r"));
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("Kullan�c� silindi.");
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByMail(email);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
}