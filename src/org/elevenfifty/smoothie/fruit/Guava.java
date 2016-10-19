package org.elevenfifty.smoothie.fruit;

public class Guava extends Fruit implements Pittable, Peelable {

	public boolean pitted;//set to false by default
	public boolean peeled; 

	public Guava() {
		super("Guava");
		
	}

	@Override
	public void peel() {
		if (!peeled) {
			peeled = true;
			System.out.println("Peeled an " + getName());
		}
	}

	@Override
	public boolean isPeeled() {
		return peeled;
	}

	@Override
	public void pitt() {
		if (!pitted) {
			pitted = true;
			System.out.println("Pitted an " + getName());
		} else {
			System.out.println("Already pitted!");
		}
	}

	@Override
	public boolean isPitted() {
		return pitted;
	}
}
