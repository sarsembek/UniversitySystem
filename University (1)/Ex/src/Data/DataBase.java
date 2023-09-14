package Data;
import java.util.Vector;

import model.User;

public class DataBase {
	private static DataBase instance;

	private static final Vector<User> allUsers = new Vector<>();
	private final static String path = "C:\\Users\\lival\\Desktop\\2 курс\\ООП\\Project\\AllUsers.txt\\";

	public static DataBase getDataBase() {
		if(instance == null) {
			instance = new DataBase();
		}
		return instance;
	}

	public void addToAllUs(User u) {
		allUsers.add(u);
	}

	public Vector<User> getVector() {
		return allUsers;
	}

	public void showVector() {
		for(User u: allUsers) {
			System.out.println(u.toString());
		}
	}

	public static String getPathUsers() {
		return path;
	}


}
