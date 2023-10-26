package Tester;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import core.com.PToy;
import petsutils.Utils;

public class Main {
	public static void display() {
		System.out.println("Press 1 for Add new Toy in stock");
		System.out.println("Press 2 for Update stock of toy");
		System.out.println("Press 3 for Set Discount of 25% which are 1 year old");
		System.out.println("Press 4 for REmove toys are never sold once in 9 months");
		System.out.println("Press 5 for Add new Toy in stock");

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<PToy> list = new ArrayList<>();
			boolean exit = true;
			PToy toy = null;
			while (exit) {
				display();
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter name, brand name, material name,Listing date, price ");
						toy = Utils.AddToy(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());
						list.add(toy);
						toy.setStockUpdateDate(toy.getListingDate());// when new product is listed then listing date and																		// updated date will same.
						System.out.println("Toy Added Succfully");
						break;
					case 2:
						System.out.println("Enter Number by which you want to update");
						toy.setStock(sc.nextInt());

						System.out.println("Stock updated successfully");
						break;
					case 3:
						int months = (int) ChronoUnit.MONTHS.between(LocalDate.now(), toy.getListingDate());
						if (months > 12) {
							System.out.println("enter discount");
							// Double discount=toy.getPrice()*(0.25);
							toy.setDiscount(toy.getPrice() * (0.25));
							toy.setPrice(toy.getPrice() - toy.getDiscount());
							System.out.println("25% Discoun Available on All toys Which are 1 year or 12 month old");
						}
						break;
					case 4:
						int month = (int) ChronoUnit.MONTHS.between(LocalDate.now(), toy.getListingDate());
						if (month > 9) {
							list.remove(toy);
							System.out.println("Toys Which are never sold once  in 1 year are Remove successFully ");
						}
						break;
					case 5:
						exit = false;
						System.out.println("Thank you ");
						break;

					}
				} catch (Exception e) {
					e.getStackTrace();
					System.out.println("Error handled");
				}

			}

			System.out.println("Main Over");

		}

	}

}
