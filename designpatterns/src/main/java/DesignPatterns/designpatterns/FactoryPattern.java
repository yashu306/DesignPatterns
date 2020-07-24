package DesignPatterns.designpatterns;

public class FactoryPattern {
	public static void main(String args[]) {
		Counting c=new FactorAccessing().getSet("vijayawadaarea");
		System.out.println(c.area(10,20));
		System.out.println(c.money(10,20,100000));
	}
}
