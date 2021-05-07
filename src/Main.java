import business.abstracts.UserService;
import business.concretes.RefManager;
import business.concretes.UserManager;
import entities.abstracts.Entity;
import entities.concretes.GoogleUser;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		Entity user = new User(1, "Ahmet", "Yýlmaz", "ahmet@mail.com", "123456") ;
		Entity googleUser = new GoogleUser("ahmet78@mail.com","123456");
		
		
		
		UserService userManager = new UserManager();
		UserService refManager = new RefManager();
		
		refManager.register(googleUser);
		
		userManager.register(user);
		
		
		userManager.verifyUser(user);
		
		
		refManager.login(googleUser, "ahmet78@mail.com", "123456");
		userManager.login(user, "ahmet@mail.com", "123456");

	}

}
