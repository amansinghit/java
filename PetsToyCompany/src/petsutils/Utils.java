package petsutils;

import java.time.LocalDate;

import core.com.Brand;
import core.com.Material;
import core.com.PToy;
import customerException.CustomerException;

public class Utils {
	public static PToy AddToy(String name, String brandName, String materialName, String ListingDate, double price,
			int stock) throws  CustomerException{
		
		Brand brand = Brand.valueOf(brandName.toUpperCase());
		Material material = Material.valueOf(materialName.toUpperCase());
		LocalDate date = LocalDate.parse(ListingDate);
		PToy p1 = new PToy(name, brand, material, date, price,stock);

		return p1;
         
	}

}
//"Enter name, brand name, material name,Listing date, price ,discount");