package core.concretes;

import core.abstracts.ValidationService;
import entities.abstracts.Entity;
import entities.concretes.User;

public class MailValidation implements ValidationService {

	@Override
	public void sendMail(Entity user) {
		System.out.println("Do�rulama email g�nderildi: "+ ((User)user).getEmail());
		
	}

	@Override
	public void verifyMail(Entity user) {
		System.out.println("Kullan�c� onayland� : "+ ((User)user).getFirstName() +" "+ ((User)user).getLastName());
		
	}

}
