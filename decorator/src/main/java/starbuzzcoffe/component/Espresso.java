package starbuzzcoffe.component;

public class Espresso extends Beverage {

	@Override
	public String description() {
		return "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99F;
	}

}
