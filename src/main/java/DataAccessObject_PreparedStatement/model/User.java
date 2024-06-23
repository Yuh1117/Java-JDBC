package DataAccessObject_PreparedStatement.model;

public class User {
	private String userName;
	private String passWord;
	private String hoVaTen;

	public User() {

	}

	public User(String userName, String passWord, String hoVaTen) {
		this.userName = userName;
		this.passWord = passWord;
		this.hoVaTen = hoVaTen;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", hoVaTen=" + hoVaTen + "]";
	}

}
