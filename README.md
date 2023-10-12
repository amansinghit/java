# java
This is my 3rd first repository
package com.app.fruit;

public class Fruits {
	String name;
	String color;
	boolean fresh;
	double weight;
//	Fruits(){}
	public Fruits(String name, String color, boolean fresh, double weight) {
		this.name = name;
		this.color = color;
		this.fresh = fresh;
		this.weight = weight;
	}
	public String toString() {
		return this.name+" "+this.color+" "+this.weight;
	}
}
////1
class apple extends Fruits {
 public apple(String name, String color, boolean fresh, double weight){
	super( name, color, fresh, weight);
}
 public void jam() {
	System.out.println("name of fruit is"+this.name); 
 }
}
/////2
class orange extends Fruits {
	 public orange(String name, String color, boolean fresh, double weight){
		super( name, color, fresh, weight);
	}
public void juice() {
	System.out.println("Name and weight is"+this.name+" "+this.weight+"creating juice");
}
}
////3
class mango extends Fruits {
	 public mango(String name, String color, boolean fresh, double weight){
		super( name, color, fresh, weight);
	}
	 public void pulp() {
		 System.out.println("Name and color is"+this.name+" "+this.color+"making pulp");
	 }
}
//////////////////////////////////////////////////////driver
/////////////////////////////////////////////////////////
package com.app.fruit;
import java.util.*;
// Prompt user for the basket size n create suitable data structure
//4.10 Supply options
//1. Add Mango
//2. Add Orange
//3. Add Apple
//NOTE : You will be ALWAYS adding a fresh fruit in the basket , in all of above options.
public class FruitBasket {

	public static void main(String[] args) {
//		System.out.println("Enter Basket size");
		Scanner sc=new Scanner(System.in);
//		Fruits[] arr=new Fruits[sc.nextInt()];
   Fruits[] arr={(new apple(sc.next(),sc.next() , sc.nextBoolean(), sc.nextDouble())),
                (new orange(sc.next(),sc.next() , sc.nextBoolean(), sc.nextDouble())),
                ( new mango(sc.next(),sc.next() , sc.nextBoolean(), sc.nextDouble()))};
	
	for(Fruits f : arr)
		System.out.println(" name of fruit is"+"  "+f.name);
	
	}
 
}
