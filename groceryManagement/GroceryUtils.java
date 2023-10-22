package groceryManagement;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryUtils {
public static Grocery addGrocery(String name,int price_perunit,int quantitystock,String updateDate,
		String UpdateTime,List<Grocery>list) throws DateTimeParseException{
	Scanner sc=new Scanner(System.in);
	LocalDate date=LocalDate.parse(updateDate);
	LocalTime time=LocalTime.parse(UpdateTime);
	Grocery g1=	new Grocery(name,price_perunit,quantitystock,date,time);
return g1;	
}

//String name, int price_perunit, int  quantitystock, LocalDate updateDate, LocalTime updateTime) {
//super();
//sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next()
public static void Display(Grocery g) {
	System.out.println(g);
}
}