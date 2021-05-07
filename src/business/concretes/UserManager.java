package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import core.abstracts.ValidationService;
import core.concretes.Controls;
import core.concretes.MailValidation;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HomeworkUserDao;
import entities.abstracts.Entity;
import entities.concretes.User;

public class UserManager implements UserService {
	
	public UserDao userDao = new HomeworkUserDao();
	public Controls controls;
	public ValidationService validationService;

	@Override
	public void register(Entity user) {
		
		if(controls.nameControl(user)==false) {
			System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır.");
		}else if(controls.passwordControl(user)==false) {
			System.out.println("Parola en az 6 karakterden oluşmalıdır.");
		}else if(controls.valMailFormat(user)==false) {
			System.out.println("E-posta alanı e-posta formatında olamalıdır. ");
		}else if(controls.mailControl(user)==false) {
			System.out.println("E-Posta daha önce kullanılmamış olmalıdır.");
		}else {
			System.out.println("Kullanıcı kaydedildi : "+((User) user).getFirstName()+" "+((User) user).getLastName());
			validationService = new MailValidation();
			validationService.sendMail(user);
			userDao.add(user);
		}
		
	}

	@Override
	public void verifyUser(Entity user) {
		
		validationService = new MailValidation();
		validationService.verifyMail(user);
		
	}

	@Override
	public void login(Entity user, String email, String password) {
		
		if (((User)user).getEmail()== email && ((User)user).getPassword()==password) {
			System.out.println("Giriş yapıldı : "+((User)user).getEmail());
		}else {
			System.out.println("Kullanıcı bilgileri hatalı");
		}
		
	}

	@Override
	public List<Entity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
