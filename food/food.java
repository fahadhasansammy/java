package food;
//import java.lang.*;

public class food{
    private String name;
    private String ingredients[];
    private double price;
	private float calories;
	public food(){}
	public food(String name,String[] ingredients,double price,float calories){
	    this.name=name;
		this.ingredients=ingredients;
		this.price=price;
		this.calories=calories;
	}
	public void setName(String name){
		this.name=name;
	}
    public void setIngredients(String[] ingredients){
	    this.ingredients=ingredients;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setCalories(float calories){
		this.calories=calories;
	}
	public String getName(){
		return this.name;
	}
	public String[] getIngredients(){
		return this.ingredients;
	}
	public double getPrice(){
		return this.price;
	}
	public float getCalories(){
		return this.calories;
	}
	public void showDetails(){
	    System.out.println("Name: "+name);
		System.out.println("Ingredients: "+ingredients);
		System.out.println("Price: "+price);
		System.out.println("Calories: "+calories);
	}

}
	
