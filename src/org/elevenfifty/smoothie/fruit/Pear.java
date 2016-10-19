package org.elevenfifty.smoothie.fruit;

public class Pear extends Fruit implements Peelable, Pittable{

public boolean pitted = true;//set to false by default
public boolean peeled = false; 

public Pear() {
	super("Pear");
	
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
