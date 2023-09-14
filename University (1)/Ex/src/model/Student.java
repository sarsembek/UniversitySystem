package model;

import Enums.StudentDegree;

public class Student extends User {
	@JsonIgnore
	private StudentDegree deg;
	private double mark;
	private int rate;
	private static double GPA;
	private int scholarship;

	public Student() {
		super();
	}


	public Student(String fName, String lName, String login, String password, StudentDegree d, int scho) {
		super(fName, lName, login, password);
		this.deg = d;
		this.scholarship = scho;
	}


	public StudentDegree getD() {
		return deg;
	}


	public void setD(StudentDegree d) {
		this.deg = d;
	}


	public double getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}


	public static double getGPA() {
		return GPA;
	}


	public static void setGPA(double gPA) {
		GPA = gPA;
	}


	public int getScholarship() {
		return scholarship;
	}


	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return super.toString();
	}



}
