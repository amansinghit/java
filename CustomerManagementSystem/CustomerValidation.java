package CustomerManagementSystem;

import java.time.LocalDate;
import java.util.List;

public class CustomerValidation {

//	LocalDate manuDate = LocalDate.parse(date);

	public static Customer Validation(int id, String fname, String lname, String email, Double registrationAmount,
			String dob, String plan, List<Customer> list,String Password) throws CustomerException {

		Customer c1 = new Customer(id, email);
		if (list.contains(c1)) {
			throw new CustomerException("Customer is already exist");
		}
		LocalDate Pdob = CustomerUtils.parseDAte(dob);
		ServicePlan Pplan = CustomerUtils.parseplan(plan);
		return new Customer(id, fname, lname, email, registrationAmount, Pdob, Pplan,Password);
	}

	public static Customer CheakLoginDetails(String email, String password, List<Customer> list) throws CustomerException {
		Customer temp = new Customer(email, password);
		int index=list.indexOf(temp);
		System.out.println(index);
		if (index==-1) {
			throw new CustomerException("You are not valid user");
		}
		
		if (list.get(index).getPassword().equals(temp.getPassword())) {
		
		System.out.println("you are logged in");
		return list.get(index);
		}
		System.out.println("Password entered is wrong....");
return null;		
	}

}