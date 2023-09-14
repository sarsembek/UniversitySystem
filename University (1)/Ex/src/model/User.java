package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
public abstract class User implements Comparable<User>, Serializable {
	protected static final long serialVersionUID = 1L;
	private static int id;
	private String fName;
	private String lName;
	private String login;
	private String password;
	@JsonIgnore
	private Date registerDate;
	private boolean loginStatus;

	{
		this.id++;
		this.loginStatus = false;
		this.registerDate = new Date(System.currentTimeMillis());
	}

	public User(String fName, String lName, String login, String password) {
		this.fName = fName;
		this.lName = lName;
		this.login = login;
		this.password = password;
//		this.registerDate = new Date(System.currentTimeMillis());
	}

	public User() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		User.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public boolean isLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fName, lName, login, loginStatus, password, registerDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		User other = (User) obj;
		return Objects.equals(fName, other.fName) && Objects.equals(lName, other.lName)
				&& Objects.equals(login, other.login) && loginStatus == other.loginStatus
				&& Objects.equals(password, other.password) && Objects.equals(registerDate, other.registerDate);
	}

	@Override
	public int compareTo(User u) {
		return this.login.compareTo(u.login);
	}

	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", login=" + login + ", password=" + password
				+ ", registerDate=" + this.registerDate + ", loginStatus=" + loginStatus + ", id=" + id + "]";
	}
}
