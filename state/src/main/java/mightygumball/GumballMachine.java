package mightygumball;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0)
			state = NO_QUARTER;
	}

	public void insertQuarter() {
		switch (state) {
		case HAS_QUARTER:
			System.out.println("You can't insert another quarter");
			break;
		case NO_QUARTER:
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
			break;
		case SOLD_OUT:
			System.out.println("You can’t insert a quarter, the machine is sold out");
			break;
		case SOLD:
			System.out.println("Please wait, we’re already giving you a gumball");
			break;
		}
	}
	
	public void ejectQuarter() {
		switch (state) {
		
		}
	}

	private void print(String value) {
		System.out.println(value);
	}

}
