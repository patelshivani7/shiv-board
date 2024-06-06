package javaPackage;
interface waterbottle
{
	String color="blue";
	
	void fillup();
	void pourout();
	
	
}


public class Interfaceclass implements waterbottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(color);
Interfaceclass obj=new Interfaceclass();
obj.fillup();
obj.pourout();

	}

	@Override
	public void fillup() {
		// TODO Auto-generated method stub
		System.out.println("it is filled");
		
	}

	@Override
	public void pourout() {
		// TODO Auto-generated method stub
		System.out.println("it is pourout");
		
	}

}
