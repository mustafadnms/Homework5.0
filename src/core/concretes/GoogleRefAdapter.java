package core.concretes;

import core.abstracts.RefService;
import googleSingUp.GoogleRef;

public class GoogleRefAdapter implements RefService {

	@Override
	public void registerRef(String mail, String password) {
		
		GoogleRef googleRefAdepter = new GoogleRef();
		googleRefAdepter.register(mail, password);
		
	}

	@Override
	public void loginRef(String mail, String password) {
		GoogleRef googleRefAdepter = new GoogleRef();
		googleRefAdepter.login(mail, password);
		
	}

}
