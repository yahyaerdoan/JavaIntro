package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	private List<User> users;

	public InMemoryUserDao() {
		this.users = new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
		this.users.add(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		int result = this.users.indexOf(user);
		this.users.remove(result);
		
	}

	@Override
	public User getById(int id) {		
		return this.getById(id);
	}

	@Override
	public User getByMail(String email) {
		return this.users.stream().filter((user)-> user.getEmail() == email).findFirst().orElse(null);
	}

	@Override
	public List<User> getAll() {		
		return users;
	}

}
