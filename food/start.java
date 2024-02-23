package food;
//import java.lang.*;
public class start {
    public static void main(String args[]){
		food f1=new food("Burger",new String[]{"onion"},100,12.34f);
		food f2=new food();
		System.out.println("Food 1 info is:");
		f1.showDetails();
		System.out.println("Food 2 info is:");
		f2.setName("pizza");
		f2.setIngredients(new String[]{"Potato"});
		f2.setPrice(200);
		f2.setCalories(13.123f);
		f2.showDetails();
	}
}
