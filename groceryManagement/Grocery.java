package groceryManagement;

import java.time.LocalDate;
import java.time.LocalTime;

public class Grocery {
private String name;
private  int price_perunit;
private int quantitystock;
 private LocalDate updateDate;
private LocalTime  UpdateTime;
public Grocery(String name, int price_perunit, int  quantitystock, LocalDate updateDate, LocalTime updateTime) {
	super();
	this.name = name;
	this.price_perunit = price_perunit;
	this. quantitystock =  quantitystock;
	this.updateDate = updateDate;
	this.UpdateTime = updateTime;
}
public String getName() {
	return name;
}
public int getPrice_perunit() {
	return price_perunit;
}
public LocalDate getUpdateDate() {
	return updateDate;
}
public int getQuantitystock() {
	return quantitystock;
}
@Override
public String toString() {
	return "Grocery [name=" + name + ", price_perunit=" + price_perunit + ", stock=" +
     quantitystock;
}
public void setQuantitystock(int quantitystock) {
	this.quantitystock = quantitystock;
}
public void setUpdateDate(LocalDate updateDate) {
	this.updateDate = updateDate;
}
public void setUpdateTime(LocalTime updateTime) {
	UpdateTime = updateTime;
}



}
