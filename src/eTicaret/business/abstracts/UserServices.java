package eTicaret.business.abstracts;

import eTicaret.entities.concretes.User;

public interface UserServices {
	void Register(User user);
	void SignIn(String email,String password);
	
}
