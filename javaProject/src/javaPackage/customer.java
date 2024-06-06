package javaPackage;

public class customer {
	

		String name;
		String sex;
		String address;
		int fee;
		public static void main(String[] args) {
			
			customer obj= new customer();
			obj.name="shivani";
			obj.sex= "female";
			obj.address="edison";
			obj.fee= 2000;
			
			System.out.println("Name of customer1 "+obj.name);
			System.out.println("Sex of customer1 "+obj.sex);
			System.out.println("Address of customer1 "+obj.address);
			System.out.println("Fee of customer1 "+obj.fee);
			
	
	}

}
