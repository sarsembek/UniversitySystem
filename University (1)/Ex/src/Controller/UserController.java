package Controller;

import java.io.FileOutputStream;

import Data.DataBase;
import model.User;

public class UserController {
	User n;

	public UserController(User u) {
		this.n = u;
	}

	public void verifyLogin(String login, String password) {
		if(n.getLogin().equals(login)&&n.getPassword().equals(password)) {
			n.setLoginStatus(true);
		}
		else {
			System.out.println("Incorrect login or password");
		}
	}

	public void serialize(){
		try(FileOutputStream fs = new FileOutputStream(DataBase.getPathUsers())){

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
