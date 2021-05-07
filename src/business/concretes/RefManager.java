package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import core.abstracts.RefService;
import core.concretes.GoogleRefAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HomeworkUserDao;
import entities.abstracts.Entity;
import entities.concretes.GoogleUser;

public class RefManager implements UserService {
	
	private RefService refService;
	UserDao userDao;

	@Override
	public void register(Entity user) {
		
		refService = new GoogleRefAdapter();
		userDao = new HomeworkUserDao();
		refService.registerRef(((GoogleUser) user).getEmail(), ((GoogleUser)user).getPassword());
		
	}

	@Override
	public void verifyUser(Entity user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(Entity user, String email, String password) {
		
		if (((GoogleUser)user).getEmail()== email && ((GoogleUser)user).getPassword()==password) {
			System.out.println("Giriþ yapýldý : "+((GoogleUser)user).getEmail());
		}else {
			System.out.println("Kullanýcý bilgileri hatalý!");
		}
		
	}

	@Override
	public List<Entity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
