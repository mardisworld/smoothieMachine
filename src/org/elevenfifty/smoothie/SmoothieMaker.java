package org.elevenfifty.smoothie;

import java.util.ArrayList;
import java.util.Collection;

import org.elevenfifty.smoothie.fruit.Apple;
import org.elevenfifty.smoothie.fruit.Banana;
import org.elevenfifty.smoothie.fruit.Orange;
import org.elevenfifty.smoothie.fruit.Strawberry;
import org.elevenfifty.smoothie.fruit.Watermelon;

public class SmoothieMaker {

	public static void main(String[] args) {
		Collection<Ingredient> fruit = new ArrayList<>();
		fruit.add(new Strawberry());
		fruit.add(new Banana());
		Recipe strawberryBanana = new Recipe("Strawberry Banana Smoothie", fruit);

		Recipe smoothie = new Recipe("Odds & Ends Smoothie");
		smoothie.addIngredient(new Apple());
		smoothie.addIngredient(new Orange());
		smoothie.addIngredient(new Watermelon());
			
		printRecipe(strawberryBanana);
		printRecipe(smoothie);
		
//		smoothie.print();
	}
	
	public static void printRecipe(Recipe recipe) {
		System.out.println("Smoothie: " + recipe.toString()); //calls recipe.toString());
	}

}
