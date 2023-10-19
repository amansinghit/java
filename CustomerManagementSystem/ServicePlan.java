package CustomerManagementSystem;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

private  int charge;
private ServicePlan(int charge) {
	this.charge=charge;
}

public void setCharge(int price) {
	this.charge=price;
}
public int getCharge(int price) {
	return this.charge;
}
}