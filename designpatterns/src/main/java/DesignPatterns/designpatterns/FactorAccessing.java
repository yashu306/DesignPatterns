package DesignPatterns.designpatterns;

public class FactorAccessing {
	public Counting getSet(String s) {
		if(s.equals("vijayawadaarea")) {
			return new VijayawadaArea();
		}
		else if(s.equals("gunturarea")) {
			return new GunturArea();
		}
		else if(s.equals("vizagarea")) {
			return new VizagArea();
		}
		else {
			return null;
		}
	}
}
