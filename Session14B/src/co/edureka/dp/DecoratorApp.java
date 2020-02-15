package co.edureka.dp;

interface FoodItem{
	String getDecription();
	int getPrice();
}

class VeggieBurger implements FoodItem{
	
	public String getDecription() {
		return "Veggie Burger Loaded with Herbs and Spcies";
	}
	
	public int getPrice() {
		return 100;
	}
}

abstract class FoodDecorator implements FoodItem{
	
	FoodItem item;
	
	FoodDecorator(FoodItem item){
		this.item = item;
	}
	
	public String getDecription() {
		return item.getDecription();
	}
	
	public int getPrice() {
		return item.getPrice();
	}
	
}

class VeggieBurgerMeal extends FoodDecorator{
	
	VeggieBurgerMeal(FoodItem item){
		super(item);
	}
	
	public String getDecription() {
		return item.getDecription() +" Upgraded to Meal with Coke and Fries";
	}
	
	public int getPrice() {
		return item.getPrice() + 80; // Additional 80 Rs added for making Burger a Meal
	}
}

public class DecoratorApp {

	public static void main(String[] args) {
		 FoodItem burger = new VeggieBurger();
		 System.out.println(">> Burger Description: "+burger.getDecription());
		 System.out.println(">> Burger Price: "+burger.getPrice());
		 
		 // We can read this as an input from User :)
		 String choice = "yes";
		 
		 if(choice.equals("yes")) {
			 FoodDecorator meal = new VeggieBurgerMeal(burger);
			 System.out.println(">> Meal Description: "+meal.getDecription());
			 System.out.println(">> Meal Price: "+meal.getPrice());
		 }

	}

}
