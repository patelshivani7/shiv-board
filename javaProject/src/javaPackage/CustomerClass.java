package javaPackage;

public class CustomerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createCustomer obj =new createCustomer();
		obj.setName("Harry");
		obj.setSex("Male");
		obj.setAddress("Virgania");
		obj.setAmount(2000);
		System.out.println("The name of customer "+obj.getName());
		System.out.println("The sex of customer "+obj.getSex());
		System.out.println("The address of customer "+obj.getAddress());
		System.out.println("The amount of customer $"+obj.getAmount());

	}

}
class createCustomer
{

private String name; 
private String sex;
private String address;
private int amount;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
}