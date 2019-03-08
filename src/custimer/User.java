package custimer;

import java.io.Serializable;

public class User implements Serializable{
private	String firstname;
private	Long phno;
private	Long accno,password;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
public Long getAccno() {
	return accno;
}
public void setAccno(Long accno) {
	this.accno = accno;
}
public Long getPassword() {
	return password;
}
public void setPassword(Long password) {
	this.password = password;
}

}
