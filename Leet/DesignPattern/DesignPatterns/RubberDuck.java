package DesignPatterns;

public class RubberDuck extends Duck{

	public RubberDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		
	}
	public void display(){
		System.out.println("Looks like a redhead duck");
	}
}
