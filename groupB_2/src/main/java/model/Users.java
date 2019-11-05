package model;

public class Users {
	private String userid;
	private String name;
	private String password;
	private String contactno;
	private String emailid;
	private String gender;
	
	
	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getContactno() {
		return contactno;
	}


	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Users() {
		super();
	}


	public Users(String userid, String name, String password, String contactno, String emailid, String gender) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.contactno = contactno;
		this.emailid = emailid;
		this.gender = gender;
	}

	
}
