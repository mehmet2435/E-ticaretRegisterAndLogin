import eTicaret.business.abstracts.UserServices;
import eTicaret.business.concretes.UserManagers;
import eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserServices accountServices=new UserManagers();
		
		//UserServices service = new UserManagers(new RegisteredUserDao(),new ControlManager(), new UserVerificationManager());
		User user1 = new User("Mehmet", "Bozdemir", "mehmetbozdemir21@gmail.com", "123456");//Normal
		accountServices.Register(user1);
		accountServices.SignIn("mehmetbozdemir21@gmail.com", "123456");//Kullanýcý giriþi baþarýlý!
	}
	

}
