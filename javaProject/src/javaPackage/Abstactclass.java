package javaPackage;

public class Abstactclass {

	public static void main(String[] args)
	{
		Maheshphone obj=new sureshphone();
		obj.call();
		obj.move();
		obj.dance();
	}

}
 abstract class Maheshphone 
{
public void call()	
{
	System.out.println("calling...");
}
public abstract void move ();
public abstract void dance();

}
abstract class Rameshphone extends Maheshphone
 {
	 public void move(){
		 System.out.println("moving...");
		 
	 }
 }
class sureshphone extends Rameshphone
{
	public void dance()
	{
		System.out.println("dansing..");
	}
	
	}


	 
	 
 
 
 



