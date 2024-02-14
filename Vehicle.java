package practice;

public class Vehicle {

	protected String brand;
	protected String color;
	protected int velocity;
	protected int wheels;
	
	public Vehicle(String b,String c,int v,int w) {
		brand = b;
		color = c;
		velocity = v;
		wheels = w;
		System.out.println("The number of wheels is "+wheels);
	}
	
	public void start() {
		System.out.println(this.brand+" is started");
	}
	
	public void accelerate() {
		System.out.println(this.brand+" is accelerating at speed "+this.velocity+" km/h");
	}

	public void brake() {
		System.out.println(this.brand+" is braking");
	}
	
}

class Car extends Vehicle{
	
	private int loader = 5;
	
	public Car(String b,String c,int v,int w,int l) {
		super(b,c,v,w);
		System.out.println("This is a small "+color+" "+brand+", can carry 5 people,"
				+ " actually carrying "+l+" people");
		if(l > loader) System.out.println("The staff is overloaded !"+
				"\nConditions do not match. Cannot start !");
		else {
			loader = l;
			start();
			accelerate();
			brake();
		}
	}
	
	
}

class Truck extends Vehicle{
	
	private int loader = 3;
	private int payload = 5000;
	
	
	public Truck(String b,String c,int v,int w,int l,int p) {
		super(b,c,v,w);
		System.out.println("This is a "+color+" "+brand+", can carry 3 people,"
				+ " actually carrying "+l+" people");
		if(l > loader) System.out.println("The staff is overloaded !");
		System.out.println("This is a "+color+" "+brand+", can carry 5000 kilograms,"
				+ " actually carrying "+p+" kilograms");
		if(p > payload) System.out.println("Weight overload !");
		if(l < loader && p < payload) {
			loader = l;
			payload = p;
			start();
			accelerate();
			brake();
		}
		else System.out.println("Conditions do not match. Cannot start !");
	}
	
}

