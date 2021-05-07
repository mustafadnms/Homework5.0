package business.abstracts;

import java.util.List;

import entities.abstracts.Entity;

public interface UserService {
	
	void register(Entity user);
	void verifyUser(Entity user);
	void login(Entity user, String email, String password);
	List<Entity> getAll();

}
