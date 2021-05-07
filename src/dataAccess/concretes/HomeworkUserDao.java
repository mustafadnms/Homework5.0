package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.abstracts.Entity;
import entities.concretes.User;

public class HomeworkUserDao implements UserDao{

	@Override
	public void add(Entity user) {
		System.out.println("Kullanýcý eklendi: "+ ((User)user).getEmail());
		
	}

	@Override
	public void update(Entity user) {
	
		
	}

	@Override
	public void delete(Entity user) {
		
		
	}

	@Override
	public Entity getUserMail(String email) {

		return null;
	}

	@Override
	public List<Entity> getAll() {
	
		return null;
	}

}
