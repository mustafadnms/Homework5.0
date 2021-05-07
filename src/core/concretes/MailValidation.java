package core.concretes;

import core.abstracts.ValidationService;
import entities.abstracts.Entity;
import entities.concretes.User;

public class MailValidation implements ValidationService {

	@Override
	public void sendMail(Entity user) {
		System.out.println("Doðrulama email gönderildi: "+ ((User)user).getEmail());
		
	}

	@Override
	public void verifyMail(Entity user) {
		System.out.println("Kullanýcý onaylandý : "+ ((User)user).getFirstName() +" "+ ((User)user).getLastName());
		
	}

}
