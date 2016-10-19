package org.elevenfifty.smoothie.fruit;

public class Banana extends Fruit implements Peelable {
	boolean peeled;

	public Banana() {
		super("Banana");
	}

	@Override
	public void peel() {
		if (!peeled) {
			peeled = true;
			System.out.println("Peeled a " + getName());
		} else {
			System.out.println("Already peeled!");
		}
	}

	@Override
	public boolean isPeeled() {
		return peeled;
	}
}