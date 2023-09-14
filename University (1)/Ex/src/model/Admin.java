package model;

public final class Admin {
	private static Admin instance;

	public static Admin getAdmin() {
		if(instance == null) {
			instance = new Admin();
		}
		return instance;
	}

}
