package modeles;

public class User {
	private long userid,phone;
	private String name,surname,email,password;
	public User(long userid, long phone, String name, String surname, String email, String password) {
	
		this.userid = userid;
		this.phone = phone;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", phone=" + phone + ", name=" + name + ", surname=" + surname + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	
}
