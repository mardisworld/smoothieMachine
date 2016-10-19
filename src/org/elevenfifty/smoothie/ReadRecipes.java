package org.elevenfifty.smoothie;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.elevenfifty.smoothie.fruit.Apple;
import org.elevenfifty.smoothie.fruit.Banana;
import org.elevenfifty.smoothie.fruit.Berry;
import org.elevenfifty.smoothie.fruit.Guava;
import org.elevenfifty.smoothie.fruit.Lemon;
import org.elevenfifty.smoothie.fruit.Orange;
import org.elevenfifty.smoothie.fruit.Pear;
import org.elevenfifty.smoothie.fruit.Pineapple;
import org.elevenfifty.smoothie.fruit.Strawberry;
import org.elevenfifty.smoothie.fruit.Watermelon;
import org.elevenfifty.smoothie.other.Rum;

public class ReadRecipes {

	public static void main(String[] args) {
		ReadRecipes readRecipes = new ReadRecipes();//instance of class inside of itself
		final Collection<Recipe> recipes = readRecipes.loadRecipes("recipes.csv");//loadRecipes is only called once
		
		//recipes is a Collection<Recipe> variable that reads in recipes from input file
		//recipes.csv using loadRecipes method 
		
		recipes.stream().forEach(ingredient -> System.out.println(ingredient));//

		//		try { recipes.stream().forEach(ingredient -> System.out.println(ingredient));
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//	}
		
	}

	
	
	//loadRecipe method
	public Collection<Recipe> loadRecipes(String filename) {//sends in recipes.csv, loadRecipes is only called once
		final File recipeFile = new File(filename);
		final Collection<Recipe> recipes = new ArrayList<>();//of Recipes where Recipe has a name and a list of ingredients
		final InputStream recipeStream;//reader allows you to do FileInputStream
		
		try {
			recipeStream = new FileInputStream(recipeFile);
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find the file: " + recipeFile.getAbsolutePath());
			return recipes;
		}

		try (Scanner input = new Scanner(recipeStream)) {//that's when it starts reading that file
			//int i=0;//trying to find out where NullPointerException error occurs
			while (input.hasNextLine()) {
				String[] items = input.nextLine().trim().split(",");
				//i++;//trying to find out where NullPointerException error occurs
				//System.out.println(i);//trying to find out where NullPointerException error occurs
				recipes.add(buildRecipe(items));//calls method buildRecipe, sends in String[]items array
			}//buildRecipe will be called once for each line in recipeFile (3x here)
		} 
		return recipes;//returns Collection<Recipe> of ArrayList<>(); to readRecipes
	}//* end loadRecipes

//	try {
//		recipes.stream().forEach(ingredient -> System.out.println(ingredient));
//	} catch (NullPointerException e) {
//		e.printStackTrace();
//	}
	
	
//	catch(NullPointerException e) {
//		System.out.println("Error:: " + e.getMessage());
//		e.printStackTrace();
//	}
	
	
	
	//buildRecipe method
	//this will be called once for each line in recipeFile(3x here)
	public Recipe buildRecipe(String[] items) {//takes in an array[] of Strings
		Recipe recipe = new Recipe(items[0]);//Recipe name

		for (int i = 1; i < items.length; i++) {// for every ingredient on recipe
			recipe.addIngredient(createIngredient(items[i]));//adds a String onto String[array]
		}

		return recipe;//returning a Recipe to loadRecipe, adds a Recipe to collection of Recipes<>
	}//*end buildRecipe 

	
	
	//Other possibilities If-else, enum, hashMaps, switch case
	public Ingredient createIngredient(String ingredientName) {
		if (equalsIgnoreCase("Banana", ingredientName)) {
			return new Banana();
		} else if ("Strawberry".equalsIgnoreCase(ingredientName)) {
			return new Strawberry();
		} else if ("Apple".equalsIgnoreCase(ingredientName)) {
			return new Apple();
		} else if ("Guava".equalsIgnoreCase(ingredientName)) {
			return new Guava();
		} else if ("Lemon".equalsIgnoreCase(ingredientName)) {
			return new Lemon();
		} else if ("Orange".equalsIgnoreCase(ingredientName)){
			return new Orange();
		} else if ("Pear".equalsIgnoreCase(ingredientName)){
				return new Pear();
		} else if ("Pineapple".equalsIgnoreCase(ingredientName)){
			return new Pineapple();
		} else if("Rum".equalsIgnoreCase(ingredientName)) {
			return new Rum();
		} else if ("Watermelon".equalsIgnoreCase(ingredientName)){
			return new Watermelon();
		} else {
			return null;
		}
	}
//
//		switch (fruitName.toLowerCase()) {
//		case "banana": //NOTE: This is lower case!
//			return new Banana();
//		case "strawberry":
//			return new Strawberry();
//		}
//		// ADVANCED OPTION (Cannot 100% implement here)
//		new HashMap<String, Fruit>();
//		return fruitMap.get(fruitName.toLowerCase());
	

}
