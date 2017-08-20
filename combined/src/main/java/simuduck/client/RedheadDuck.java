package simuduck.client;

import simuduck.behavior.Quackable;

public class RedheadDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
