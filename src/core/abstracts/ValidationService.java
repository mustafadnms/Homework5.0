package core.abstracts;

import entities.abstracts.Entity;

public interface ValidationService {
	
	void sendMail(Entity user);
	void verifyMail(Entity user);

}
