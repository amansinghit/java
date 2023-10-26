package core.com;

import java.time.LocalDate;

public class PToy {
private int id;
private String name;
private Brand names;
private Material name1;
private int stock;
private LocalDate listingDate;
private LocalDate stockUpdateDate;
private double price;
private double discount;
private static int idGenrator=99;

public PToy( String name, Brand names,Material name1, LocalDate listingDate, double price, int stock) {
	super();
	this.id = idGenrator++;
	this.name = name;
	this.names = names;
	this.listingDate = listingDate;
	this.price = price;
	this.stock=stock;
	

}
 
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getListingDate() {
	return listingDate;
}
public void setListingDate(LocalDate listingDate) {
	this.listingDate = listingDate;
}
public LocalDate getStockUpdateDate() {
	return stockUpdateDate;
}
public void setStockUpdateDate(LocalDate stockUpdateDate) {
	this.stockUpdateDate = stockUpdateDate;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}

@Override
public String toString() {
	return "PToy [id=" + id + ", name=" + name + ", names=" + names + ", name1=" + name1 + ", stock=" + stock
			+ ", listingDate=" + listingDate + ", stockUpdateDate=" + stockUpdateDate + ", price=" + price
			+ ", discount=" + discount +"isAvailble"+ "]";
}


}
