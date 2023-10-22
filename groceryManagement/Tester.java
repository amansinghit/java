package groceryManagement;

import static groceryManagement.GroceryUtils.addGrocery;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
public class Tester {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)) {
		List< Grocery> list=new ArrayList<>();//list of Grocery
		System.out.println("Enter our choice");
		System.out.println("1..Add a new Grocery item\n"+"2..Update quantity of Grocery item\n"+
		"3..Display the list of grocery"+"4..remove all empty stock items"+
				"5..display product which stcok updated in last 3 month"+"6..exit");
		Grocery g1=null;
		boolean exit=true;
		while(exit) {
		try {
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Enter name price_perunit quantitystock updateDate  UpdateTime");
			g1= addGrocery(sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),list);
			list.add(g1);
			System.out.println("added successfully"); 
			break;                                                   
			
		case 2:
			 g1.setQuantitystock(sc.nextInt());
			 g1.setUpdateDate(LocalDate.now());
			 g1.setUpdateTime(LocalTime.now());
			 System.out.println("set successfully");
			break;
		case 3:GroceryUtils.Display( g1);
			break;
		case 4:if(g1.getQuantitystock()==0) {
			list.remove(g1);
		System.out.println("successfully removed");	
		}
		else System.out.println("Quantity is not Zero");
			break;
		case 5:
			LocalDate currentDate = LocalDate.now();
			for(Grocery g: list) { 
			long daysBetween = ChronoUnit.YEARS.between(g.getUpdateDate(), currentDate);
			System.out.println(daysBetween);
			if(daysBetween<=3) {
				GroceryUtils.Display(g);
			}}
			break;
		case 6:exit=false;
			break;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
}

	private static int calculatePeriod( LocalDate updateDate) {
		

		return 0;
	}
}
