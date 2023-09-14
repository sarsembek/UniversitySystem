package Test;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import Controller.AdminController;
//import Controller.UserController;
import Data.DataBase;
import model.Student;
import model.User;

public class Test1 {
	public static void main(String[] args) throws IOException {
		AdminController a = new AdminController();
		DataBase db = new DataBase();
		ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();
		Vector<User> v = db.getVector();
		v = mapper.readValue(new File("target/users.json"),new TypeReference<Vector<User>>() {});
		mapper.writeValue(new File("target/users.json"),v);
//		System.out.println(u.toString());
		db.showVector();
	}

}
