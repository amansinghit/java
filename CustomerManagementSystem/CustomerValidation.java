package CustomerManagementSystem;

import java.time.LocalDate;
import java.util.List;

public class CustomerValidation {

//	LocalDate manuDate = LocalDate.parse(date);

	public static Customer Validation(int id, String fname, String lname, String email, Double registrationAmount,
			String dob, String plan, List<Customer> list) throws CustomerException {
		
		
		Customer c1 = new Customer(id, email);
		if (list.contains(c1)) {
			throw new CustomerException("Customer is already exist");
		}
		LocalDate Pdob=CustomerUtils.parseDAte(dob);
		ServicePlan Pplan= CustomerUtils.parseplan(plan);
		return new Customer(id,fname,lname,email,registrationAmount,Pdob, Pplan);
	}
public static void CheakLoginDetails(String email,String password,List<Customer>list) throws CustomerException  {
	Customer temp=new Customer(email,password);
	if(list.contains(temp)) {
		throw new CustomerException("You are not valid user");
	}
	System.out.println("you are logged in");
}
	
	
}
