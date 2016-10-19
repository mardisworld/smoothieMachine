package org.elevenfifty.smoothie.fruit;

public class Lemon extends Citrus {
	int juiciness;

	public Lemon() {
		super("Lemon");
		setColor("Yellow");
	}

	/**
	 * Sets juciness on a scale from 1 - 100. Values larger than 100 are reduced
	 * to 100 and values lower than 1 are increased to 1.
	 * 
	 * @param juciness
	 */
	public void setJuiciness(int juciness) {
		if (juciness > 100)
			this.juiciness = 100;
		else if (juciness < 1)
			this.juiciness = 1;
		else
			this.juiciness = juciness;
	}
	
}
