package DesignPatterns;

public class DecoyDuck extends Duck{

	public DecoyDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		
	}
	public void display(){
		System.out.println("I'm a real decoy duck");
	}
}
