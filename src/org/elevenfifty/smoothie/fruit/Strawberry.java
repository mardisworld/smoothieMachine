package org.elevenfifty.smoothie.fruit;

public final class Strawberry extends Fruit implements Washable {
	boolean washed;
	
	public Strawberry() {
		super("Strawberry");
	}
	
	@Override
	public void wash() {
		if (!washed) {
			washed = true;
			System.out.println("Washed some " + getName());
		} else {
			System.out.println("Already washed!");
		}
	}

	@Override
	public boolean isWashed() {
		return washed;
	}
}
