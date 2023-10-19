package CustomerManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> cust = new ArrayList<>();
			System.out.println("1. Sign up (customer registration)\r\n" + "2. Sign in (login)\r\n"
					+ "i/p : email n password\r\n" + "3. Change password\r\n"
					+ "i/p : email n old password n new password\r\n" + "4. Un subscribe customer\r\n"
					+ "i/p : customer email\r\n" + "\r\n" + "5. Display all customers.\r\n" + "0. Exit \r\n" + "");

			boolean exit = true;
			while (exit) {
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter your details");
						Customer c1 = CustomerValidation.Validation(sc.nextInt(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), cust,sc.next());

						cust.add(c1);
						System.out.println("Customer Succssfully added");
						break;
					case 2:
						System.out.println("Enter your mail and password");
						CustomerValidation.CheakLoginDetails(sc.next(),sc.next(),cust);
						break;
					case 3:
						System.out.println("Enter your mail and password");
						Customer c2=CustomerValidation.CheakLoginDetails(sc.next(),sc.next(),cust);
						System.out.println("Enter new password : ");
						c2.setPassword(sc.next());
						break;
					case 4:System.out.println("Enter your mail and password");
						Customer c3=CustomerValidation.CheakLoginDetails(sc.next(),sc.next(),cust);
					      cust.remove(c3);     
					      System.out.println("Customer Removed");
						break;
					case 5:
						for(Customer c:cust) {
							System.out.println(c);
						}
						break;
					case 6:exit=false;
						break;

					}
				}
					catch (Exception e) {
						e.printStackTrace();
						sc.nextLine();
						}
				 
			}
                 
				
				}
			
				
		}
		
	}	
	

