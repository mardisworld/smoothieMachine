package org.elevenfifty.smoothie.fruit;

public class Pineapple extends Fruit implements Coreable, Peelable {
	
	public boolean cored;//set to false by default
	public boolean peeled; 
	
	public Pineapple(){
		super("Pineapple");
	}
	
	@Override 
	public void core(){
		if (!cored){
			cored=true;
			System.out.println("Cored a " + getName());
		} else {
			System.out.println("Already cored!");
		}
	}
	
	@Override
	public boolean isCored(){
		return cored;
	}
	
	
	@Override 
	public void peel(){
		if (!peeled){
			peeled=true;
			System.out.println("Peeled a " + getName());
		} else {
			System.out.println("Already peeled!");
		}
	}
	
	@Override
	public boolean isPeeled(){
		return peeled;
	}
	
	
	
}
