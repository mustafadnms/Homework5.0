package dataAccess.abstracts;

import java.util.List;

import entities.abstracts.Entity;

public interface UserDao {
	
	void add(Entity user);
	void update(Entity user);
	void delete(Entity user);
	Entity getUserMail(String email);
	List<Entity> getAll();

}
