
package CustomerManagementSystem;
import java.time.LocalDate;

public class Customer {
private int id;
private String fname;
private String lname;
private String email;
private String Password;
private Double registrationAmount;
private LocalDate dob;
private ServicePlan plan;
//////////////////////////
public Customer(String email, String password) {
	super();
	this.email = email;
	Password = password;
}

public Customer(int id, String email) {
	super();
	this.id = id;
	this.email = email;
}

public Customer(int id, String fname, String lname, String email, Double registrationAmount, LocalDate dob,
		ServicePlan plan,String Password) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.registrationAmount = registrationAmount;
	this.dob = dob;
	this.plan = plan;
	this.Password=Password;
}

public String getPassword() {
	return Password;
}
public void setPassword(String s) {
	Password=s;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", Password="
			+ Password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan=" + plan + "]";
}

@Override
public boolean equals(Object o) {
	if(o instanceof Customer) {
		Customer ref=(Customer)o;
		 return this.email.equals(ref.email);
	}
return false;
}

}
