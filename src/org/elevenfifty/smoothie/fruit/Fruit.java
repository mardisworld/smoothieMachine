package org.elevenfifty.smoothie.fruit;

import org.elevenfifty.smoothie.Ingredient;

public abstract class Fruit implements Ingredient {

	private String color;
	private final String name;
	private String origin;

	public Fruit(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public String getOrigin() {
		return origin;
	}

	public final void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Fruit [" + (color != null ? "color=" + color + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (origin != null ? "origin=" + origin : "") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

}