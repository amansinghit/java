package CustomerManagementSystem;
import java.time.LocalDate;

public class Customer {
private int id;
public Customer(String email, String password) {
	super();
	this.email = email;
	Password = password;
}
private String fname;
private String lname;
public Customer(int id, String email) {
	super();
	this.id = id;
	this.email = email;
}
private String email;
private String Password;
private Double registrationAmount;
private LocalDate dob;
private ServicePlan plan;
public Customer(int id, String fname, String lname, String email, Double registrationAmount, LocalDate dob,
		ServicePlan plan) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.registrationAmount = registrationAmount;
	this.dob = dob;
	this.plan = plan;
}
	

}
