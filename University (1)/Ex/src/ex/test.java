package ex;
import java.util.Vector;
public class test {

	public static void main(String[] args) {
		Vector<Employee>v = new Vector<>();
		Manager m = new Manager();
		Teacher t = new Teacher();
		v.add(t);
		v.add(m);
	}

}
