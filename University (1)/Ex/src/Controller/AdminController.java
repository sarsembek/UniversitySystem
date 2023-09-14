package Controller;
import java.util.Scanner;

import Data.DataBase;
import model.Admin;
//import Enums.StudentDegree;
import model.Student;
import model.User;

public class AdminController {
	Admin instance;
	DataBase db;
	User s;

	public AdminController() {
		this.instance = Admin.getAdmin();
		this.db = DataBase.getDataBase();
	}

//	String fName, String lName, String login, String password
	public void add(String type) {
		if(type == "Student") {
			s = new Student();
//			Student s = new Student();
			Scanner s1 = new Scanner(System.in);
			String d;
			d = s1.nextLine();
			s.setfName(d);
			d = s1.nextLine();
			s.setlName(d);
			d = s1.nextLine();
			s.setLogin(d);
			d = s1.nextLine();
			s.setPassword(d);
			db.getVector().add(s);
			s1.close();
		}

	}
	public void delete(int id) {
		for(User u: db.getVector()) {
			if(u.getId() == id) {
				db.getVector().remove(u);
			}
		}
	}
	public void update(int id,String password) {
		for(User u: db.getVector()) {
			if(u.getId()==id) {
				u.setPassword(password);
			}
		}
	}
}
