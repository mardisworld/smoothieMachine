package org.elevenfifty.smoothie.fruit;

public abstract class Citrus extends Fruit implements Peelable {
	boolean peeled;

	public Citrus(String name) {
		super(name);
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