package com.dominic.java8.stream;

public class Apple extends Fruit {
	
	String sweetlevel;
	
	Apple(double weight){
		this.weight = weight;
		this.color = "red";
		this.sweetlevel = "too sweet";
		
	}
	
	Apple(double weight,String color,String sweetLevel){
		this.weight = weight;
		this.color = color;
		this.sweetlevel = sweetLevel;
	}

	public String getSweetlevel() {
		return sweetlevel;
	}

	public void setSweetlevel(String sweetlevel) {
		this.sweetlevel = sweetlevel;
	}

	
	
	

}
